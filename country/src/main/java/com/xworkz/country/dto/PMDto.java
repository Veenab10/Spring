package com.xworkz.country.dto;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pm")
public class PMDto {

    public PMDto()
    {
        System.out.println("Created PMDto");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @NotNull(message = "name cannot be null")
    @Size(min = 2,max = 30,message = "name should be min 2 and max 30")
    @Column(name = "PM_name")
    private String name;

    @NotNull(message = "Please select Country Name")
    @Column(name = "PM_country")
    private String countryName;

    @NotNull(message = "Date of Birth cannot be null")
    @Min(25)
    @Max(100)
    @Column(name = "PM_dob")
    private String dob;

    @NotNull(message = "Please select")
    @Column(name = "PM_alive")
    private String alive;


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

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAlive() {
        return alive;
    }

    public void setAlive(String alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "PMDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryName='" + countryName + '\'' +
                ", dob='" + dob + '\'' +
                ", alive='" + alive + '\'' +
                '}';
    }
}
