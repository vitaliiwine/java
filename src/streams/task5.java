package streams;

/*
12 графов и графинь танцуют вальс. Каждый такт они перемещаются по
танцевальному залу. Нужно создать классы граф и графиня в каждом из которых будет поля
“имя” и их координаты (х и у). Каждый такт танца они будут сдвигаться в случайном
направлении на единицу. После каждого “шага” нужно записывать их новое положение в bin-
файл(удаляя при этом старое). В программе должно быть два режима. Первый это такты
танцев, который будет каждый раз спрашивать “еще такт?” до тех пор пока пользователь не
скажет остановиться. И второй режим, который считывает bin-файл и показывает на экране
координаты и имена каждого из танцующих.
 */


import collections.Generator;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) throws IOException {
        Dance dance = new Dance();
        dance.startDance();
    }
}

abstract class Dancer {
    Random random;
    String name;
    int x;
    int y;

    public Dancer(int x, int y) throws IOException {
        this.name = Generator.getFileNames();
        this.x = x;
        this.y = y;
    }
}

class Count extends Dancer {
    public Count(int x, int y) throws IOException {
        super(x,y);
    }
}

class Countess extends Dancer {
    public Countess(int x, int y) throws IOException {
        super(x,y);
    }
}

class Dance {
    Random random;
    ArrayList<Dancer> dancers = new ArrayList<>();

    public Dance() throws IOException {
        fillArray();
    }

    void fillArray() throws IOException {
        for (int i = 0; i < 12; i += 2) {
            dancers.add(new Count(i,i));
            dancers.add(new Countess(i,i));
        }
    }


    void startDance() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String action;
        int move;

        boolean canDance = true;

        while (canDance) {
            System.out.println("Next move?" + "\n" + "Press 'Y' for Yes and 'N' for No");
            System.out.println("Read .txt file?" + "\n" + "Press 'R' for Yes and 'D' for No");
            action = sc.nextLine();
            if (action.startsWith("Y")) {
                move = random.nextInt(2);
                switch (move) {
                    case 1:
                        for (int i = 0; i < dancers.size(); i += 2) {
                            dancers.get(i).x += 2;
                            dancers.get(i + 1).x += 2;
                            dancers.get(i).y += 2;
                            dancers.get(i + 1).y += 2;
                        }
                        break;
                    case 2:
                        for (int i = 0; i < dancers.size(); i += 2) {
                            dancers.get(i).x += 1;
                            dancers.get(i + 1).x += 1;
                            dancers.get(i).y += 1;
                            dancers.get(i + 1).y += 1;
                        }
                        break;
                }

                String dancerPosition = "";

                for (int i = 0; i < dancers.size(); i += 2) {
                    //System.out.println(dancers.get(i).name + " " + dancers.get(i + 1).name);

                    System.out.println(dancers.get(i).name + ": " + dancers.get(i).x + "/" + dancers.get(i).y + "\n" +
                            dancers.get(i + 1).name + ": " + dancers.get(i + 1).x + "/" + dancers.get(i + 1).y);
                     dancerPosition += dancers.get(i).name + ": " + dancers.get(i).x + "/" + dancers.get(i).y + "\t" +
                             dancers.get(i + 1).name + ": " + dancers.get(i + 1).x + "/" + dancers.get(i + 1).y + "\r\n";

                }

                try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\wine\\Documents\\Java\\dancers.txt"))) {
                    byte[] buffer = dancerPosition.getBytes();
                    bos.write(buffer, 0, buffer.length);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            } else if (action.startsWith("N")) {
                System.out.println("Enough dancing for today.");
                canDance = false;
            }


            if (action.startsWith("R")) {
                try (FileInputStream fis = new FileInputStream("C:\\Users\\wine\\Documents\\Java\\dancers.txt")) {
                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer, 0, fis.available());

                    System.out.println("Dancers are here: " + new String(buffer));

                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            } else if (action.startsWith("D")) {
                System.out.println("Okay, enough reading for today.");
                canDance = false;
            } else if (!action.contains("Y") && !action.contains("N") && !action.contains("R") && !action.contains("D")) {
                System.out.println("Wrong answer");
            }
        }
    }
}




