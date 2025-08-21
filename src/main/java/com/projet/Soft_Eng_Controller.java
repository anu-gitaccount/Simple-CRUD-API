package com.projet;

// New Api

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/software-engineer")  // for versioning

public class Soft_Eng_Controller {



    // @PostMapping
    // @PutMapping
    // @DeleteMapping

    private final Soft_eng_Service soft_eng_service;

    public Soft_Eng_Controller (Soft_eng_Service soft_eng_service) {
        this.soft_eng_service = soft_eng_service;
    }


    // Will return List of Software eng
    // For Reterival or GET request we annotate this
    @GetMapping
    public List<Soft_Eng> get_eng() {
        return soft_eng_service.get_Soft_eng();
    }

    public void add_new_soft_eng(Soft_Eng soft_eng) {
        soft_eng_service.insert_soft_eng(soft_eng);
    }
}


/*
    Result

     % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100    88    0    88    0     0  21087      0 --:--:-- --:--:-- --:--:-- 22000

    its a json

[
  {
    "_id": 1,
    "_name": "Ami",
    "_position": "SDE1"
  },
  {
    "_id": 2,
    "_name": "Amis",
    "_position": "SDE2"
  }
]

curl http://localhost:8080/api/v1/software-engineer | jq

 */
