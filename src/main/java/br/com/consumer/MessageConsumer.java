package br.com.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "TEST.FOO")
    public void receiveMessage(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
