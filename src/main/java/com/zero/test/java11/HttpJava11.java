package com.zero.test.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * <br>
 * 〈功能详细描述〉
 * PACKAGE_NAME
 *
 * @author 17112411 2018/10/30 15:15
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class HttpJava11 {
    public static void main(String[] args) throws Exception {
        var uri = "http://www.baidu.com";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
