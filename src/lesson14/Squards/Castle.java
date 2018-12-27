package lesson14.Squards;

import java.util.Random;

public class Castle extends Tribe {
    public Castle(int size) {
        super(size);
        fillOrcs();
        addBonus();
    }

    @Override
    protected void addBonus() {
        Random random = new Random();
        for (int i = 0; i < orcs.length; i++) {
            orcs[i].setFood(
                    (int) (orcs[i].getFood() *
                            (1 + ((double)(random.nextInt(5) + 15)) / 100))
            );
            orcs[i].setDamage(
                    (int) (orcs[i].getDamage() *
                            (1 + ((double) (random.nextInt(5) + 15)) / 100))
            );
            orcs[i].setHp(
                    (int) (orcs[i].getHp() *
                            (1 + ((double) (random.nextInt(5) + 15)) / 100))
            );
            orcs[i].setArmor(
                    (int) (orcs[i].getArmor() *
                            (1 + ((double) (random.nextInt(5) + 15)) / 100))
            );
        }
    }
}
