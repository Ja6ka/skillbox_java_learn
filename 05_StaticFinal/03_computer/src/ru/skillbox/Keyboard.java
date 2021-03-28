package ru.skillbox;

import ru.skillbox.computerEnum.keyboard.Light;
import ru.skillbox.computerEnum.keyboard.TypeOfKeyboard;

public class Keyboard {

    private  TypeOfKeyboard keyboardType;
    private  Light keyboardLight;
    private  int keyboardWeight;

    public TypeOfKeyboard getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(TypeOfKeyboard keyboardType) {
        this.keyboardType = keyboardType;
    }

    public Light getKeyboardLight() {
        return keyboardLight;
    }

    public void setKeyboardLight(Light keyboardLight) {
        this.keyboardLight = keyboardLight;
    }

    public int getKeyboardWeight() {
        return keyboardWeight;
    }

    public void setKeyboardWeight(int keyboardWeight) {
        this.keyboardWeight = keyboardWeight;
    }
}
