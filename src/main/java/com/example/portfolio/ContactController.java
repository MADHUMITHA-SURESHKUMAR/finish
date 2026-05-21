package com.example.portfolio;

import com.example.portfolio.Contact;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ContactController {

    @PostMapping("/contact")
    public String save(@RequestBody Contact contact) {
        return "Message received";
    }
}
