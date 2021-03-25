package ru.skillbox;

import ru.skillbox.computerEnum.memory.TypeOfRAM;

public class Memory {

    private static TypeOfRAM memoryType;
    private static int memoryAmount; //В гигабайтах
    private static int memoryWeight;

    public static TypeOfRAM getMemoryType() {
        return memoryType;
    }

    public static void setMemoryType(TypeOfRAM memoryType) {
        Memory.memoryType = memoryType;
    }

    public static int getMemoryAmount() {
        return memoryAmount;
    }

    public static void setMemoryAmount(int memoryAmount) {
        Memory.memoryAmount = memoryAmount;
    }

    public static int getMemoryWeight() {
        return memoryWeight;
    }

    public static void setMemoryWeight(int memoryWeight) {
        Memory.memoryWeight = memoryWeight;
    }
}
