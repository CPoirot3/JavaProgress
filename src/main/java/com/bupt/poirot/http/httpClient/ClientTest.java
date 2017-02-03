package com.bupt.poirot.http.httpClient;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by hui.chen on 2/1/17.
 */
public class ClientTest {

    public static URI constructURI() {
        URI uri = null;
        try {
            uri = new URIBuilder().setScheme("http").setHost("www.baidu.com")
                    .setPath("/").setParameter("q", "nba").build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }

    public static HttpGet constructHttpGet() {
        URI uri = constructURI();
        HttpGet httpGet = new HttpGet(uri);
        System.out.println(httpGet);
        return httpGet;
    }

    public static HttpPost constructHttpPost() {
        URI uri = constructURI();
        HttpPost httpPost = new HttpPost(uri);
        httpPost.setEntity(new BasicHttpEntity());
        return httpPost;
    }

    public static void main(String[] args) {

        constructHttpGet();





        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://www.baidu.com/");
        try {
            CloseableHttpResponse response = httpclient.execute(httpget);
            HttpEntity httpEntity = response.getEntity();
            System.out.println(EntityUtils.toString(httpEntity, Consts.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
