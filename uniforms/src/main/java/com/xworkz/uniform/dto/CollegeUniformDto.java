package com.xworkz.uniform.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CollegeUniformDto {

    public CollegeUniformDto()
    {
        System.out.println("Created CollegeUniformDto");
    }

    @NotNull(message = "Name cannot be null")
    @Size(min = 4, max = 20,message = "Name should be min 4 and max 20")
    private  String name;

    @NotNull(message = "Roll Number cannot be null")
    @Size(min = 4, max = 10,message = "Roll Number should be min 4 and max 20")
    private  String rollNo;

    @NotNull(message = "Please Select College Name")
    private  String collegeName;

    @NotNull(message = "Please Select gender")
    private  String gender;

    @NotNull(message = "Please Enter Valid Data")
    private  String check;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "CollegeUniformDto{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", gender='" + gender + '\'' +
                ", check='" + check + '\'' +
                '}';
    }
}
