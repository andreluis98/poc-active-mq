package br.com.controller;

import br.com.service.MessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageProducerService messageProducerService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        messageProducerService.sendMessage("TEST.FOO", message);
        return "Mensagem enviada: " + message;
    }
}
