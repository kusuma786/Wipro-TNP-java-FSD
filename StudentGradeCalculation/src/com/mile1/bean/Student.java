package com.mile1.bean;

public class Student {

    private String name;
    private int[] marks;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for marks
    public int[] getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}