/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4_1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 *
 * @author Carlos Guisao
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = Student.createExampleStudent("Guisao, Carlos", Calendar.APRIL, 4, 1994),
                s2 = Student.createExampleStudent("Panqueva, Ruth", Calendar.JUNE, 9, 1990),
                s3 = Student.createExampleStudent("Osorno, Marcela", Calendar.JANUARY, 1, 1970),
                s4 = Student.createExampleStudent("Vasquez, Charlie", Calendar.SEPTEMBER, 30, 1985);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        System.out.println("****** Original List **********");
        students.stream().map((s) -> {
            System.out.println(s.getName());
            return s;
        }).forEachOrdered((s) -> {
            System.out.println(df.format(s.getEnrollmentDate()));
        });

        System.out.println("*******Sorted by Name **********");
        Collections.sort(students, Student.getCompByName());
        students.stream().map((s) -> {
            System.out.println(s.getName());
            return s;
        }).forEachOrdered((s) -> {
            System.out.println(df.format(s.getEnrollmentDate()));
        });

        System.out.println("*******Sorted by Date ************");
        Collections.sort(students, Student.getCompByDate());
        students.stream().map((s) -> {
            System.out.println(s.getName());
            return s;
        }).forEachOrdered((s) -> {
            System.out.println(df.format(s.getEnrollmentDate()));
        });
    }
}
