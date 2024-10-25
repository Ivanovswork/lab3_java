package ru.bmstu.domain;

public class Student extends Person{

    private String group;
    private int course;

    public Student(String firstName, String secondName, int age, String phone, String group, int course) {
        super(firstName, secondName, age, phone);
        this.group = group;
        this.course = course;
    }

    public String getGroup(){
        return this.group;
    }

    public void setGroup(String phone){
        this.group = group;
    }

    public int getCourse(){
        return this.course;
    }

    public void setCourse(String phone){
        this.course = course;
    }
}
