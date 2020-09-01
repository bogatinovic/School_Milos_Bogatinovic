/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Bogi
 */
public class Computer {
    
private String operatingSystem;
private double processTact;
private double memory;
private int hardDrive;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    
    public Computer() {
        this.operatingSystem = "Windows";
        this.processTact = 4.2;
        this.memory = 64;
        this.hardDrive = 240;
    }

    public Computer(String customOperatingSystem, double customProcessTact, double customMemory, int customHardDrive) {
        this.operatingSystem = customOperatingSystem;
        this.processTact = customProcessTact;
        this.memory = customMemory;
        this.hardDrive = customHardDrive;
    }
    
    

    


    
    
    
}
