package collections;

import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class task3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        fillRandom(treeSet);


        Integer max = treeSet.last();
        Integer min = treeSet.first();
        NavigableSet<Integer> treeSetReverse = treeSet.descendingSet();
        Integer higher = treeSet.higher(5);
        Integer lower = treeSet.lower(5);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Higher than 5 = " + higher);
        System.out.println("Lower than 5 = " + lower);

        printSet(treeSet);
        System.out.println();
        printSet(treeSetReverse);

    }

    static void printSet(Set<Integer> set) {
        for (Integer t : set) {
            System.out.println(t + " ");
        }
    }

    static void fillRandom(TreeSet<Integer> treeSet) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            treeSet.add(random.nextInt(30) - 15);

        }
    }
}
