package main.model;

import main.GUI.ImageButton;
import main.GUI.NewJFrame;

import java.util.HashMap;
import java.util.Map;

public class ButtonMap {
    private Map<Integer, ImageButton> map;

    public ButtonMap() {
        map = new HashMap<>();
    }

    public void put(NewJFrame.CardSpace space, int index, ImageButton butt) {
        map.put(Hash(space, index), butt);
    }

    public ImageButton get(NewJFrame.CardSpace space, int index) {
        return map.get(Hash(space, index));
    }

    private int Hash(NewJFrame.CardSpace space, int index) {
        return index << 8 + space.ordinal();
    }
}
