package com.xworkz.country.dto;

public class ContactSearchDto {

    public ContactSearchDto()
    {
        System.out.println("Created ContactSearchDto");
    }
    private  int id;

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ContactSearchDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
