package ru.skillbox;

import ru.skillbox.computerEnum.keyboard.Light;
import ru.skillbox.computerEnum.keyboard.TypeOfKeyboard;

public class Keyboard {

    private static TypeOfKeyboard keyboardType;
    private static Light keyboardLight;
    private static int keyboardWeight;

    public static TypeOfKeyboard getKeyboardType() {
        return keyboardType;
    }

    public static void setKeyboardType(TypeOfKeyboard keyboardType) {
        Keyboard.keyboardType = keyboardType;
    }

    public static Light getKeyboardLight() {
        return keyboardLight;
    }

    public static void setKeyboardLight(Light keyboardLight) {
        Keyboard.keyboardLight = keyboardLight;
    }

    public static int getKeyboardWeight() {
        return keyboardWeight;
    }

    public static void setKeyboardWeight(int keyboardWeight) {
        Keyboard.keyboardWeight = keyboardWeight;
    }
}
