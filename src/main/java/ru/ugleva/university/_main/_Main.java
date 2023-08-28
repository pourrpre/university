package ru.ugleva.university._main;

import ru.ugleva.university.entity.Student;
import ru.ugleva.university.entity.Teacher;
import ru.ugleva.university.entity.University;
import ru.ugleva.university.service.LaunchingMethods;

public class _Main {

    public static void main(String[] args) {
        Student stud = new Student();
        University uni = new University();
        Teacher teacher = new Teacher();
        LaunchingMethods lm = new LaunchingMethods();
        lm.runMethods(stud, uni, teacher);
    }
}


