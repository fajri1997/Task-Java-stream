package com.example.demo.controller;

import com.example.demo.entity.GuestSuggestionEntity;
import com.example.demo.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class SuggestionStatusController {

    @Autowired
    private GuestSuggestionService guestSuggestionService;

     @GetMapping("/create")
    public List<GuestSuggestionEntity> getAllCreatedSuggestions() {
        return guestSuggestionService.findAllCreatedSuggestions();
    }

     @GetMapping("/remove")
    public List<GuestSuggestionEntity> getAllRemovedSuggestions() {
        return guestSuggestionService.findAllRemovedSuggestions();
    }
}
