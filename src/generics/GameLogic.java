package generics;

import generics.Orcs.Orc;
import generics.Squards.Tribe;

import java.util.Random;

public class GameLogic {

    public void fightBetweenSquards(Tribe tribe1, Tribe tribe2){
        int countTribe1 = 0;
        int countTribe2 = 0;
        int maxLeng = 0;
        if (tribe1.orcs.length > tribe2.orcs.length)
            maxLeng = tribe1.orcs.length;
        else
            maxLeng = tribe2.orcs.length;

        for (int i = 0; i < maxLeng; i++) {
            fightBetweenTwo(
                    tribe1.orcs[countTribe1],
                    tribe2.orcs[countTribe2]);
            countTribe1++;
            countTribe2++;
        }
    }



    public void fightBetweenTwo(Orc orc1, Orc orc2){
        int who = 0;
        Random random = new Random();
        int turn = 0;
        while (orc1.getHp() > 0 && orc2.getHp() > 0){
            System.out.println("Turn : " + turn++ );
            System.out.println(orc1.toString());
            System.out.println(orc2.toString());
            who = random.nextInt(2);
            if (who == 0){
                orc1.strike(orc2);
            }
            if (who == 1){
                orc2.strike(orc1);
            }
        }
        if (orc1.getHp() > orc2.getHp()){
            orc1.setFood(orc1.getFood() + orc2.getFood());
        }
        else{
            orc2.setFood(orc2.getFood() + orc1.getFood());
        }

        System.out.println("************");
        System.out.println(orc1.toString());
        System.out.println(orc2.toString());
    }
}
