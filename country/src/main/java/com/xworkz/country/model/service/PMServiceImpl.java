package com.xworkz.country.model.service;

import com.xworkz.country.dto.ContactDto;
import com.xworkz.country.dto.ContactSearchDto;
import com.xworkz.country.dto.PMDto;
import com.xworkz.country.dto.PMSearchDto;
import com.xworkz.country.model.repo.PMRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PMServiceImpl implements PMService {

    @Autowired
    private PMRepo pmRepo;

    public PMServiceImpl()
    {
        System.out.println("Created PMServiceImpl");
    }

    @Override
    public boolean saveAndValidate(PMDto pmDto) {
        System.out.println("Running saveAndValidate method in PMServiceImpl  ");
       boolean saved= pmRepo.save(pmDto);
       if(saved)
       {
           System.out.println("saved repo in service"+pmDto);
       }
       else {
           System.out.println("not saved repo in service"+pmDto);
       }
        return true;
    }

    @Override
    public List<PMDto> search(PMSearchDto pmSearchDto) {
        System.out.println("Running search method in PMServiceImpl");
        List<PMDto> list=pmRepo.search(pmSearchDto);
        if(!list.isEmpty())
        {
            System.out.println("searched resulted  in dtos"+pmSearchDto);
            return  list;
        }
        else {
            System.out.println(" searched resulted in empty list in service"+pmSearchDto);

        }
        return Collections.emptyList();
    }
}
