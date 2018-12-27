package lesson14.Orcs;

import java.util.Random;

public class OrcMage extends Orc {
    private Random random;
    private int defaultArmor;
    private int defaultDamage;
    private int defaultHp;

    public OrcMage() {
        super(600, 300, 10, 10, "Mage");
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
            System.out.println("Mage is healing");
            setArmor((int) (getArmor() * 1.2));
            setDamage((int) (getDamage() * 0.2));
            setHp((int) (getHp() * 1.2));
        }
        if (action == 2){
            System.out.println("Mage is casting");
            setArmor((int) (getArmor() * 0.5));
            setDamage((int) (getDamage() * 1.7));
        }
        orc.setHp(orc.getHp() - (getDamage() - orc.getArmor()));
    }
}
