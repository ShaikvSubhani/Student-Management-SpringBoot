package com.avengers.studentManagement;

public class Student {
    private String name;
    private int age;
    private int admNo;
    private String state;

    public Student(String name, int age, int admNo, String state) {
        this.name = name;
        this.age = age;
        this.admNo = admNo;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
