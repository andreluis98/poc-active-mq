package br.com.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    @JmsListener(destination = "TEST.FOO")
    public void receiveMessage(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
