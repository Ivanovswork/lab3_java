package ru.bmstu;

import ru.bmstu.service.InvalidPhoneNumberException;
import ru.bmstu.service.PersonDemo;

public class Main {
    public static void main(String[] args) throws InvalidPhoneNumberException {

        PersonDemo person = new PersonDemo("Nikita", "Ivanov", 20, "8910111223");
        person.demo();
        PersonDemo person2 = new PersonDemo(
                "Nikita",
                "Ivanov",
                20,
                "8910111223g",
                "a",
                3);
        person2.demo_student();

        PersonDemo.demo_student2();

        PersonDemo.demo_StudentManager();
    }
}