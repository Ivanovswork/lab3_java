package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class StudentDismisser implements Dismissable{

    public static void dismiss(Student p) {
        System.out.printf("%s %s age - %d, phone number - %s, group - %s, course - %d\n",
                p.getFirstName(),
                p.getSecondName(),
                p.getAge(),
                p.getPhone(),
                p.getGroup(),
                p.getCourse());
    }
}
