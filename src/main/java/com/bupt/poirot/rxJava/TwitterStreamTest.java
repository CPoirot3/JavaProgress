package com.bupt.poirot.rxJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by hui.chen on 2016/12/28.
 */
public class TwitterStreamTest {

    public static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStreamFactory().getInstance(); twitterStream.addListener(new twitter4j.StatusListener() {
            @Override
            public void onStatus(Status status) { log.info("Status: {}", status);
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {

            }

            @Override
            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {

            }

            @Override
            public void onScrubGeo(long userId, long upToStatusId) {

            }

            @Override
            public void onStallWarning(StallWarning warning) {

            }

            @Override
            public void onException(Exception ex) { log.error("Error callback", ex);
            }
            //other callbacks
        });
        twitterStream.sample();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        twitterStream.shutdown();
    }
}
