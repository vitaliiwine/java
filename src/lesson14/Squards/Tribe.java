package lesson14.Squards;

import lesson14.*;
import lesson14.Orcs.Orc;
import lesson14.Orcs.OrcCommander;
import lesson14.Orcs.OrcFarmer;
import lesson14.Orcs.OrcMage;
import lesson14.Orcs.OrcWarrior;

import java.util.Random;

public abstract class Tribe {
    public Orc[] orcs;
    protected int bonus;
    protected int size;

    public Tribe(int size) {
        bonus = 0;
        this.size = size;
        orcs = null;
    }

    public Tribe(int bonus, int size) {
        this.bonus = bonus;
        this.size = size;
    }

    abstract void addBonus();

    protected void fillOrcs() {
        orcs = new Orc[size];
        Random random = new Random();
        int type;
        for (int i = 0; i < orcs.length; i++) {
            type = random.nextInt(4);
            if (type == 0) {
                orcs[i] = new OrcFarmer();
            } else if (type == 1) {
                orcs[i] = new OrcMage();
            } else if (type == 2) {
                orcs[i] = new OrcWarrior();
            } else if (type == 3) {
                orcs[i] = new OrcCommander();
            } else System.out.println("Wrong farm generation");
        }
    }

    public void printArmy() {
        int t = 0;
        for (int i = 0; i < orcs.length; i++) {
            if (orcs[i].getHp() > 0) {
                t++;
                System.out.println(orcs[i].toString());
            }
        }
        System.out.println("Units alive: " + t);
    }
}


