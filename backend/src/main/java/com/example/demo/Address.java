package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String casa;
    private String numero;
    private String comuna;
    private String region;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCasa() { return casa; }
    public void setCasa(String casa) { this.casa = casa; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getComuna() { return comuna; }
    public void setComuna(String comuna) { this.comuna = comuna; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}
