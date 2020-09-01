/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Bogi
 */
public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;

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

    public Student(){
    this.firstName = "Milos";
    this.lastName = "Bogatinovic";
    this.yearOfBirth = 1983;
    } 
    
    public Student(String customName, String customLastName, int customYearOfBirth) {
    this.firstName = customName;
    this.lastName = customLastName;
    this.yearOfBirth =customYearOfBirth;
            }
    
    
}
