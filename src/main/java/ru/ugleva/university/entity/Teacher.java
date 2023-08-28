package ru.ugleva.university.entity;

public class Teacher implements GoToUni, Eateable, CheckUpTest {

    String tName;
    University uni;
    Student stud;

    public void settName(String tName) {
        this.tName = tName;
    }

    public void callTeacher() {
        System.out.println(tName + " - university teacher " + uni.uName + ". His student - " + stud.sName + ".");
    }

    public void setStud(Student sName) {
        this.stud = sName;
    }

    public void setUni(University uName) {
        this.uni = uName;
    }

    @Override
    public void goToLesson() {
        System.out.println("Today, January 29, " + uni.uName + " teacher " + tName + " went to class. One of his students is - " + stud.sName + ".");
    }

    @Override
    public void eat() {
        System.out.println(tName + " waited for a break and went to the university cafeteria. Today's menu is roast with stewed vegetables.");
    }

    @Override
    public void checkUpTest() {
        System.out.println("Before leaving " + uni.uName + ", " + tName + " checks the student's tests. Not all of them are well-written.");
    }
}

