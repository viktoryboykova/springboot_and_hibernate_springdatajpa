package com.example.springboot_and_hibernate.model.dto;

import com.example.springboot_and_hibernate.model.Cat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CatDTO {
    @JsonIgnore
    private int id;

    private String name;

    private int age;

    public CatDTO(Cat cat) {
        this.name = cat.getName();
        this.age = cat.getAge();
    }

    public CatDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CatDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}