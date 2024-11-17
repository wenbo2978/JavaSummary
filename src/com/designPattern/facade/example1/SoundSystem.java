package com.designPattern.facade.example1;

public class SoundSystem {
    public void setVolume(int level) { System.out.println("Sound system volume set to " + level); }
    public void mute() { System.out.println("Sound system is muted."); }
}
