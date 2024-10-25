package ru.bmstu.domain;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String phone;

    public Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String firstName, String secondName, int age, String phone){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phone = phone;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

}
