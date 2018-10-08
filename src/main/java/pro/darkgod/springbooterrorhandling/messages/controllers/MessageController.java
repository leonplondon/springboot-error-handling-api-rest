package pro.darkgod.springbooterrorhandling.messages.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.darkgod.springbooterrorhandling.error.EmptyDataException;
import pro.darkgod.springbooterrorhandling.error.EntityNotFoundException;
import pro.darkgod.springbooterrorhandling.messages.models.Message;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @PostMapping
    public Message create(Message message) throws Exception {
        throw new EntityNotFoundException();
    }

    @PutMapping
    public Message update(Message message) throws Exception {
        throw new EmptyDataException();
    }
}