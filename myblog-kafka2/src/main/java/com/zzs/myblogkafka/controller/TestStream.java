package com.zzs.myblogkafka.controller;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Tyler
 * @date 2020/7/28
 */

public interface TestStream {
    String INPUT = "test-in";
    String OUTPUT = "test-out";
    @Input(INPUT)
    SubscribableChannel testIn();
    @Output(OUTPUT)
    MessageChannel testOut();
}