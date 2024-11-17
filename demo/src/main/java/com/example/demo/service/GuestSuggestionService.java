package com.example.demo.service;


import com.example.demo.Repository.GuestSuggestionRepository;
import com.example.demo.bo.CreateSuggestionRequest;
import com.example.demo.entity.GuestSuggestionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class GuestSuggestionService {

    private GuestSuggestionRepository guestSuggestionRepository;

    //    GuestSuggestionRepository savedUser = guestSuggestionRepository.save(user);
      SuggestionProcessor processSuggestion = suggestion -> {
        if (suggestion == null) {
            System.out.println("Suggestion cannot be null");
         }
            GuestSuggestionEntity entity = new GuestSuggestionEntity();
            entity.setSuggestionText(suggestion.getSuggestionText( ));
            entity.setRate(suggestion.getRate());
            guestSuggestionRepository.save(entity);
    };
      public void printAndProcessSuggestion(CreateSuggestionRequest request){

          processSuggestion.process(request);
      }

    @Autowired
    public GuestSuggestionService(GuestSuggestionRepository guestSuggestionRepository) {
        this.guestSuggestionRepository = guestSuggestionRepository;
    }


    public  List<GuestSuggestionEntity> getAllSuggestions(){

          return guestSuggestionRepository.findAll();
    }
}
