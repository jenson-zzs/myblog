package com.zzs.myblogkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tyler
 * @date 2020/7/29
 */

@RestController
@RequestMapping("api/")
public class SendController {
    @Autowired
    private TestStream testStream;

    @GetMapping("send")
    public void send() {
        new Thread(()-> {
            int i=0;
            while (true){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                testStream.testOut().send(MessageBuilder.withPayload("Hello World..."+i++).build());
            }
        }).start();

    }
}