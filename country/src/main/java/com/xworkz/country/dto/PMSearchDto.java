package com.xworkz.country.dto;

public class PMSearchDto {

    public PMSearchDto()
    {
        System.out.println("Created PMSearchDto");
    }

    private int id;

    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "PMSearchDto{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}
