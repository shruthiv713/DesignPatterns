package org.patterns.structural.facade.subsystem;

public class HardDrive {
    public void readBootRecord() {
        System.out.println("  HardDrive: Reading Master Boot Record...");
    }
    public void loadOS() {
        System.out.println("  HardDrive: Loading Operating System files...");
    }
    public void spinDown() {
        System.out.println("  HardDrive: Spinning down...");
    }
}