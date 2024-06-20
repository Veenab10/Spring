package com.xworkz.country.dto;

public class CountrySearchDto {

    public CountrySearchDto()
    {
        System.out.println("Created CountrySearchDto");

    }
    private int id;

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountrySearchDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
