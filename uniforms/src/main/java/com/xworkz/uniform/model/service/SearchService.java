package com.xworkz.uniform.model.service;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.dto.SearchDto;

import java.util.List;

public interface SearchService {

    List<CollegeUniformDto> searchAndValidate(SearchDto searchDto);
}
