package threads;

public class task2 {
    public static void main(String[] args) {
        IntThread[] intThreads = new IntThread[10];
        int count = 10;
        while(count > 0){
            for (int i = 0; i < intThreads.length; i++) {
                intThreads[i] = new IntThread(i);
                intThreads[i].start();
            }

            System.out.println();
            count --;
        }
    }
}

class IntThread extends Thread {
    int x;
    public IntThread(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.print(x + " ");
    }
}