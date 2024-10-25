package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class PersonDemo {

    private Person p;

    public PersonDemo(String firstName, String secondName, int age, String phone) throws InvalidPhoneNumberException {
        try {
            this.p = new Person(firstName, secondName, age, phone);
        }
        catch (InvalidPhoneNumberException e){
            System.out.println("Mistake in phone");
        }
    }

    public PersonDemo(String firstName, String secondName, int age, String phone, String group, int course) throws InvalidPhoneNumberException {
        try {
            this.p = new Student(firstName, secondName, age, phone, group, course);
        }
        catch (InvalidPhoneNumberException e){
            System.out.println("Mistake in phone");
        }
    }

    public void demo(){
        if (this.p != null){
            PersonPrinter.printFI(this.p);
            PersonPrinter.printInfo(this.p);
        }
        {
            System.out.println("It's impossible");
        }
    }

    public void demo_student(){
        if (this.p != null){
            StudentDismisser.dismiss((Student) p);
        }
        {
            System.out.println("It's impossible");
        }
    }

    public static void demo_student2() throws InvalidPhoneNumberException {
        Student person2 = new Student(
                "Nikita",
                "Ivanov",
                20,
                "89101112232",
                "a",
                3);

        person2.addSubject("a", 3);
        person2.addSubject("c", 4);
        person2.addSubject("b", 5);

        person2.showSubjects();
    }

    public static void demo_StudentManager() throws InvalidPhoneNumberException {
        Student person1 = new Student(
                "a",
                "a",
                20,
                "89101112232",
                "a",
                3);

        person1.addSubject("a", 3);
        person1.addSubject("c", 3);
        person1.addSubject("b", 3);

        Student person2 = new Student(
                "a",
                "b",
                20,
                "89101112232",
                "a",
                3);

        person2.addSubject("a", 4);
        person2.addSubject("c", 4);
        person2.addSubject("b", 3);

        Student person3 = new Student(
                "c",
                "c",
                20,
                "89101112232",
                "a",
                3);

        person3.addSubject("a", 5);
        person3.addSubject("c", 4);
        person3.addSubject("b", 5);

        StudentManager s = new StudentManager();

        s.addStudent(person1);
        s.addStudent(person2);
        s.addStudent(person3);

        s.show();

        s.findByName("a");

        s.findByAverageGrade(4.6);

        s.removeStudent("a");

        s.show();
    }
}
