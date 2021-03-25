package ru.skillbox;

import ru.skillbox.computerEnum.display.TypeOfDisplay;

public class Display {

    private static int displayDiagonal;
    private static TypeOfDisplay displayType;
    private static int displayWeight;

    public static int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public static void setDisplayDiagonal(int displayDiagonal) {
        Display.displayDiagonal = displayDiagonal;
    }

    public static TypeOfDisplay getDisplayType() {
        return displayType;
    }

    public static void setDisplayType(TypeOfDisplay displayType) {
        Display.displayType = displayType;
    }

    public static int getDisplayWeight() {
        return displayWeight;
    }

    public static void setDisplayWeight(int displayWeight) {
        Display.displayWeight = displayWeight;
    }
}
