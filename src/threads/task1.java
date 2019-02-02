package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class task1 {
    public static void main(String[] args) throws IOException {
        Thread t = Thread.currentThread();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Show current thread?" + "\n" +
                "Press 'Y' for Yes and 'N' for No");
        String answer0 = reader.readLine();
        if (answer0.startsWith("Y")){
            System.out.println("Current thread: " + t.getName());
        } else if (answer0.startsWith("N")){
            System.out.println("'No' means no.");
        }

        System.out.println("Set a name for a thread?" + "\n" +
                "Press 'Y' for Yes and 'N' for No");
        String answer1 = reader.readLine();
        if (answer1.startsWith("Y")){
            System.out.println("Enter a name");
            String name = reader.readLine();
            t.setName(name);
        }

        System.out.println("Your new thread name: " + t.getName());


    }
}

class ThreadOne implements Runnable {

    private boolean isActive = true;



    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " started");
        Random random = new Random();
        while (isActive) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Goes to the forest!");
            try {
                System.out.println("I'd like to sleep here...");
                Thread.sleep((random.nextInt(10) + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good morning! I'm awake!");
        }
        System.out.println("Time to go home");
    }
}