package collections;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class Generator {
    static Random random = new Random();

    public Generator() {
    }

    public static String getFileNames() throws IOException {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\wine\\Documents\\Java\\names.txt"))){
            byte[] buffer = new byte[bis.available()];
            bis.read(buffer, 0, bis.available());
            String fileNames = new String(buffer);
            String[] arrFileNames = fileNames.split("\n");
            return arrFileNames[random.nextInt(arrFileNames.length)];
        }

    }

    private static String[] warriorNames = {"warrior0", "warrior1", "warrior2", "warrior3",
            "warrior4", "warrior5", "warrior6", "warrior7",
            "warrior8", "warrior9" };

    public static String getWarriorNames() {
        return warriorNames[random.nextInt(warriorNames.length)];
    }

    public static String[] kingNames = {"Fridrich", "Alonso", "Arthur"};

    public static String getKingNames(){
        return kingNames[random.nextInt(kingNames.length)];
    }

    public static String[] nobleNames = {"Dart", "Shwart", "Greg", "Tom", "John", "Puss", "Calvin", "Frank"};

    public static String getNobleNames(){
        return nobleNames[random.nextInt(nobleNames.length)];
    }

    public static String[] knightNames = {"Brock", "Stan", "Lee", "Chen", "Austin", "Sven", "Gil", "Friez"};

    public static String getKnightNames(){
        return knightNames[random.nextInt(knightNames.length)];
    }

    public static String[] peasantNames = {"Bob", "Trev", "Igua", "Stain", "Bill", "Franc", "Jeff", "Clark"};

    public static String getPeasantNames (){
        return peasantNames[random.nextInt(peasantNames.length)];
    }
}
