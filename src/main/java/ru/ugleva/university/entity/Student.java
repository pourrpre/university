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
        System.out.println(sName + " - студент университета " + uni.uName + ", его преподаватель - " + teacher.tName + ".");
    }

    @Override
    public void goToLesson() {
        System.out.println("Сегодня, 29 января, студент " + uni.uName + " " + sName + " пошёл на пару информатики. Его преподаватель - " + teacher.tName);
    }


    @Override
    public void writeOfHomework() {
        System.out.println("Как раз по пути к " + uni.uName + " " + sName + " вспомнил, что забыл сделать домашнее задание. Как удачно, что он встретил одногруппницу, разрешившую списать у неё.");
    }

    @Override
    public void eat() {
        System.out.println(sName + " после долгой и сложной лекции с радостью убежал в родное общежитие обедать пельменями.");
    }

    @Override
    public String toString() {
        return sName;
    }
}
