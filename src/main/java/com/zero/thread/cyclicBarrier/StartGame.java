package com.zero.thread.cyclicBarrier;

import java.io.IOException;
import java.util.concurrent.CyclicBarrier;

/**
 * <br>
 * 〈功能详细描述〉
 * test.thread.cyclicBarrier
 * 通过对战游戏学习CyclicBarrier
 *
 * @author 17112411 2018/9/19 16:05
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class StartGame implements Runnable {


    private String player;

    private CyclicBarrier barrier;

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public StartGame(String player, CyclicBarrier barrier) {
        this.player = player;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getPlayer() + " 开始匹配玩家...");
            findOtherPlayer();
            barrier.await();
            System.out.println(this.getPlayer() + " 进行选择角色...");
            choiceRole();
            System.out.println(this.getPlayer() + " 角色选择完毕等待其他玩家...");
            barrier.await();
            System.out.println(this.getPlayer() + " 开始游戏,进行游戏加载...");
            loading();
            System.out.println(this.getPlayer() + " 游戏加载完毕等待其他玩家加载完成...");
            barrier.await();
            start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findOtherPlayer() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void choiceRole() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void loading() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        CyclicBarrier barrier = new CyclicBarrier(5, () -> {
            try {
                System.out.println("阶段完成，等待2秒...");
                Thread.sleep(2000);
                System.out.println("进入下个阶段...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread player1 = new Thread(new StartGame("1", barrier));
       /* Thread player2 = new Thread(new StartGame("2", barrier));
        Thread player3 = new Thread(new StartGame("3", barrier));
        Thread player4 = new Thread(new StartGame("4", barrier));
        Thread player5 = new Thread(new StartGame("5", barrier));*/
        player1.start();
      /*  player2.start();
        player3.start();
        player4.start();
        player5.start();*/
        System.in.read();
    }
}
