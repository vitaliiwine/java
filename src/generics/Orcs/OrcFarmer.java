package generics.Orcs;


import java.util.Random;

public class OrcFarmer extends Orc {
    private Random random;

    public OrcFarmer() {
        super(500, 50, 10, 100, "Peon");
        random = new Random();
    }

    @Override
    public void strike(Orc orc) {
        orc.setHp(orc.getHp() - (getDamage() - orc.getArmor()));
    }
}
