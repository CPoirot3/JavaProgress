package com.bupt.poirot.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.DefaultByteBufHolder;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.ReferenceCounted;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Created by hui.chen on 2/3/17.
 */
public class NettyTest {
    public static void main(String[] args) {
//        Channel channel = null;
//        ChannelFuture channelFuture = channel.bind(new InetSocketAddress(8080));
//
//        channelFuture.addListener(new ChannelFutureListener() {
//            @Override
//            public void operationComplete(ChannelFuture future) throws Exception {
//                if (future.isSuccess()) {
//                    ByteBuf byteBuf = Unpooled.copiedBuffer("hello", Charset.defaultCharset());
//                    ChannelFuture wf = future.channel().writeAndFlush(byteBuf);
//                } else {
//                    Throwable error = future.cause();
//                    error.printStackTrace();
//                }
//            }
//        });

        ByteBuf byteBuf = Unpooled.compositeBuffer();
        for (int i = byteBuf.readerIndex(); i < byteBuf.writerIndex(); i++) {
            System.out.println((char) byteBuf.getByte(i));
        }
        System.out.println(byteBuf.writableBytes());

        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks!", utf8);
        ByteBuf sliced = buf.slice(0, 15);
        System.out.println(sliced.toString(utf8));
        buf.setByte(0, (byte)'J');
        ByteBufHolder byteBufHolder = new DefaultByteBufHolder(buf);


        assert buf.getByte(0) == sliced.getByte(0);
    }
}
