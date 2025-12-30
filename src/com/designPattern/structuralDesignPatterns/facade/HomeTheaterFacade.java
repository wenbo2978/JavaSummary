package com.designPattern.structuralDesignPatterns.facade;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(TV tv, DVDPlayer dvdPlayer, SoundSystem soundSystem, Lights lights) {
        this.tv = tv;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void watchMovie() {
        System.out.println("Preparing to watch a movie...");
        lights.dim();
        tv.turnOn();
        soundSystem.setVolume(10);
        dvdPlayer.play();
        System.out.println("Movie is starting!");
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvdPlayer.stop();
        tv.turnOff();
        soundSystem.mute();
        lights.on();
        System.out.println("Movie theater is shut down.");
    }
}
