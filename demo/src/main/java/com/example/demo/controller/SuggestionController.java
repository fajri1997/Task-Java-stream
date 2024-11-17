package com.example.demo.controller;

import com.example.demo.bo.CreateSuggestionRequest;
import com.example.demo.entity.GuestSuggestionEntity;
import com.example.demo.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SuggestionController {


@Autowired
private final GuestSuggestionService guestSuggestionService;

    public SuggestionController(GuestSuggestionService guestSuggestionService) {
        this.guestSuggestionService = guestSuggestionService;
    }


    @PostMapping("/suggestions")
    public ResponseEntity<String> processSuggestion(@RequestBody CreateSuggestionRequest suggestion) {

        guestSuggestionService.printAndProcessSuggestion(suggestion);
        return  ResponseEntity.ok("suggestions added successfully");
     }


     @GetMapping("/suggestions")
     public  ResponseEntity<List<GuestSuggestionEntity>> getSuggestions ( ) {

        List<GuestSuggestionEntity> listOfSuggestions = guestSuggestionService.getAllSuggestions();
        return ResponseEntity.ok(listOfSuggestions);
     }

}
