package ru.skillbox;

import ru.skillbox.computerEnum.display.TypeOfDisplay;

public class Display {

    private  int displayDiagonal;
    private  TypeOfDisplay displayType;
    private  int displayWeight;

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(int displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public TypeOfDisplay getDisplayType() {
        return displayType;
    }

    public void setDisplayType(TypeOfDisplay displayType) {
        this.displayType = displayType;
    }

    public int getDisplayWeight() {
        return displayWeight;
    }

    public void setDisplayWeight(int displayWeight) {
        this.displayWeight = displayWeight;
    }
}
