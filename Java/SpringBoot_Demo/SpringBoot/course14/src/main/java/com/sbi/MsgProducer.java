package com.sbi;

import jakarta.annotation.Resource;
import jakarta.jms.Destination;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

/**
 * @author haoran.xu
 * @date 2025/03/19 16:04
 **/

@Service
public class MsgProducer {

    //注入JmsMessagingTemplate模板
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage(Destination destination,String msg){
        jmsMessagingTemplate.convertAndSend(destination,msg);
    }

}