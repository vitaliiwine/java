package generics;

public class task7 {
    public static void main(String[] args) {
        Archer[] archers = new Archer[3];
        archers[0] = new Archer("Archer", "Kolya", 400, 40, 290);
        archers[1] = new Archer("Archer", "Sergey", 400, 40, 290);
        archers[2] = new Archer("Archer", "Valera", 400, 40, 290);
        print(archers);

        Swordman[] swordmen = new Swordman[2];
        swordmen[0] = new Swordman("Swordman", "Pasha", 750, 30, 450);
        swordmen[1] = new Swordman("Swordman", "Kostya", 750, 30, 450);
        print(swordmen);

        Druid[] druids = new Druid[2];
        druids[0] = new Druid("Druid", "Grigory", 250, 35, 850);
        druids[1] = new Druid("Druid", "Victor", 250, 35, 850);
        print(druids);
    }

    public static  <T> void print(T[] arr){
        System.out.println("\r\n" + arr.getClass().getSimpleName() + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString());
        }
    }
}

abstract class Elf{
    private String type;
    private String name;
    private int health;
    private int speed;
    private int damage;

    public Elf(String type, String name, int health, int speed, int damage) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.damage = damage;
    }

    abstract public void Say();

    @Override
    public String toString() {
        return "Type: " + type + "\n" + "Name: " + name + "\n" +  "Health: " + health + "\n" +
                "Speed: " + speed + "\n" + "Damage: " + damage + "\r\n";
    }
}

class Archer extends Elf{
    public Archer(String type, String name, int health, int speed, int damage) {
        super(type, name, health, speed, damage);

    }

    @Override
    public void Say() {
        System.out.println("Shoooooting!");
    }
}

class Swordman extends Elf{
    public Swordman(String type, String name, int health, int speed, int damage) {
        super(type, name, health, speed, damage);
    }

    @Override
    public void Say() {
        System.out.println("For my family!");
    }
}

class Druid extends Elf{
    public Druid(String type, String name, int health, int speed, int damage) {
        super(type, name, health, speed, damage);
    }

    @Override
    public void Say() {
        System.out.println("Magic is everything...everything is magic!");
    }
}