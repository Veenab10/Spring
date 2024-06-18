package com.xworkz.uniform.dto;

import javax.persistence.*;

public class SearchDto {

    public  SearchDto()
    {
        System.out.println("Created SearchDto");
    }
    private int id;

    private  String name;

    private  String collegeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "SearchDto{" +
                "name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
