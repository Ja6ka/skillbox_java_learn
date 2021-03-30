package ru.skillbox;

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

    public void addProcessor(Processor processor) {
        this.processor = processor;
        totalWeight = totalWeight + processor.getProcessorWeight();
    }

    public void addMemory(Memory memory) {
        this.memory = memory;
        totalWeight = totalWeight + memory.getMemoryWeight();
    }

    public void addDrive(DiskDrive diskDrive) {
        this.diskDrive = diskDrive;
        totalWeight = totalWeight + diskDrive.getDriveWeight();
    }

    public void addDisplay(Display display) {
        this.display = display;
        totalWeight = totalWeight + display.getDisplayWeight();
    }

    public void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
        totalWeight = totalWeight + keyboard.getKeyboardWeight();
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
