package ru.skillbox;

import ru.skillbox.computerEnum.drive.TypeOfDrive;

public class DiskDrive {

    private static TypeOfDrive driveType;
    private static int driveAmount; //В гигабайтах
    private static int driveWeight;

    public static TypeOfDrive getDriveType() {
        return driveType;
    }

    public static void setDriveType(TypeOfDrive driveType) {
        DiskDrive.driveType = driveType;
    }

    public static int getDriveAmount() {
        return driveAmount;
    }

    public static void setDriveAmount(int driveAmount) {
        DiskDrive.driveAmount = driveAmount;
    }

    public static int getDriveWeight() {
        return driveWeight;
    }

    public static void setDriveWeight(int driveWeight) {
        DiskDrive.driveWeight = driveWeight;
    }
}
