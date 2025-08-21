package com.projet;
import java.util.*;

// This class will handle all the business logic

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class Soft_eng_Service {

    private Soft_eng_repository soft_eng_repository;


    // Now add to the Constructor
    public Soft_eng_Service(Soft_eng_repository soft_eng_repository) {
        this.soft_eng_repository = soft_eng_repository;
    }

    // Methods
    public List<Soft_Eng> get_Soft_eng() {
        // findAll() is sql method to get all the entities in table
        return soft_eng_repository.findAll();
    }

    @PostMapping
    public void insert_soft_eng(Soft_Eng soft_eng) {
        soft_eng_repository.save(soft_eng);
    }

}
