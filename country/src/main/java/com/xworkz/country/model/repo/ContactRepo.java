package com.xworkz.country.model.repo;

import com.xworkz.country.dto.ContactDto;
import com.xworkz.country.dto.ContactSearchDto;

import java.util.List;

public interface ContactRepo {

    boolean save(ContactDto contactDto);

    List<ContactDto> search(ContactSearchDto contactSearchDto);
}
