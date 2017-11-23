package edu.camt.se444.AdventureGame.model;

public class Monster {
    int monstersID;
    String monstersName;
    String monstersType;
    int attack;
    int defend;
    int hp;
    int speed;

    public Monster(int monstersID, String monstersName, String monstersType, int attack, int defend, int hp, int speed) {
        super();
        this.monstersID = monstersID;
        this.monstersName = monstersName;
        this.monstersType = monstersType;
        this.attack = attack;
        this.defend = defend;
        this.hp = hp;
        this.speed = speed;
    }

    public Monster() {
        super();
        this.monstersID = 0;
        this.monstersName = "";
        this.monstersType = "";
        this.attack = 0;
        this.defend = 0;
        this.hp = 0;
        this.speed = 0;
    }

    public int getMonstersID() {
        return monstersID;
    }

    public void setMonstersID(int monstersID) {
        this.monstersID = monstersID;
    }

    public String getMonstersName() {
        return monstersName;
    }

    public void setMonstersName(String monstersName) {
        this.monstersName = monstersName;
    }

    public String getMonstersType() {
        return monstersType;
    }

    public void setMonstersType(String monstersType) {
        this.monstersType = monstersType;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}