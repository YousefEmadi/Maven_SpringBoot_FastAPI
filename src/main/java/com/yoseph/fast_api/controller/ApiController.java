package com.yoseph.fast_api;

import com.yoseph.fast_api.model.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private List<Message> messages = new ArrayList<>();

    @PostConstruct
    public void init() {
        // dummy test message
        messages.add(new Message("Welcome to mini API!", "Yoseph"));
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }

    @PostMapping("/messages")
    public Message addMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
    }
}
