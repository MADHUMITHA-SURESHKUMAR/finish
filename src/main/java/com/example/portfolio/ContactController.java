package com.example.portfolio;

import com.example.portfolio.Contact;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    @PostMapping("/contact")
    public String saveContact(@RequestBody Contact contact) {

        System.out.println(contact.getName());
        System.out.println(contact.getEmail());
        System.out.println(contact.getMessage());

        return "Message received successfully!";
    }
}