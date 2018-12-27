package lesson14.Orcs;

import java.util.Random;

public class OrcWarrior  extends Orc {
    private Random random;
    private int defaultArmor;
    private int defaultDamage;
    private int defaultHp;

    public OrcWarrior() {
        super(1000, 150, 50, 10, "Warrior");
        random = new Random();
        defaultArmor = getArmor();
        defaultDamage = getDamage();
        defaultHp = getHp();
    }

    @Override
    public void strike(Orc orc) {
        int action = random.nextInt(3);
        setDamage(defaultDamage);
        setArmor(defaultArmor);
        if (getHp() > this.defaultHp){
            setHp(defaultHp);
        }
        if (action == 1){
            System.out.println("Warrior is in defence mode");
            setArmor((int) (getArmor() * 1.2));
            setDamage((int) (getDamage() * 0.5));
        }
        orc.setHp(orc.getHp() - (getDamage() - orc.getArmor()));
    }
}
