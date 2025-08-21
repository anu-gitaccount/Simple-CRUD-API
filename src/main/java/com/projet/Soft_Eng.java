package com.projet;

import java.util.*;
import java.util.Objects;

import jakarta.persistence.*;


//  To perfom CRUD operation (Create, Remove, Update, Delete

// anotate this class as entity
@Entity
//@Table(name = "soft_eng")
public class Soft_Eng {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Define some Properties to this class
    private Integer id;
    private String name;
    private String position;

    public Soft_Eng() {
    }

    // Create a constructor that gets the value

    public Soft_Eng(Integer id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Create a getter and setter methods
    public Integer get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public String get_position() {
        return position;
    }

    public void set_id(Integer id) {
        this.id = id;
    }

    public void set_name(String name) {
        this.name = name;
    }


    public void set_position(String position) {
        this.position = position;
    }

    // Now Equal() ->  this methods checks if two obj is equally logically
    // It compares refrences (checks if they are same in memory)


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {     // same object
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
            return false;

        // Now create a object and check value
        Soft_Eng se = (Soft_Eng) obj;

        return Objects.equals(id, se.id) && name.equals(se.name) && position.equals(se.position);
        // return Objects.equals(id, se.id) && Objects.equals(name, se.name);
    }

    // hashcode() method  - returns int hash value for the object
    @Override
    public int hashCode() {
        return Objects.hash(id, name, position);
    }
}
