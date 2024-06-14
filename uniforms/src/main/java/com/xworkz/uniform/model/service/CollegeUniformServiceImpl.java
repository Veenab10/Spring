package com.xworkz.uniform.model.service;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.model.repo.CollegeUniformRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeUniformServiceImpl implements CollegeUniformService{

    @Autowired
    private CollegeUniformRepo collegeUniformRepo;

    public  CollegeUniformServiceImpl()
    {
        System.out.println("Created CollegeUniformServiceImpl");
    }
    @Override
    public boolean saveAndValidate(CollegeUniformDto collegeUniformDto) {
        System.out.println("Running saveAndValidate method in CollegeUniformServiceImpl");
        boolean save=collegeUniformRepo.save(collegeUniformDto);
        if(save)
        {
            System.out.println("saved repo in service"+collegeUniformDto);
        }
        else {
            System.out.println("not saved repo in service"+collegeUniformDto);
        }
        return true;

    }
}
