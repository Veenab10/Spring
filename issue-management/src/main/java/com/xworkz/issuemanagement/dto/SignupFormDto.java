package com.xworkz.issuemanagement.dto;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "signup")
public class SignupFormDto {

    public SignupFormDto()
    {
        System.out.println("Created SignupFormDto");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @NotNull(message = "First name cannot be null")
    @Size(min = 3,max = 20,message = "first name should be min 3 and max 20")
    @Column(name = "first_name")
    private String fname;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 3,max = 20,message = "last name should be min 3 and max 20")
    @Column(name = "last_name")
    private String lname;

    @NotNull(message = "Email cannot be null")
    @Size(min = 5,max = 30,message = "email should be min 5 and max 30")
    @Column(name = "email_id")
    private String email;

    @NotNull(message = "Contact Number cannot be null")
    @Min(1000000000)
    @Max(9999999999L)
    @Column(name = "contact_number")
    private String number;

    @NotNull(message = "Contact Number cannot be null")
    @Min(1000000000)
    @Max(9999999999L)
    @Column(name = "alternative_number")
    private String alternativeNumber;

    @NotNull(message = "Address cannot be null")
    @Size(min = 3,max = 30,message = "address should be min 3 and max 30")
    @Column(name = "address")
    private String address;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public String getAlternativeNumber() {
        return alternativeNumber;
    }

    public void setAlternativeNumber(String alternativeNumber) {
        this.alternativeNumber = alternativeNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignupFormDto{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", alternativeNumber='" + alternativeNumber + '\'' +
                ", address='" + address + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                ", isActive=" + isActive +
                ", password='" + password + '\'' +
                '}';
    }
}
