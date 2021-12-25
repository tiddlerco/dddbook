package com.example.bank.messaging;

import com.example.bank.domain.types.AuditMessage;

/**
 * @title: AuditMessageProducerImpl
 * @Author yuke
 * @Date: 2021/12/25 21:48
 */
public class AuditMessageProducerImpl implements AuditMessageProducer {

    private static final String TOPIC_AUDIT_LOG = "TOPIC_AUDIT_LOG";

//    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(AuditMessage message) {
        String messageBody = message.serialize();
//        kafkaTemplate.send(TOPIC_AUDIT_LOG, messageBody);
    }
}
