package com.xworkz.uniform.model.service;

import com.xworkz.uniform.dto.CollegeUniformDto;

public interface CollegeUniformService {

    boolean saveAndValidate(CollegeUniformDto collegeUniformDto);
}
