package lesson14.Orcs;

public abstract class Orc {
    private int hp;
    private int damage;
    private int armor;
    private int food;
    private String name;

    public Orc() {
        this.hp = 0;
        this.damage = 0;
        this.armor = 0;
        this.food = 0;
        this.name = "";
    }

    public Orc(int hp, int damage, int armor, int food, String name) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.food = food;
        this.name = name;
    }

    public int getHp() { return hp; }

    public void setHp(int hp) { this.hp = hp; }

    public int getDamage() { return damage; }

    public void setDamage(int damage) { this.damage = damage; }

    public int getArmor() { return armor; }

    public void setArmor(int armor) { this.armor = armor; }

    public int getFood() { return food; }

    public void setFood(int food) { this.food = food; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "Health: " +
                hp + "Damage: " + damage + "Armor: " + armor +
                "Food: " + food + "Name: " + name + '\'' + '}';
    }

    public abstract void strike(Orc orc);
}
