package com.example.demo.service;

import com.example.demo.bo.CreateSuggestionRequest;

public interface SuggestionProcessor {

     void process( CreateSuggestionRequest suggestion);

//    @Override
//    public int compare(processSuggestion o1, processSuggestion o2) {
//        return o1.getTitle().compareTo(o2.getTitle());
//    }

}