package lesson11;
//Создать абстрактный класс “Orc” с переменными для показателей урона, брони, здоровья и типа атаки,
//содержащий также абстрактный метод Attack. Наследовать от него 3 обычных класса “OrcPeon”,
//“OrcGrunt” и “OrcShaman”, для каждого из которых установить тип атаки ”crushing”, “hacking” и “magical”(как
//переменная класса типа String), также определить для каждого из классов переменные из абстрактного класса и
//функцию Attack, чтобы она выводила на экран показатель атаки и ее тип.

import com.sun.org.apache.xpath.internal.operations.Or;

public class task3 {
    public static void main(String[] args) {

    }
}

abstract class Orc{
    int damage;
    int defence;
    int healthpoint;
    int melee;

    public Orc(int damage, int defence, int healthpoint, int melee) {
        this.damage = damage;
        this.defence = defence;
        this.healthpoint = healthpoint;
        this.melee = melee;
    }

    abstract void attack();
}

class OrcPeon extends Orc {
    public OrcPeon(int damage, int defence, int healthpoint, int melee) {
        super(damage, defence, healthpoint, melee);
    }

    int damage = 9;
    int defence = 3;
    int healthpoint = 300;
    int melee = 360;

    public void attack(){
        System.out.println(melee + " hacking");
    }
}

class orcGrunt extends Orc{
    public orcGrunt(int damage, int defence, int healthpoint, int melee) {
        super(damage, defence, healthpoint, melee);
    }

    int damage = 8;
    int defence = 5;
    int healthpoint = 750;
    int melee = 235;

    public void attack(){
        System.out.println(melee + " crushing");
    }
}

class orcShaman extends Orc{
    public orcShaman(int damage, int defence, int healthpoint, int melee) {
        super(damage, defence, healthpoint, melee);
    }

    int damage = 7;
    int defence = 2;
    int healthpoint = 450;
    int melee = 200;

    public void attack(){
        System.out.println(melee + " magical");
    }
}
