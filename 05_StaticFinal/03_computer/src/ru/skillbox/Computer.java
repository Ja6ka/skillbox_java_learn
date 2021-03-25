package ru.skillbox;

import ru.skillbox.computerEnum.display.TypeOfDisplay;
import ru.skillbox.computerEnum.drive.TypeOfDrive;
import ru.skillbox.computerEnum.keyboard.Light;
import ru.skillbox.computerEnum.keyboard.TypeOfKeyboard;
import ru.skillbox.computerEnum.memory.TypeOfRAM;
import ru.skillbox.computerEnum.processor.Vendor;

public class Computer {

    private final String VENDOR;
    private final String NAME;
    private int totalWeight;

    public Computer(String vendor, String name) {
        VENDOR = vendor;
        NAME = name;
    }

    public void addProcessor(int processorFrequency, int coreCount, Vendor processorVendor, int processorWeight) {
        Processor.setProcessorFrequency(processorFrequency);
        Processor.setCoreCount(coreCount);
        Processor.setProcessorVendor(processorVendor);
        Processor.setProcessorWeight(processorWeight);
        totalWeight = totalWeight + Processor.getProcessorWeight();
    }

    public void addMemory(TypeOfRAM memoryType, int memoryAmount, int memoryWeight) {
        Memory.setMemoryType(memoryType);
        Memory.setMemoryAmount(memoryAmount);
        Memory.setMemoryWeight(memoryWeight);
        totalWeight = totalWeight + memoryWeight;
    }

    public void addDrive(TypeOfDrive driveType, int driveAmount, int driveWeight) {
        DiskDrive.setDriveType(driveType);
        DiskDrive.setDriveAmount(driveAmount);
        DiskDrive.setDriveWeight(driveWeight);
        totalWeight = totalWeight + driveWeight;
    }

    public void addDisplay(int displayDiagonal, TypeOfDisplay displayType, int displayWeight) {
        Display.setDisplayDiagonal(displayDiagonal);
        Display.setDisplayType(displayType);
        Display.setDisplayWeight(displayWeight);
        totalWeight = totalWeight + displayWeight;
    }

    public void addKeyboard(TypeOfKeyboard keyboardType, Light keyboardLight, int keyboardWeight) {
        Keyboard.setKeyboardType(keyboardType);
        Keyboard.setKeyboardLight(keyboardLight);
        Keyboard.setKeyboardWeight(keyboardWeight);
        totalWeight = totalWeight + keyboardWeight;
    }

    public void print() {
        System.out.println("Информация о компьютере марки " + VENDOR + " модели " + NAME + " :" +
                System.lineSeparator() + "Процессор:" + System.lineSeparator() +
                "\tПроизводитель - " + Processor.getProcessorVendor() + System.lineSeparator() +
                "\tКоличество ядер - " + Processor.getCoreCount() + System.lineSeparator() +
                "\tЧастота - " + Processor.getProcessorFrequency() + " Mhz" + System.lineSeparator() +
                "Оперативная память: " + System.lineSeparator() +
                "\tТип памяти - " + Memory.getMemoryType() + System.lineSeparator() +
                "\tОбъем памяти - " + Memory.getMemoryAmount() + " Gb" + System.lineSeparator() +
                "Хранилище данных:" + System.lineSeparator() +
                "\tТип носителя - " + DiskDrive.getDriveType() + System.lineSeparator() +
                "\tОбъем памяти - " + DiskDrive.getDriveAmount() + " Gb" + System.lineSeparator() +
                "Монитор: " + System.lineSeparator() +
                "\tДиагональ - " + Display.getDisplayDiagonal() + " cm" + System.lineSeparator() +
                "\tТип матрицы - " + Display.getDisplayType() + System.lineSeparator() +
                "Клавиатура: " + System.lineSeparator() +
                "\tТип - " + Keyboard.getKeyboardType() + System.lineSeparator() +
                "\tПодсветка - " + Keyboard.getKeyboardLight() + System.lineSeparator() +
                "Вес компьютера: " + getTotalWeight()
        );
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public String getVENDOR() {
        return VENDOR;
    }

    public String getNAME() {
        return NAME;
    }
}
