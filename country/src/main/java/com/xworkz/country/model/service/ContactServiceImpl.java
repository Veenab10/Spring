package com.xworkz.country.model.service;

import com.xworkz.country.dto.ContactDto;
import com.xworkz.country.dto.ContactSearchDto;
import com.xworkz.country.model.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepo contactRepo;


    public ContactServiceImpl()
    {
        System.out.println("Cretaed ContactServiceImpl");

    }

    @Override
    public boolean saveAndValidate(ContactDto contactDto) {
        System.out.println("Running saveAndValidate in ContactServiceImpl ");
        boolean saved=contactRepo.save(contactDto);
        if(saved)
        {
            System.out.println("saved repo in service"+contactDto);
        }
        else {
            System.out.println("not saved repo in service"+contactDto);
        }
        return true;
    }

    @Override
    public List<ContactDto> search(ContactSearchDto contactSearchDto) {
        System.out.println("Running search method in ContactServiceImpl");
        List<ContactDto> list=contactRepo.search(contactSearchDto);
        if(!list.isEmpty())
        {
            System.out.println("searched resulted  in dtos"+contactSearchDto);
            return  list;
        }
        else {
            System.out.println(" searched resulted in empty list in service"+contactSearchDto);

        }
        return Collections.emptyList();
    }
}
