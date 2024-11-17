package com.designPattern.facade.example1;

public class Client {
    public static void main(String[] args) {
        // Create subsystem components
        TV tv = new TV();
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        // Create the facade with the subsystems
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvdPlayer, soundSystem, lights);

        // Use the facade to control the subsystems
        homeTheater.watchMovie();
        System.out.println("\n");
        homeTheater.endMovie();
    }
}
