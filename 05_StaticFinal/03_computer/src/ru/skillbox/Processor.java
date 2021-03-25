package ru.skillbox;

import ru.skillbox.computerEnum.processor.Vendor;

public class Processor {

    private static int processorFrequency; //В Ггц
    private static int coreCount;
    private static Vendor processorVendor;
    private static int processorWeight;

    public static int getProcessorFrequency() {
        return processorFrequency;
    }

    public static void setProcessorFrequency(int processorFrequency) {
        Processor.processorFrequency = processorFrequency;
    }

    public static int getCoreCount() {
        return coreCount;
    }

    public static void setCoreCount(int coreCount) {
        Processor.coreCount = coreCount;
    }

    public static Vendor getProcessorVendor() {
        return processorVendor;
    }

    public static void setProcessorVendor(Vendor processorVendor) {
        Processor.processorVendor = processorVendor;
    }

    public static int getProcessorWeight() {
        return processorWeight;
    }

    public static void setProcessorWeight(int processorWeight) {
        Processor.processorWeight = processorWeight;
    }
}
