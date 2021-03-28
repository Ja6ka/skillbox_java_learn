package ru.skillbox;

import ru.skillbox.computerEnum.memory.TypeOfRAM;

public class Memory {

    private  TypeOfRAM memoryType;
    private  int memoryAmount; //В гигабайтах
    private  int memoryWeight;

    public TypeOfRAM getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(TypeOfRAM memoryType) {
        this.memoryType = memoryType;
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
}
