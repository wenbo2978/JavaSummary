package com.mockInterview.enumeration;

public enum Monster {
    EASY("H", 20, 30),
    NORMAL("K", 25, 40),
    HARD("L", 30, 50),
    MASTER("O", 80, 200),
    BOSS("Dragon", 150, 120000);
    public final String name;
    public final int attack;
    public final int life;

    Monster(String name, int attack, int life){
        this.name = name;
        this.attack = attack;
        this.life = life;
    }

    public String printInfo(){
        return this + " : " + "name: " + this.name + ", attack: " + this.attack + ", life: " + this.life;
    }


}
