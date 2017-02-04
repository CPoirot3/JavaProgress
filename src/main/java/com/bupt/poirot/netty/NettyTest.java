package com.bupt.poirot.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Created by hui.chen on 2/3/17.
 */
public class NettyTest {
    public static void main(String[] args) {
        Channel channel = null;
        ChannelFuture channelFuture = channel.bind(new InetSocketAddress(8080));

        channelFuture.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture future) throws Exception {
                if (future.isSuccess()) {
                    ByteBuf byteBuf = Unpooled.copiedBuffer("hello", Charset.defaultCharset());
                    ChannelFuture wf = future.channel().writeAndFlush(byteBuf);
                } else {
                    Throwable error = future.cause();
                    error.printStackTrace();
                }
            }
        });

    }
}
