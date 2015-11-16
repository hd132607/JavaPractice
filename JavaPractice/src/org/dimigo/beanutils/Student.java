package org.dimigo.beanutils;

/**
 * Created by codertimo on 2015. 11. 2..
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int class_number;
    private int number;

    public Student(int id, String name, int grade, int class_number, int number) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.class_number = class_number;
        this.number = number;
    }
    public Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getClass_number() {
        return class_number;
    }

    public void setClass_number(int class_number) {
        this.class_number = class_number;
    }

    public String toString()
    {
        final String TAB = ", ";
        return "Student[id="+id+TAB+"name="+name+TAB+"grade="+grade+TAB+"class_number"+class_number+TAB+"number="+number+TAB+"]";
    }
}
