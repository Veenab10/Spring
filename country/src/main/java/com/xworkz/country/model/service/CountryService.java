package com.xworkz.country.model.service;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.CountrySearchDto;

import java.util.List;

public interface CountryService {

    boolean saveAndValidate(CountryDto countryDto);

    List<CountryDto> search(CountrySearchDto countrySearchDto);

    default CountryDto findById(int id)
    {
        return  null;
    }
}
