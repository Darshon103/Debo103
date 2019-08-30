/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author 0605023970
 */
public class StudentClass {
    
    public int studentId;
    private String name;
    private String ssn;
    private double gpa;
    private final int SCHCODE = 38879;
    
public StudentClass() {
    } // End constructor method

public int getStudentId() {
    return studentId;
    } // End method getStudentId

public void setStudentId(int id) {
    studentId = id;
    } // End method setStudentId

public void setName(String name) {
    this.name = name;
    } // End method setName

Student stu = new Student();

public StudentClass(String n, String ssn) {
    name = n;
    this.ssn = ssn;
    } // End class Student

Student student1 = new Student("Gina", "3003466");

public String getName(String firstName, String lastName) {
    return(firstName + " " + lastName);
    } // End method getName

public String getName() {
    return name;
    } // End method getName
} // End class StudentClass