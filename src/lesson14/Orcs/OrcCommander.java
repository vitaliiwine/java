package lesson14.Orcs;

import java.util.Random;

public class OrcCommander extends Orc {
    private Random random;
    private int defaultArmor;
    private int defaultDamage;
    private int defaultHp;

    public OrcCommander() {
        super(1200, 250, 150, 10, "Commander");
        random = new Random();
        defaultArmor = getArmor();
        this.defaultDamage = getDamage();
        this.defaultHp = getHp();
    }

    @Override
    public void strike(Orc orc) {
        int action = random.nextInt(4);
        setDamage(defaultDamage);
        setArmor(defaultArmor);
        if (getHp() > this.defaultHp){
            setHp(defaultHp);
        }
        if (action == 1) {
            System.out.println("Commander in def");
            setArmor((int) (getArmor() * 1.5));
            setDamage((int) (getDamage() * 0.7));
        }
        if (action == 2){
            System.out.println("Commander is angryeeeee!");
            setArmor((int) (getArmor() * 0.7));
            setDamage((int) (getDamage() * 1.3));
        }
        if (action == 3){
            System.out.println("Arghhhghhhh!");
            setDamage(0);
            System.out.println("What?");
        }
        orc.setHp(orc.getHp() - (getDamage() - orc.getArmor()));
    }
}
