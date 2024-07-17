package ru.alina.kafkaproducerforcreditbroker.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.alina.kafkaproducerforcreditbroker.dto.UserDto;

@Service
public class CreditService {
    private final static Logger LOG = LoggerFactory.getLogger(CreditService.class);
    @Value("${kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, UserDto> kafkaTemplate;

    public CreditService(KafkaTemplate<String, UserDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void creditApplication(UserDto userDto) {
        LOG.debug("credit application for user: {}", userDto);
        kafkaTemplate.send(topic, userDto);
    }
}
