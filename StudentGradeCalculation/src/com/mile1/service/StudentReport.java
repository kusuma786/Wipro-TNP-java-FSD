package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    // Method to calculate grade
    public String findGrade(Student studentObject) {

        int[] marks = studentObject.getMarks();

        // Check if any subject is failed
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        // Calculate total marks
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        // Decide grade
        if (sum <= 150) {
            return "D";
        } else if (sum <= 200) {
            return "C";
        } else if (sum <= 250) {
            return "B";
        } else {
            return "A";
        }
    }

    // Method to validate student details
    public String validate(Student studentObject)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        // Check if student object is null
        if (studentObject == null) {
            throw new NullStudentException();
        }

        // Check if name is null
        if (studentObject.getName() == null) {
            throw new NullNameException();
        }

        // Check if marks array is null
        if (studentObject.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        // If all data is valid
        return findGrade(studentObject);
    }
}