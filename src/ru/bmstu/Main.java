package ru.bmstu;

import ru.bmstu.service.PersonDemo;

public class Main {
    public static void main(String[] args) {

        PersonDemo person = new PersonDemo("Nikita", "Ivanov", 20, "89101112233");
        person.demo();
        PersonDemo person2 = new PersonDemo(
                "Nikita",
                "Ivanov",
                20,
                "89101112233",
                "a",
                3);
        person2.demo_student();
    }
}