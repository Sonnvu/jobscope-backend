package com.learning.backend.security;

import com.learning.backend.security.model.Credentials;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication {
    public Authentication() {

    }

    @PostMapping("/auth/signup")
    public String userInput(@RequestBody Credentials credentials) {
        return credentials.getFirstName();
    }
}
