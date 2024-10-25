package ru.bmstu.domain;

import ru.bmstu.service.InvalidPhoneNumberException;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private String group;
    private int course;

    private List<String> subjects = new ArrayList<>();
    private List<Integer> marks = new ArrayList<>();

    public Student(String firstName, String secondName, int age, String phone, String group, int course) throws InvalidPhoneNumberException {
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

    public void addSubject(String subject, Integer mark){
        this.subjects.add(subject);
        this.marks.add(mark);
        int n = this.subjects.size();
        boolean swapped;

        // Проходим по всем элементам списка
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Последние i элементов уже отсортированы
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем соседние элементы
                if (this.subjects.get(j).compareTo(this.subjects.get(j + 1)) < 0) {
                    // Меняем местами, если они в неправильном порядке
                    String temp = this.subjects.get(j);
                    this.subjects.set(j, this.subjects.get(j + 1));
                    this.subjects.set(j + 1, temp);
                    swapped = true;

                    Integer temp2 = this.marks.get(j);
                    this.marks.set(j, this.marks.get(j + 1));
                    this.marks.set(j + 1, temp2);
                }
            }

            // Если не было обменов, значит список уже отсортирован
            if (!swapped) {
                break;
            }
        }

    }

    public void showSubjects(){
        int n = this.subjects.size();
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %d\n", this.subjects.get(i), this.marks.get(i));
        }
    }

    public List<Integer> getMarks()
    {
        return this.marks;
    }

}
