package ru.skillbox;

import ru.skillbox.computerEnum.drive.TypeOfDrive;

public class DiskDrive {

    private  TypeOfDrive driveType;
    private  int driveAmount; //В гигабайтах
    private  int driveWeight;

    public TypeOfDrive getDriveType() {
        return driveType;
    }

    public void setDriveType(TypeOfDrive driveType) {
        this.driveType = driveType;
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
}
