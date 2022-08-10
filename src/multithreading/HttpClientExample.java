package multithreading;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientExample {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        //java 11 new httpcleint
        //Apache HttpCLient or OKHttp
        //it support both http/1.1 and http/2
        /**
         * by default request will be send using HTTP/2
         * request will be downgraded to http/1.1 if the server do not support http/2
         */
        HttpClient httpClient=HttpClient.newHttpClient();
        HttpRequest httpRequest=HttpRequest.newBuilder().uri(URI.create("https://www.ldapsoft.com")).build();

        HttpResponse<String> httpResponse=httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body().getBytes(StandardCharsets.UTF_8));

        CompletableFuture<Void> future=httpClient.sendAsync(httpRequest,HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
        future.get();

    }
}
