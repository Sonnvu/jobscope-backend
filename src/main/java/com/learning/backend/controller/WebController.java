package com.learning.backend.controller;

import com.learning.backend.domain.model.guest.Guest;
import com.learning.backend.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WebController {

    private final RequestService requestService;

    @Autowired
    public WebController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/home")
    public ResponseEntity<Map<String, String>> defaultHomePage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "API ENDPOINT HIT!!!");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user/{id}")
    public Guest getUser(@PathVariable Long id) {
        Guest guest = new Guest();
        guest.setId(id);
        guest.setName("John Cena");
        guest.setAge(25);
        return guest;
    }

//    @GetMapping("/job-postings/{keyword}")
//    public String getJobPosting(@PathVariable String keyword) {
//        return requestService.getCompanyJobPostings(keyword);
//    }
}
