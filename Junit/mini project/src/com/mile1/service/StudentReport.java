package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    // Method to calculate grade
    public String findGrade(Student studentObject) {

        int[] marks = studentObject.getMarks();
        int sum = 0;

        // Check for fail condition
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
            sum += mark;
        }

        // Calculate grade
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

    // Method to validate student object
    public String validate(Student studentObject)
            throws NullStudentException,
                   NullNameException,
                   NullMarksArrayException {

        if (studentObject == null) {
            throw new NullStudentException();
        }

        if (studentObject.getName() == null) {
            throw new NullNameException();
        }

        if (studentObject.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return findGrade(studentObject);
    }
}