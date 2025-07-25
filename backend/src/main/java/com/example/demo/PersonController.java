package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    public PersonController(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    @GetMapping
    public List<Person> all() {
        return personRepository.findAll();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @PostMapping("/{personId}/addresses")
    public ResponseEntity<Address> addAddress(@PathVariable Long personId, @RequestBody Address address) {
        return personRepository.findById(personId)
                .map(person -> {
                    address.setPerson(person);
                    Address saved = addressRepository.save(address);
                    return ResponseEntity.ok(saved);
                }).orElse(ResponseEntity.notFound().build());
    }
}
