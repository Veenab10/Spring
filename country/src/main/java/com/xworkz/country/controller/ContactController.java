package com.xworkz.country.controller;

import com.xworkz.country.dto.ContactDto;
import com.xworkz.country.dto.ContactSearchDto;
import com.xworkz.country.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class ContactController {
    @Autowired
    private ContactService contactService;

    public ContactController()
    {
        System.out.println("Created ContactController");
    }

    @PostMapping("/send")
    public String send(@Valid ContactDto contactDto, Model model)
    {
        System.out.println("send method running in ContactController");
        System.out.println("Dto Details"+contactDto);
        boolean saved=contactService.saveAndValidate(contactDto);
        if(saved)
        {
            System.out.println("saved service in controller"+contactDto);
        }
        else {
            System.out.println("not saved service in controller"+contactDto);
        }
        return "Contact";

    }

    @PostMapping("/search1")
    public String search(@Valid ContactSearchDto contactSearchDto, Model model)
    {
        System.out.println("Running search method in ContactController");
        System.out.println(contactSearchDto);
        List<ContactDto> list =contactService.search(contactSearchDto);
        if(!list.isEmpty())
        {
            System.out.println("search in controller success"+contactSearchDto);
        }
        else {
            System.out.println("search in controller not success"+contactSearchDto);
        }
        model.addAttribute("contactName",contactSearchDto.getName());
        model.addAttribute("listOfContactName",list);
        return "ContactSearch";
    }


}
