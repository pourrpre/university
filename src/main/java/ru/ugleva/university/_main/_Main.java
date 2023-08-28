package ru.ugleva.university._main;

import ru.ugleva.university.entity.Student;
import ru.ugleva.university.entity.Teacher;
import ru.ugleva.university.entity.University;

public class _Main {

    public static void main(String[] args) {
        Student stud = new Student();
        University uni = new University();
        Teacher teacher = new Teacher();
        stud.setsName("Ivan Ivanov");
        uni.setuName("NSU");
        teacher.settName("Valentin Nikolaevich");
        stud.setUni(uni);
        stud.setTeacher(teacher);
        teacher.setUni(uni);
        teacher.setStud(stud);
        stud.callStud();
        teacher.callTeacher();
        stud.goToLesson();
        teacher.goToLesson();
        stud.writeOfHomework();
        stud.eat();
        teacher.eat();
        teacher.checkUpTest();
    }
}


