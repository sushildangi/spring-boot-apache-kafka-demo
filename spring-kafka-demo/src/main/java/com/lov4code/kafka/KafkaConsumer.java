package com.lov4code.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "lov4code", groupId = "myGroup")
    public void consume(String message) {
        log.info("Massage received -> {}", message);
    }
}
