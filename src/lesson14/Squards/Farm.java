package lesson14.Squards;

import java.util.Random;

public class Farm extends Tribe {
    public Farm(int size){
        super(size);
        fillOrcs();
        addBonus();
    }

    @Override
    protected void addBonus() {
        Random random = new Random();
        for (int i = 0; i < orcs.length; i++) {
            orcs[i].setFood(
                    (int) (orcs[i].getFood() * 1.2)
            );
            orcs[i].setDamage(
                    (int) (orcs[i].getDamage() *
                            (1 + ((double)(random.nextInt(3) + 3)) / 1000))
            );
            orcs[i].setHp(
                    (int) (orcs[i].getHp() *
                            (1 + ((double) (random.nextInt(3) + 3)) / 100))
            );
            orcs[i].setArmor(
                    (int) (orcs[i].getArmor() *
                            (1 + ((double) (random.nextInt(3) + 3)) / 100))
            );
        }
    }
}
