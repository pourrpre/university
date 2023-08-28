package ru.ugleva.university.service;

import ru.ugleva.university.entity.Student;
import ru.ugleva.university.entity.Teacher;
import ru.ugleva.university.entity.University;
public class LaunchingMethods {

    public void runMethods(Student stud, University uni, Teacher teacher) {
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
