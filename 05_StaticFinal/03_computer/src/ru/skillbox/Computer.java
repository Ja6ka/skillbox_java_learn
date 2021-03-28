package ru.skillbox;

import ru.skillbox.computerEnum.display.TypeOfDisplay;
import ru.skillbox.computerEnum.drive.TypeOfDrive;
import ru.skillbox.computerEnum.keyboard.Light;
import ru.skillbox.computerEnum.keyboard.TypeOfKeyboard;
import ru.skillbox.computerEnum.memory.TypeOfRAM;
import ru.skillbox.computerEnum.processor.Vendor;

public class Computer {

    Processor processor = new Processor();
    Memory memory = new Memory();
    DiskDrive diskDrive = new DiskDrive();
    Display display = new Display();
    Keyboard keyboard = new Keyboard();

    private final String VENDOR;
    private final String NAME;
    private int totalWeight;

    public Computer(String vendor, String name) {
        VENDOR = vendor;
        NAME = name;
    }

    public void addProcessor(int processorFrequency, int coreCount, Vendor processorVendor, int processorWeight) {
        processor.setProcessorFrequency(processorFrequency);
        processor.setCoreCount(coreCount);
        processor.setProcessorVendor(processorVendor);
        processor.setProcessorWeight(processorWeight);
        totalWeight = totalWeight + processor.getProcessorWeight();
    }

    public void addMemory(TypeOfRAM memoryType, int memoryAmount, int memoryWeight) {
        memory.setMemoryType(memoryType);
        memory.setMemoryAmount(memoryAmount);
        memory.setMemoryWeight(memoryWeight);
        totalWeight = totalWeight + memoryWeight;
    }

    public void addDrive(TypeOfDrive driveType, int driveAmount, int driveWeight) {
        diskDrive.setDriveType(driveType);
        diskDrive.setDriveAmount(driveAmount);
        diskDrive.setDriveWeight(driveWeight);
        totalWeight = totalWeight + driveWeight;
    }

    public void addDisplay(int displayDiagonal, TypeOfDisplay displayType, int displayWeight) {
        display.setDisplayDiagonal(displayDiagonal);
        display.setDisplayType(displayType);
        display.setDisplayWeight(displayWeight);
        totalWeight = totalWeight + displayWeight;
    }

    public void addKeyboard(TypeOfKeyboard keyboardType, Light keyboardLight, int keyboardWeight) {
        keyboard.setKeyboardType(keyboardType);
        keyboard.setKeyboardLight(keyboardLight);
        keyboard.setKeyboardWeight(keyboardWeight);
        totalWeight = totalWeight + keyboardWeight;
    }

    public void print() {
        System.out.println("Информация о компьютере марки " + VENDOR + " модели " + NAME + " :" +
                System.lineSeparator() + "Процессор:" + System.lineSeparator() +
                "\tПроизводитель - " + processor.getProcessorVendor() + System.lineSeparator() +
                "\tКоличество ядер - " + processor.getCoreCount() + System.lineSeparator() +
                "\tЧастота - " + processor.getProcessorFrequency() + " Mhz" + System.lineSeparator() +
                "Оперативная память: " + System.lineSeparator() +
                "\tТип памяти - " + memory.getMemoryType() + System.lineSeparator() +
                "\tОбъем памяти - " + memory.getMemoryAmount() + " Gb" + System.lineSeparator() +
                "Хранилище данных:" + System.lineSeparator() +
                "\tТип носителя - " + diskDrive.getDriveType() + System.lineSeparator() +
                "\tОбъем памяти - " + diskDrive.getDriveAmount() + " Gb" + System.lineSeparator() +
                "Монитор: " + System.lineSeparator() +
                "\tДиагональ - " + display.getDisplayDiagonal() + " cm" + System.lineSeparator() +
                "\tТип матрицы - " + display.getDisplayType() + System.lineSeparator() +
                "Клавиатура: " + System.lineSeparator() +
                "\tТип - " + keyboard.getKeyboardType() + System.lineSeparator() +
                "\tПодсветка - " + keyboard.getKeyboardLight() + System.lineSeparator() +
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
