package com.sbi;

import jakarta.annotation.Resource;
import jakarta.jms.Destination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoran.xu
 * @date 2025/03/19 16:08
 **/
@RestController
@RequestMapping("/activemq")
public class ActiveMqController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ActiveMqController.class);

    @Resource
    private MsgProducer producer;
    @Autowired
    private Destination queue;
    @Autowired
    private Destination topic;

    @RequestMapping("/send/queue")
    public String sendQueueMessage(){
        LOGGER.info("===开始发送点对点消息===");
        producer.sendMessage(queue,"Queue:hello activemq!");
        return "ok";
    }

    @RequestMapping("/send/topic")
    public String sendTopicMessage(){
        LOGGER.info("===开始发送订阅消息===");
        producer.sendMessage(topic,"Topic:hello activemq!");
        return "ok";
    }
}