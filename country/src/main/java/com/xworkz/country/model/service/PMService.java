package com.xworkz.country.model.service;

import com.xworkz.country.dto.PMDto;
import com.xworkz.country.dto.PMSearchDto;

import java.util.List;

public interface PMService {
    boolean saveAndValidate(PMDto pmDto);

    List<PMDto> search(PMSearchDto pmSearchDto);
}
