package com.Learning.MovieTicket.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.Learning.MovieTicket.resource.TicketMessage;
import com.Learning.MovieTicket.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationConsumer {


    ObjectMapper mapper=new ObjectMapper();

    @Autowired
    NotificationService notificationService;

    @KafkaListener(topics = {"TICKET_BOOKED"},groupId = "ticketGroup")
    public void sendNotification(String message) throws JsonProcessingException {
        log.info("message ->{}",message);
        TicketMessage msg=mapper.readValue(message,TicketMessage.class);

        notificationService.sendNotification(msg);

    }
}
