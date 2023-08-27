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
        System.out.println(sName + " - ������� ������������ " + uni.uName + ", ��� ������������� - " + teacher.tName + ".");
    }

    @Override
    public void goToLesson() {
        System.out.println("�������, 29 ������, ������� " + uni.uName + " " + sName + " ����� �� ���� �����������. ��� ������������� - " + teacher.tName);
    }


    @Override
    public void writeOfHomework() {
        System.out.println("��� ��� �� ���� � " + uni.uName + " " + sName + " ��������, ��� ����� ������� �������� �������. ��� ������, ��� �� �������� �������������, ����������� ������� � ��.");
    }

    @Override
    public void eat() {
        System.out.println(sName + " ����� ������ � ������� ������ � �������� ������ � ������ ��������� ������� ����������.");
    }

    @Override
    public String toString() {
        return sName;
    }
}
