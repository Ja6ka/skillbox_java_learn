package ru.skillbox;


import ru.skillbox.computerEnum.display.TypeOfDisplay;
import ru.skillbox.computerEnum.drive.TypeOfDrive;
import ru.skillbox.computerEnum.keyboard.Light;
import ru.skillbox.computerEnum.keyboard.TypeOfKeyboard;
import ru.skillbox.computerEnum.memory.TypeOfRAM;
import ru.skillbox.computerEnum.processor.Vendor;

public class Computer {


    private  final String VENDOR;
    private  final String NAME;

    private String computerInfo = "";
    private int totalWeight;

    private int processorFrequency; //В Ггц
    private int coreCount;
    private String processorVendor;
    private int processorWeight;

    private String memoryType;
    private int memoryAmount; //В гигабайтах
    private int memoryWeight;

    private String driveType;
    private int driveAmount; //В гигабайтах
    private int driveWeight;

    private int displayDiagonal;
    private String displayType;
    private int displayWeight;

    private String keyboardType;
    private String keyboardLight;
    private int keyboardWeight;

    public Computer(String vendor, String name) {
        VENDOR = vendor;
        NAME = name;
        computerInfo = "Информация о компьютере марки " + VENDOR + " модели " + NAME + ":"+ System.lineSeparator();
    }

    public void addProcessor(int processorFrequency, int coreCount, Vendor processorVendor, int processorWeight) {
        this.processorFrequency = processorFrequency;
        this.coreCount = coreCount;
        this.processorVendor = processorVendor.toString();
        this.processorWeight = processorWeight;
        totalWeight = totalWeight + processorWeight;
    }

    public void addMemory(TypeOfRAM memoryType, int memoryAmount, int memoryWeight) {
        this.memoryType = memoryType.toString();
        this.memoryAmount = memoryAmount;
        this.memoryWeight = memoryWeight;
        totalWeight = totalWeight + memoryWeight;
    }

    public void addDrive(TypeOfDrive driveType, int driveAmount, int driveWeight) {
        this.driveType = driveType.toString();
        this.driveAmount = driveAmount;
        this.driveWeight = driveWeight;
        totalWeight = totalWeight + driveWeight;
    }

    public void addDisplay(int displayDiagonal, TypeOfDisplay displayType, int displayWeight) {
        this.displayDiagonal = displayDiagonal;
        this.displayType = displayType.toString();
        this.displayWeight = displayWeight;
        totalWeight = totalWeight + displayWeight;
    }

    public void addKeyboard(TypeOfKeyboard keyboardType, Light keyboardLight, int keyboardWeight) {
        this.keyboardType = keyboardType.toString();
        this.keyboardLight = keyboardLight.toString();
        this.keyboardWeight = keyboardWeight;
        totalWeight= totalWeight + keyboardWeight;
    }

    public void print() {
        System.out.println(
                        computerInfo +
                        "Процессор:" + System.lineSeparator() +
                            "\tПроизводитель - " + processorVendor + System.lineSeparator() +
                            "\tКоличество ядер - " + coreCount + System.lineSeparator() +
                            "\tЧастота - " + processorFrequency + " Mhz" + System.lineSeparator() +
                        "Оперативная память: " + System.lineSeparator() +
                            "\tТип памяти - " + memoryType + System.lineSeparator() +
                            "\tОбъем памяти - " + memoryAmount + " Gb" + System.lineSeparator() +
                        "Хранилище данных:" + System.lineSeparator() +
                            "\tТип носителя - " + driveType + System.lineSeparator() +
                            "\tОбъем памяти - " + driveAmount + " Gb" + System.lineSeparator() +
                        "Монитор: " + System.lineSeparator() +
                            "\tДиагональ - " + displayDiagonal + " cm" + System.lineSeparator() +
                            "\tТип матрицы - " + displayType + System.lineSeparator() +
                        "Клавиатура: " + System.lineSeparator() +
                            "\tТип - " + keyboardType + System.lineSeparator() +
                            "\tПодсветка - " + keyboardLight + System.lineSeparator() +
                                "Вес компьютера: " + getTotalWeight()
        );
    }

    public int getTotalWeight () {
        return totalWeight;
    }
    public String getVENDOR() {
        return VENDOR;
    }

    public String getNAME() {
        return NAME;
    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(int processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public String getProcessorVendor() {
        return processorVendor;
    }

    public void setProcessorVendor(Vendor processorVendor) {
        this.processorVendor = processorVendor.toString();
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

    public void setProcessorWeight(int processorWeight) {
        this.processorWeight = processorWeight;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(TypeOfRAM memoryType) {
        this.memoryType = memoryType.toString();
    }

    public int getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public int getMemoryWeight() {
        return memoryWeight;
    }

    public void setMemoryWeight(int memoryWeight) {
        this.memoryWeight = memoryWeight;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(TypeOfDrive driveType) {
        this.driveType = driveType.toString();
    }

    public int getDriveAmount() {
        return driveAmount;
    }

    public void setDriveAmount(int driveAmount) {
        this.driveAmount = driveAmount;
    }

    public int getDriveWeight() {
        return driveWeight;
    }

    public void setDriveWeight(int driveWeight) {
        this.driveWeight = driveWeight;
    }

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(int displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(TypeOfDisplay displayType) {
        this.displayType = displayType.toString();
    }

    public int getDisplayWeight() {
        return displayWeight;
    }

    public void setDisplayWeight(int displayWeight) {
        this.displayWeight = displayWeight;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(TypeOfKeyboard keyboardType) {
        this.keyboardType = keyboardType.toString();
    }

    public String getKeyboardLight() {
        return keyboardLight;
    }

    public void setKeyboardLight(Light keyboardLight) {
        this.keyboardLight = keyboardLight.toString();
    }

    public int getKeyboardWeight() {
        return keyboardWeight;
    }

    public void setKeyboardWeight(int keyboardWeight) {
        this.keyboardWeight = keyboardWeight;
    }

}
