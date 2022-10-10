package com.prominentpixel.jacksondemos;

public class Student {
    // declare variables
    private String stdId;
    private String course;
    private String firstName;
    private String lastName;
    private String preferredFullName;
    private String enrol;
    private String region;
    private String phoneNumber;
    private String emailAddress;

    public Student(){

    }

    // getter/setters for all variables
    public String getStdId() {
        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getCourse() {
        return course;
    }
    public void getCourse(String course) {
        this.course = course;
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

    public String getPreferredFullName() {
        return preferredFullName;
    }
    public void setPreferredFullName(String preferredFullName) {
        this.preferredFullName = preferredFullName;
    }

    public String getEnrol() {
        return enrol;
    }
    public void setEnrol(String enrol) {
        this.enrol = enrol;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
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
        return "Employee [ Student Id: "+stdId+", Course: "+course+ ""
                + ", First Name: \"+firstName+ \", Last Name: \"+lastName+ \""
                + ", Name: \"+preferredFullName+ \", Enrol No: \"+enrol+ \""
                + ", Region: \"+region+ \", Phone Number: \"+phoneNumber+ \""
                + ", Email Address: \"+emailAddress+ \" ]";
    }
}

