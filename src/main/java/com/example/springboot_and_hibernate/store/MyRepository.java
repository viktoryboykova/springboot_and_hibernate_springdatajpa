package com.example.springboot_and_hibernate.store;

import com.example.springboot_and_hibernate.model.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends CrudRepository<Cat, Integer> {
}
