package com.example.demo.entity;


 import com.example.demo.util.SuggestionStatus;
 import jakarta.persistence.*;

@Entity
 public class GuestSuggestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private double rate;
    private String suggestionText;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private SuggestionStatus status;

    public SuggestionStatus getStatus() {
        return status;
    }

    public void setStatus(SuggestionStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }


    @Override
    public String toString() {
        return "GuestSuggestionEntity{" +
                "id=" + id +
                ", rate=" + rate +
                ", suggestionText='" + suggestionText + '\'' +
                '}';
    }
}
