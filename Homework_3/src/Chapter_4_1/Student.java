/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4_1;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Carlos Guisao
 */
public class Student {
    private final String name;
    private final Date enrollmentDate;
    
    public Student(String name, Date whenEnrolled) 
    {
        this.name = name;
        this.enrollmentDate = new Date(whenEnrolled.getTime());
    }
    
    public String getName() {return name;}

    public Date getEnrollmentDate() {
        return new Date(enrollmentDate.getTime());
    }
    
    public static Comparator<Student> getCompByName() {
        return (Student s1, Student s2) -> s1.getName().compareTo(s2.getName());
    }
    
    public static Comparator<Student> getCompByDate() {
        return (Student s1, Student s2) -> s1.getEnrollmentDate().compareTo(s2.getEnrollmentDate());
    }
    
    public static Student createExampleStudent(String name, int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        return new Student(name, c.getTime());
    }
}
