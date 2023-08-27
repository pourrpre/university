package ru.ugleva.university.entity;

import ru.ugleva.university.service.CheckUpTest;
import ru.ugleva.university.service.Eateable;
import ru.ugleva.university.service.GoToUni;

public class Teacher implements GoToUni, Eateable, CheckUpTest {

    String tName;
    University uni;
    Student stud;

    public void settName(String tName) {
        this.tName = tName;
    }

    public void callTeacher() {
        System.out.println(tName + " - преподаватель университета " + uni.uName + ". Его студент - " + stud.sName + ".");
    }

    public void setStud(Student sName) {
        this.stud = sName;
    }

    public void setUni(University uName) {
        this.uni = uName;
    }

    @Override
    public void goToLesson() {
        System.out.println("Сегодня, 29 января, преподаватель " + uni.uName + " " + tName + " отправился на пары. Один из его студентов - " + stud.sName + ".");
    }

    @Override
    public void eat() {
        System.out.println(tName + " дождался перерыва и отправился в университетскую столовую. Сегодня в меню жаркое с тушёными овощами.");
    }

    @Override
    public void checkUpTest() {
        System.out.println("Перед тем, как уйти из " + uni.uName + ", " + tName + " проверяет студенческие контрольные. Хорошо написали далеко не все.");
    }
}

