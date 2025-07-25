package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataInitializer(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) {
        if (personRepository.count() == 0) {
            Person p = new Person();
            p.setRut("1-9");
            p.setNombre("Juan Perez");
            personRepository.save(p);
        }
    }
}
