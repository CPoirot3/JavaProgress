package com.bupt.poirot.http.blockingIO;

import org.apache.http.HttpVersion;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.message.LineFormatter;
import org.apache.http.util.CharArrayBuffer;

/**
 * Created by hui.chen on 2/1/17.
 */
public class ParseAndFormatTest {
    public static void main(String[] args) {
        LineFormatter lineFormatter = new BasicLineFormatter();
        CharArrayBuffer buff = new CharArrayBuffer(64);
        lineFormatter.formatRequestLine(buff, new BasicRequestLine("Get", "/", HttpVersion.HTTP_1_1));
        System.out.println(buff.toString());

        System.out.println();

        lineFormatter.formatHeader(buff, new BasicHeader("content-type", "text/plain"));

        System.out.println(buff);



        System.out.println();

    }
}
