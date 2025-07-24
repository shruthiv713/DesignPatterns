package org.patterns.structural.facade.subsystem;

public class BIOS {
    public void powerOnSelfTest() {
        System.out.println("  BIOS: Running Power-On Self-Test (POST)...");
    }
    public void loadBootSector() {
        System.out.println("  BIOS: Loading boot sector from Hard Drive...");
    }
    public void releaseControl() {
        System.out.println("  BIOS: Handing over control to Operating System...");
    }
}