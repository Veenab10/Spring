package com.xworkz.uniform.model.repo;

import com.xworkz.uniform.dto.CollegeUniformDto;
import org.springframework.stereotype.Repository;

@Repository
public class CollegeUniformRepoImpl implements CollegeUniformRepo{

    public  CollegeUniformRepoImpl()
    {
        System.out.println("Created CollegeUniformRepoImpl");
    }
    @Override
    public boolean save(CollegeUniformDto collegeUniformDto) {
        System.out.println("Running save method in CollegeUniformRepoImpl");
        return true;



    }
}
