package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class PersonDemo {

    private Person p;

    public PersonDemo(String firstName, String secondName, int age, String phone){
        this.p = new Person(firstName, secondName, age, phone);
    }

    public PersonDemo(String firstName, String secondName, int age, String phone, String group, int course){
        this.p = new Student(firstName, secondName, age, phone, group, course);
    }

    public void demo(){
        PersonPrinter.printFI(this.p);
        PersonPrinter.printInfo(this.p);
    }

    public void demo_student(){
        StudentDismisser.dismiss((Student) p);
    }
}
