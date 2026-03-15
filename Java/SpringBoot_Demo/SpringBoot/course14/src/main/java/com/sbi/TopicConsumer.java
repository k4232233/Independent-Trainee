package com.sbi;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author haoran.xu
 * @date 2025/03/19 16:34
 **/
@Service
public class TopicConsumer {
    @JmsListener(destination = ActiveMqConfig.TOPIC_NAME,containerFactory = "topicListenerContainer")
    public void receiveTopic(String msg) {
        System.out.println("接收的消息为：" + msg);
    }
}