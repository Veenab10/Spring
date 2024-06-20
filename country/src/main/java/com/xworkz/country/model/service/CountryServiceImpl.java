package com.xworkz.country.model.service;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.CountrySearchDto;
import com.xworkz.country.model.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepo countryRepo;

    public CountryServiceImpl()
    {
        System.out.println("Created CountryServiceImpl");
    }

    @Override
    public boolean saveAndValidate(CountryDto countryDto) {
        System.out.println("saveAndValidate method running in CountryServiceImpl");
        boolean saved=countryRepo.save(countryDto);
        if(saved)
        {
            System.out.println("saved repo in service"+countryDto);
        }
        else {
            System.out.println("not saved repo in service"+countryDto);
        }
        return true;
    }

    @Override
    public List<CountryDto> search(CountrySearchDto countrySearchDto) {
        System.out.println("Running search method in CountryServiceImpl ");
        List<CountryDto> list=this.countryRepo.search(countrySearchDto);
        if(!list.isEmpty())
        {
            System.out.println("searched resulted  in dtos"+countrySearchDto);
            return  list;
        }

        else {
            System.out.println(" searched resulted in empty list in service"+countrySearchDto);
        }

        return Collections.emptyList();
    }

    @Override
    public CountryDto findById(int id) {
        System.out.println("running findByID  method in CountryServiceImpl.. ");
        CountryDto res=countryRepo.findById(id);
        if(res!=null)
        {
            System.out.println("searched result in service");
            return res;
        }
        else {
            System.out.println("not searched result in service");
        }
        return CountryService.super.findById(id);
    }
}
