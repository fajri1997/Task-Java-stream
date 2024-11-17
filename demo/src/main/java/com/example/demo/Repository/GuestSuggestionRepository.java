package com.example.demo.Repository;

import com.example.demo.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long > {

//    List<GuestSuggestionEntity> findByStatus(Status status);
//    Optional<GuestSuggestionEntity> findByUsername(String username);

}
