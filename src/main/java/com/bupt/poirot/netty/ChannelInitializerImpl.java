package com.bupt.poirot.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;

/**
 * Created by hui.chen on 2/11/17.
 */
public class ChannelInitializerImpl extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel channel) throws Exception {
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast(new HttpClientCodec());
        channelPipeline.addLast(new HttpObjectAggregator(Integer.MAX_VALUE));
    }
}
