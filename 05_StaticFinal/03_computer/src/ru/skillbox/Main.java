package ru.skillbox;

import ru.skillbox.computerEnum.display.TypeOfDisplay;
import ru.skillbox.computerEnum.drive.TypeOfDrive;
import ru.skillbox.computerEnum.keyboard.Light;
import ru.skillbox.computerEnum.keyboard.TypeOfKeyboard;
import ru.skillbox.computerEnum.memory.TypeOfRAM;
import ru.skillbox.computerEnum.processor.Vendor;

public class Main {

    public static void main(String[] args) {

        Computer notebook = new Computer("ASUS", "ROG STRIX Predator");
        notebook.addProcessor(4800, 8, Vendor.AMD, 200);
        notebook.addMemory(TypeOfRAM.DDR4, 8, 250);
        notebook.addDrive(TypeOfDrive.M2_NVME, 512, 300);
        notebook.addDisplay(23, TypeOfDisplay.IPS, 2850);
        notebook.addKeyboard(TypeOfKeyboard.MEMBRANE, Light.RGB, 830);
        notebook.print();
        Computer ultrabook = new Computer("Lenovo", "Ultrabook");
        ultrabook.addProcessor(3300, 6, Vendor.INTEL, 230);
        ultrabook.addMemory(TypeOfRAM.DDR4, 4, 150);
        ultrabook.addDrive(TypeOfDrive.SSD, 256, 450);
        ultrabook.addDisplay(17, TypeOfDisplay.VA, 1700);
        ultrabook.addKeyboard(TypeOfKeyboard.MEMBRANE, Light.SINGLE_COLOR, 600);
        ultrabook.print();
        Computer stationaryPC = new Computer("DNS", "GamingTRSH");
        stationaryPC.addProcessor(2100, 4, Vendor.INTEL, 200);
        stationaryPC.addMemory(TypeOfRAM.DDR3, 4, 120);
        stationaryPC.addDrive(TypeOfDrive.HDD, 512, 700);
        stationaryPC.addDisplay(21, TypeOfDisplay.TN, 3000);
        stationaryPC.addKeyboard(TypeOfKeyboard.MEMBRANE, Light.NO, 1560);
        stationaryPC.print();
    }
}
