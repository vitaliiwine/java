package generics.Squards;

import java.util.Random;

public class Army extends Tribe {
    public Army(int size) {
        super(size);
        fillOrcs();
        addBonus();
    }

    @Override
    void addBonus() {
        Random random = new Random();
        for (int i = 0; i < orcs.length; i++) {
            orcs[i].setDamage(
                    (int) (orcs[i].getDamage() *
                            (1 + ((double) (random.nextInt(5) + 10)) / 100))
            );
            orcs[i].setHp(
                    (int) (orcs[i].getHp() *
                            (1 + ((double) (random.nextInt(5) + 10)) / 100))
            );
            orcs[i].setArmor(
                    (int) (orcs[i].getArmor() *
                            (1 + ((double) (random.nextInt(5) + 10)) / 100))
            );
        }
    }
}
