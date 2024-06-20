package com.xworkz.country.model.repo;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.CountrySearchDto;

import java.util.List;

public interface CountryRepo {

    boolean save(CountryDto countryDto);

    List<CountryDto> search(CountrySearchDto countrySearchDto);

    default CountryDto findById(int id)
    {
        return  null;
    }
}
