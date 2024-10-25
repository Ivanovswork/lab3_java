package ru.bmstu.service;

import ru.bmstu.domain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student student){
        this.list.add(student);
    }

    public void show(){
        for(Student s: list){
            StudentDismisser.dismiss(s);
        }
        System.out.print("\n");
    }

    public void findByName(String name){
        for(Student s : list){
            if (s.getFirstName() == name){
                StudentDismisser.dismiss(s);
            }
        }
        System.out.print("\n");
    }

    public void findByAverageGrade(double minAverage){
        for(Student s: list){
            List<Integer> l = s.getMarks();
            int n = l.size();
            Integer sum = l.stream()
                    .reduce(0, Integer::sum);
//            System.out.print(sum / n);
            if ((sum.doubleValue() / n) > minAverage) {
                StudentDismisser.dismiss(s);
            }
        }
        System.out.print("\n");
    }

    public void removeStudent(String name){
        ArrayList<Integer> l = new ArrayList<Integer>();

        int n = this.list.size();
        for (int i = 0; i < n; i++) {
            if (this.list.get(i).getFirstName() == name){
                l.add(i);
            }
        }

        Collections.sort(l, Collections.reverseOrder());


        for(Integer i: l){
            this.list.remove(i.intValue());
        }

    }
}
