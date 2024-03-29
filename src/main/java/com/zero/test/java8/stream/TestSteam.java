package com.zero.test.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * com.zero.test.java8
 *
 * @author caofengnian
 * @Date 2019-09-29
 */
public class TestSteam {
    
    public static void main(String[] args) {
        List<Transaction> transactions = new LinkedList<>();
        transactions.add(new Transaction(1, 10, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(3, 30, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(6, 60, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(5, 50, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(2, 20, Transaction.Type.A));
        transactions.add(new Transaction(4, 40, Transaction.Type.C));
        //sortList(transactions);
        parallel(transactions);
    }
    
    /**
     * 排序
     *
     * @param transactions
     */
    private static void sortList(List<Transaction> transactions) {
        // JDK 7 发现type为grocery的所有交易
        List<Transaction> groceryTransactions = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getType() == Transaction.Type.GEOCERY) {
                groceryTransactions.add(t);
            }
        }
        // 集合排序 交易值降序排序
        Collections.sort(groceryTransactions, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        // 交易ID 获取
        List<Integer> transactionIds = new ArrayList<>();
        for (Transaction t : groceryTransactions) {
            transactionIds.add(t.getId());
        }
        
        //[6, 5, 3, 1]
        System.out.println(transactionIds);
        // JDK 8 如果发现type为grocery的所有交易, 然后返回以交易值降序排序的交易ID集合
        List<Integer> transactionsIds = transactions.parallelStream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList());
        
        //[6, 5, 3, 1]
        System.out.println(transactionsIds);
    }
    
    private static void parallel(List<Transaction> transactions) {
        transactions.parallelStream().forEach(x -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(x.getId());
        });
    }
}