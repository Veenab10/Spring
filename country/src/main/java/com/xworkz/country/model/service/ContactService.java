package com.xworkz.country.model.service;

import com.xworkz.country.dto.ContactDto;
import com.xworkz.country.dto.ContactSearchDto;

import java.util.List;

public interface ContactService {

    boolean saveAndValidate(ContactDto contactDto);

    List<ContactDto> search(ContactSearchDto contactSearchDto);
}
