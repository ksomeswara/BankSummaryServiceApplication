package com.multiagenframework.banksummaryserviceapplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BankSummaryService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public BankSummaryService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "bank-summary-topic", groupId = "bank-summary-group")
    public void consumeMessage(String message) {
        String bankSummary = "Static Bank Summary: Account Balance $1000";
        kafkaTemplate.send("pdf-generation-topic", bankSummary);
    }
}

