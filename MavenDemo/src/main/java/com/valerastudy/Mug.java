package com.valerastudy;

public class Mug {
    private String label;
    private int volume;

    public Mug(String label, int volume) {
        this.label = label;
        this.volume = volume;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
