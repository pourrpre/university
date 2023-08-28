package ru.ugleva.university.entity;

import ru.ugleva.university.service.Eateable;
import ru.ugleva.university.service.GoToUni;
import ru.ugleva.university.service.WriteOffTask;

public class Student implements GoToUni, Eateable, WriteOffTask {
    String sName;
    University uni;
    Teacher teacher;

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setTeacher(Teacher tName) {
        this.teacher = tName;
    }

    public void setUni(University uName) {
        this.uni = uName;
    }

    public void callStud() {
        System.out.println(sName + " - student of the university " + uni.uName + ", his professor - " + teacher.tName + ".");
    }

    @Override
    public void goToLesson() {
        System.out.println("Today, January 29, student " + uni.uName + " " + sName + " went to a computer science class. His professor - " + teacher.tName);
    }


    @Override
    public void writeOfHomework() {
        System.out.println("Just on the way to " + uni.uName + " " + sName + " remembered that he forgot to do his homework. How lucky that he met a classmate who allowed him to write off her homework.");
    }

    @Override
    public void eat() {
        System.out.println("After a long and difficult lecture, " + sName + " happily ran away to his native dormitory to dine with dumplings.");
    }

    @Override
    public String toString() {
        return sName;
    }
}
