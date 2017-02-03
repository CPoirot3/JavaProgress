package com.bupt.poirot.http.blockingIO;


import org.apache.http.HttpConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultBHttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpRequestHandlerMapper;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.UriHttpRequestHandlerMapper;
import org.apache.http.ssl.SSLContexts;
import org.apache.kafka.common.security.ssl.SslFactory;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by hui.chen on 1/31/17.
 */
public class ConnectionTest {
    public static void main(String[] args) {
        HttpConnection httpConnection = new DefaultBHttpClientConnection(10000);

        HttpServerConnection httpServerConnection = new DefaultBHttpServerConnection(100000);
        HttpContext httpContext = new BasicHttpContext();


        UriHttpRequestHandlerMapper mapper = new UriHttpRequestHandlerMapper();

        HttpProcessor httpProcessor = new HttpProcessor() {
            @Override
            public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {

            }

            @Override
            public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {

            }
        };


        HttpRequestHandler requestHandler = new HttpRequestHandler() {
            @Override
            public void handle(HttpRequest request, HttpResponse response, HttpContext context) throws HttpException, IOException {

            }
        };


        HttpService httpService = new HttpService(httpProcessor, mapper);
        try {
            httpService.handleRequest(httpServerConnection, httpContext);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (HttpException e) {

            System.out.println(" fatal error , shutdown forcibly");
            e.printStackTrace();
        }

        SSLContext sslContext = SSLContexts.createSystemDefault();
        SocketFactory socketFactory = sslContext.getSocketFactory();
        try {
            SSLSocket sslSocket = (SSLSocket) socketFactory.createSocket("localhost", 443);
            sslSocket.setEnabledProtocols(new String[] {"TLSv1", "TLSv1.1", "TLSv1.2"});
            sslSocket.setEnabledCipherSuites(new String[] {
                    "TLS_RSA_WITH_AES_256_CBC_SHA"
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
