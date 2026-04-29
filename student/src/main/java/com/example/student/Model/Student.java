package com.example.student.Model;

public class Student {
    private int rollno;
    private String name;
    private float marks;
    
    public Student(int rollno,String name,float marks) {
        this .rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

    public int getId() {
        return rollno;
    }

    public void setId(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public float getMarks() {
        return marks;
    }
    public void setPrice(float price) {
        this.marks = marks;
    }
}