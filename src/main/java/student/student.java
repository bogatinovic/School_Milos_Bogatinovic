/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import Computer.Computer;
import Course.Course;

/**
 *
 * @author Bogi
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    private Computer computer;
    private Course course;
    
    
    public Student(){
    this.firstName = "Milos";
    this.lastName = "Bogatinovic";
    this.yearOfBirth = 1983;
    this.course = new Course();
    this.computer = new Computer();
    } 
    
    public Student(String customName, String customLastName, int customYearOfBirth, Course course, Computer computer) {
    this.firstName = customName;
    this.lastName = customLastName;
    this.yearOfBirth =customYearOfBirth;
    this.computer = computer;
    this.course = course;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    

       
    
    public void info() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Year of birth: " + getYearOfBirth());
        System.out.println("Course name: " + getCourse().getClass());
        System.out.println("Couse number of classes: " + getCourse().getNumberOfClasses());
        System.out.println("Process tact: " + getComputer().getProcessTact());
        System.out.println("Memory: " + getComputer().getMemory());
        System.out.println("Hard drive: " + getComputer().getMemory());
                }
    
}
