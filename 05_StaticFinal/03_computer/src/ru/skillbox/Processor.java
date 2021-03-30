package ru.skillbox;

import ru.skillbox.computerEnum.processor.Vendor;

public class Processor {

    private int processorFrequency; //В Ггц
    private int coreCount;
    private Vendor processorVendor;
    private int processorWeight;

    public Processor(int processorFrequency, int coreCount, Vendor processorVendor, int processorWeight) {
        this.processorFrequency = processorFrequency;
        this.coreCount = coreCount;
        this.processorVendor = processorVendor;
        this.processorWeight = processorWeight;
    }

    public Processor() {
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

    public Vendor getProcessorVendor() {
        return processorVendor;
    }

    public void setProcessorVendor(Vendor processorVendor) {
        this.processorVendor = processorVendor;
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

    public void setProcessorWeight(int processorWeight) {
        this.processorWeight = processorWeight;
    }
}
