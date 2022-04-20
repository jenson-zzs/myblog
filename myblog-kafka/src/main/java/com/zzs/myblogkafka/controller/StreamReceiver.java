package com.zzs.myblogkafka.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author Tyler
 * @date 2020/7/28
 */

@Component
@EnableBinding(value = {TestStream.class})
public class StreamReceiver {

    @StreamListener(TestStream.INPUT)
    public void receive(String message) {
        System.out.println("StreamReceiver: "+message);
    }
}