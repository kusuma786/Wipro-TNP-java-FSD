package com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentTest {

    public static void main(String[] args) {

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        System.out.println("========== TEST CASES ==========\n");

        // TC1 - A Grade
        try {
            Student s1 = new Student("A1", new int[] {95, 90, 90});
            System.out.println("TC1 : " + report.validate(s1));
        } catch (Exception e) {
            System.out.println(e);
        }

        // TC2 - D Grade
        try {
            Student s2 = new Student("B1", new int[] {50, 50, 50});
            System.out.println("TC2 : " + report.validate(s2));
        } catch (Exception e) {
            System.out.println(e);
        }

        // TC3 - F Grade
        try {
            Student s3 = new Student("C1", new int[] {20, 80, 90});
            System.out.println("TC3 : " + report.validate(s3));
        } catch (Exception e) {
            System.out.println(e);
        }

        // TC4 - NullStudentException
        try {
            Student s4 = null;
            System.out.println("TC4 : " + report.validate(s4));
        } catch (NullStudentException e) {
            System.out.println("TC4 : " + e);
        } catch (Exception e) {
            System.out.println(e);
        }

        // TC5 - NullNameException
        try {
            Student s5 = new Student(null, new int[] {60, 60, 60});
            System.out.println("TC5 : " + report.validate(s5));
        } catch (NullNameException e) {
            System.out.println("TC5 : " + e);
        } catch (Exception e) {
            System.out.println(e);
        }

        // TC6 - NullMarksArrayException
        try {
            Student s6 = new Student("Manoj", null);
            System.out.println("TC6 : " + report.validate(s6));
        } catch (NullMarksArrayException e) {
            System.out.println("TC6 : " + e);
        } catch (Exception e) {
            System.out.println(e);
        }

        Student[] data = new Student[4];

        data[0] = new Student("Sekar", new int[] {35,35,35});
        data[1] = new Student(null, new int[] {11,22,33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        // TC7
        System.out.println("\nTC7 : " + service.findNumberOfNullNames(data));

        // TC8
        System.out.println("TC8 : " + service.findNumberOfNullObjects(data));

        // TC9
        System.out.println("TC9 : " + service.findNumberOfNullMarks(data));

    }
}
