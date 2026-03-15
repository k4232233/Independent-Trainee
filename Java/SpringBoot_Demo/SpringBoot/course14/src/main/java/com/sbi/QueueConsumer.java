package com.sbi;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @author haoran.xu
 * @date 2025/03/19 16:13
 **/

@Service
public class QueueConsumer {
    /**
     * 接收点对点消息
     *
     * @param msg
     */
    @JmsListener(destination = ActiveMqConfig.QUEUE_NAME)
    public void receiveQueueMsg(String msg) {
        System.out.println("接收的消息为：" + msg);
    }
}