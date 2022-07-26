package com.example.springboot_and_hibernate.service;

import com.example.springboot_and_hibernate.model.Cat;
import com.example.springboot_and_hibernate.model.dto.CatDTO;
import com.example.springboot_and_hibernate.store.MyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<Cat> getAll() {
        return (List<Cat>) myRepository.findAll();
    }

    public Cat save(Cat cat) {
        return myRepository.save(cat);
    }
}
