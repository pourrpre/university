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
        System.out.println(tName + " - ������������� ������������ " + uni.uName + ". ��� ������� - " + stud.sName + ".");
    }

    public void setStud(Student sName) {
        this.stud = sName;
    }

    public void setUni(University uName) {
        this.uni = uName;
    }

    @Override
    public void goToLesson() {
        System.out.println("�������, 29 ������, ������������� " + uni.uName + " " + tName + " ���������� �� ����. ���� �� ��� ��������� - " + stud.sName + ".");
    }

    @Override
    public void eat() {
        System.out.println(tName + " �������� �������� � ���������� � ��������������� ��������. ������� � ���� ������ � �������� �������.");
    }

    @Override
    public void checkUpTest() {
        System.out.println("����� ���, ��� ���� �� " + uni.uName + ", " + tName + " ��������� ������������ �����������. ������ �������� ������ �� ���.");
    }
}

