package com.xworkz.country.dto;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contact")
public class ContactDto {
    public ContactDto()
    {
        System.out.println("Created ContactDto");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull(message = "name cannot be null")
    @Size(min = 2,max = 30,message ="name should be min 2 and max 30" )
    @Column(name = "contact_name")
    private String name;

    @NotNull(message = "Email  cannot be null")
    @Size(min = 4,max = 30,message ="email should be min 4 and max 30" )
    @Column(name = "contact_email_id")
    private String email;

    @NotNull(message = "phone number cannot be null")
    @Min(1000000000)
    @Max(9999999999L)
    @Column(name = "contact_phone_number")
    private String number;

    @NotNull(message = "comment cannot be null")
    @Size(min = 4,max = 30,message ="comment should be min 4 and max 30" )
    @Column(name = "contact_comments")
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
