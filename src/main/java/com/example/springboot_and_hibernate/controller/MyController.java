package com.example.springboot_and_hibernate.controller;

import com.example.springboot_and_hibernate.model.Cat;
import com.example.springboot_and_hibernate.model.dto.CatDTO;
import com.example.springboot_and_hibernate.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/getAll")
    public List<CatDTO> getAll() {
        List<Cat> cats = myService.getAll();
        return cats.stream().map(CatDTO::new).collect(Collectors.toList());
    }

    @PostMapping("/save")
    public String save(@RequestBody CatDTO catDTO) {
        Cat cat = new Cat(catDTO.getName(), catDTO.getAge());
        myService.save(cat);
        return "Котик сохранен!";
    }
}
