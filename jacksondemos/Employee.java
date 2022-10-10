package com.prominentpixel.jacksondemos;

public class Employee {
    private String empId;

    private String firstName;
    private String lastName;
    private String jobTitleName;
    private String phoneNumber;
    private String emailAddress;

    public Employee(){}
    public Employee(String empId, String firstName, String lastName, String jobTitleName, String phoneNumber, String emailAddress) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitleName = jobTitleName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String toString(){
        return "Employee [ Employee Id: "+empId+ ", First Name: "+firstName+ ", Last Name: "+lastName+", Job Title: "+jobTitleName+ ", Phone Number: "+phoneNumber+", Email Address: "+emailAddress+ " ]";
    }

}

