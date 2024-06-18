package com.xworkz.uniform.model.service;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.dto.SearchDto;
import com.xworkz.uniform.model.repo.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchRepo searchRepo;

    public SearchServiceImpl()
    {
        System.out.println("Created SearchServiceImpl");
    }

    @Override
    public List<CollegeUniformDto> searchAndValidate(SearchDto searchDto) {
        System.out.println("Running searchAndValidate method");
        List<CollegeUniformDto> list=this.searchRepo.search(searchDto);
        if(!list.isEmpty())
        {
            System.out.println("searched resuled  in dtos"+searchDto);
            return  list;
        }
        else {
            System.out.println(" searched resulted in empty list in service"+searchDto);
        }

        return Collections.emptyList();
    }
}
