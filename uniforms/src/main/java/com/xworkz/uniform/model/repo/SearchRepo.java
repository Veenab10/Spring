package com.xworkz.uniform.model.repo;

import com.xworkz.uniform.dto.CollegeUniformDto;
import com.xworkz.uniform.dto.SearchDto;

import java.util.List;

public interface SearchRepo {

    List<CollegeUniformDto> search(SearchDto searchDto);
}
