package com.bupt.poirot.http;

import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created by hui.chen on 2017/1/10.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HttpRequest request = new BasicHttpRequest("GET", "/",
                HttpVersion.HTTP_1_1);
        System.out.println(request.getRequestLine().getMethod());
        System.out.println(request.getRequestLine().getUri());
        System.out.println(request.getProtocolVersion());
        System.out.println(request.getRequestLine().toString());

        System.out.println();
        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
                HttpStatus.SC_OK, "OK");
        response.addHeader("Set-Cookie",
                "c1=a; path=/; domain=localhost");
        response.addHeader("test",
                "c2=b; path=\"/\", c3=c; domain=\"localhost\"");


        HttpEntity fileEntity = new FileEntity(new File("build.gradle"));
        System.out.println(fileEntity.getContentLength());

        StringEntity entity = new StringEntity("你好", Consts.UTF_8);
        System.out.println(EntityUtils.toString(entity));

        HeaderElementIterator it = new BasicHeaderElementIterator(
                response.headerIterator("test"));
        while (it.hasNext()) {
            HeaderElement elem = it.nextElement();

            System.out.println(elem.getName() + " = " + elem.getValue());
            NameValuePair[] params = elem.getParameters();
            for (int i = 0; i < params.length; i++) {
                System.out.println("     " + params[i]);
            }
        }

    }
}
