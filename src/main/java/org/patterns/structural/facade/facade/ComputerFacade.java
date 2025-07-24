package org.patterns.structural.facade.facade;

import org.patterns.structural.facade.subsystem.BIOS;
import org.patterns.structural.facade.subsystem.HardDrive;
import org.patterns.structural.facade.subsystem.Memory;
import org.patterns.structural.facade.subsystem.OperatingSystem;

public class ComputerFacade {
    BIOS bios;
    HardDrive hardDrive;
    Memory memory;
    OperatingSystem os;
    public ComputerFacade() {
        bios = new BIOS();
        hardDrive = new HardDrive();
        memory = new Memory();
        os = new OperatingSystem();
    }
    // Simplified method to start the computer
    public void start() {
        System.out.println("\n--- Computer Starting Up ---");
        bios.powerOnSelfTest();
        bios.loadBootSector();// loads first sector from harddrive
        hardDrive.readBootRecord();// first sector contains the bootloader program. BIOS hands control to this.
        memory.loadKernel("0x00010000"); // the boot loader finds the address of the OS kernel in the memory & loads it
        hardDrive.loadOS(); // The OS kernel loads other required files
        bios.releaseControl();
        os.boot();
        System.out.println("--- Computer is Ready ---");
    }



    // Simplified method to shut down the computer
    public void shutDown() {
        System.out.println("\n--- Computer Shutting Down ---");
        os.shutDown();
        hardDrive.spinDown();
        memory.clear();
        System.out.println("--- Computer is Off ---");
    }


}
