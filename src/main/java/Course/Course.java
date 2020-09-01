/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/**
 *
 * @author Bogi
 */
public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    
    
public Course () {
    this.name = "Milos";
    this.codeName = "Bogi";
    this.numberOfClasses = 1000;
}

public Course (String customName, String customCodeName, int customNumberOfClasses){
    this.name = customName;
    this.codeName = customCodeName;
    this.numberOfClasses = customNumberOfClasses; 
}
    
}
