package com.xworkz.country.model.repo;

import com.xworkz.country.dto.PMDto;
import com.xworkz.country.dto.PMSearchDto;

import java.util.List;

public interface PMRepo {

    boolean save(PMDto pmDto);

    List<PMDto> search(PMSearchDto pmSearchDto);
}
