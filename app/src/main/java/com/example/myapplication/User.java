package com.example.myapplication;

public class User {
    String name;
    String age;
    String salary;
    String qualification;
    String designation;


    public User(String name, String age, String salary, String qualification, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.qualification = qualification;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
