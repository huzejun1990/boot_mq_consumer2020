package com.dream.boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

/**
 * @Author: huzejun
 * @Date: 2021/1/2 13:44
 */
@Component
public class Queue_Consumer {
    // ${myQueue}
    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息："+textMessage.getText());
    }


}
