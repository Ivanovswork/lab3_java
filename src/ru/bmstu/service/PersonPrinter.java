package ru.bmstu.service;

import ru.bmstu.domain.Person;

public final class PersonPrinter {

    public static void printFI(Person p){
        System.out.printf("%s %s\n", p.getFirstName(), p.getSecondName());
    }

    public static void printInfo(Person p){
        System.out.printf("%s %s age - %d, phone number - %s\n",
                p.getFirstName(), p.getSecondName(), p.getAge(), p.getPhone());
    }
}
