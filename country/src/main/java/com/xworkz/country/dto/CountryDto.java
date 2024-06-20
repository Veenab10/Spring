package com.xworkz.country.dto;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "country")
public class CountryDto {

    public CountryDto()
    {
        System.out.println("Created CountryDto");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull(message = "name cannot be null")
    @Size(min = 3, max = 30,message = "name should be min 3 and max 30")
    @Column(name = "country_name")
    private String name;

    @NotNull(message = "city cannot be null")
    @Size(min = 3, max = 30,message = "city should be min 3 and max 30")
    @Column(name = "country_city")
    private String city;

    @NotNull(message = "poupulation cannot be null")
    @Size(min = 3, max = 30,message = "population should be min 3 and max 30")
    @Column(name = "country_population")
    private String population;

    @NotNull(message = "state cannot be null")
    @Size(min = 1, max = 2,message = "state should be min 3 and max 30")
    @Column(name = "country_states")
    private String states;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CountryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", population='" + population + '\'' +
                ", states='" + states + '\'' +
                '}';
    }
}
