package threads;

/**
 * Создать класс общественный ресурс, где будет массив с данными, в котором одна ячейка -
 * это класс содержащий в себе значение и позицию. Создать два класса для работы с
 * потоками. Один класс будет обрабатывать данные, увеличивая значение данных в массиве
 * на единичку. Второй каждый раз, когда произойдет увеличение значений в массиве 5 раз,
 * то производит запись всех данных в файл, каждый раз генерируя новый и сохраняя при
 * этом старые.
 */

import java.io.FileWriter;
import java.io.IOException;

class task11 {
    public static void main(String[] args) {

        GeneralResource generalResource = new GeneralResource();
        generalResource.printData();
        Thread first = new Thread(new IncrementThread(generalResource));
        Thread second = new Thread(new IncrementThread(generalResource));
        Thread third = new Thread(new IncrementThread(generalResource));
        Thread four = new Thread(new IncrementThread(generalResource));
        first.start();
        second.start();
        third.start();
        four.start();
        try {
            first.join();
            second.join();
            third.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        generalResource.printData();

    }
}

/**
 * Class for threads' sync and connection
 */
class GeneralResource {
    private dataCell[] arrayData;
    int jobs; // number of actions performed
    int countOfRead; //counter which helps you to get data

    /**
     * No param constructor. In case it's called then data is being filled with random values
     */
    GeneralResource() {
        fillData();
        jobs = 0;
        countOfRead = 0;
    }

    /**
     * func which fills data
     */
    void fillData() {
        arrayData = new dataCell[50];
        for (int i = 0; i < arrayData.length; i++) {
            arrayData[i] = new dataCell(i, (int) (Math.random() * 100));
        }
    }

    /**
     * Constructor with dataCell array args
     */
    GeneralResource(dataCell[] arrayData) {
        this.arrayData = arrayData;
        jobs = 0;
        countOfRead = 0;
    }

    /**
     * Func returns pointer to one of the cells and counter++
     * * @return data cell dataCell
     */
    synchronized dataCell getValue() {
        return arrayData[countOfRead++];
    }

    /**
     * Func tells that an action has been performed with data cell
     */
    synchronized void jobDone() {
        jobs++;
    }

    /**
     * Func returns a copy of data
     * * @return dataCell array with data copy
     */
    synchronized dataCell[] getAllData() {
        dataCell[] tmpData = new dataCell[arrayData.length];
        for (int i = 0; i < arrayData.length; i++) {
            tmpData[i] = new dataCell(arrayData[i].data, arrayData[i].pos);
        }
        return tmpData;
    }

    /**
     * func prints all the data to the screen
     */
    void printData() {
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i].data + " ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * func checks if we're out of array bounds
     */
    boolean canDo() {
        return countOfRead < arrayData.length;
    }
}

/**
 * One data cell class
 */
class dataCell {
    public int data;
    public int pos;

    /**
     * Constructor with parameters*
     *
     * @param pos  element position in array. All of them must be unique
     * @param data value
     */

    public dataCell(int data, int pos) {
        this.data = data;
        this.pos = pos;
    }
}

/**
 * Class for incrementing the values
 */

class IncrementThread implements Runnable {
    private GeneralResource generalResource;

    /**
     * Constructor with GeneralResource args is to connect threads
     * with generalResource type
     *
     * @param generalResource is a public resource for all threads
     */

    public IncrementThread(GeneralResource generalResource) {
        this.generalResource = generalResource;
    }

    /**
     * Realization. Thread gets a data cell, prints it on screen, increments
     * its value by one and tells to the general resource the job is done and
     * by which it increments the 'jobs' counter
     */

    @Override
    public void run() {
        while (generalResource.canDo()) { //thread will work until the
            // resource tells it is possible
            if (generalResource.canDo()) { //additional check if we're out of
                //an array bounds
                System.out.println(Thread.currentThread().getName() + " - " +
                        ++generalResource.getValue().data);
                generalResource.jobDone();
            }
            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has ended");
    }
}

/**
 * Class for writing into the file
 */

class FileThread implements Runnable {
    private GeneralResource generalResource;
    private int countOfBackUp; // file number counter

    /**
     * Constructor with GeneralResource args is to connect threads
     * with generalResource type
     *
     * @param generalResource is a public resource for all threads
     */

    public FileThread(GeneralResource generalResource) {
        this.generalResource = generalResource;
        countOfBackUp = 0;
    }

    /**
     * Thread realization
     */

    @Override
    public void run() {
        String wayToFile = "src\\tmp\\file"; //variable contains file path

        while (true) {
            System.out.println(generalResource.jobs);
            if (generalResource.jobs > 5) {//if there were 5 "jobs" done then we do backup
                wayToFile += countOfBackUp++; //we change file name so to create a new file every time
                writeToFile(wayToFile); //writing into the file
                generalResource.jobs -= 5; //descending the jobs counter so to say we have written 5 changes
                wayToFile = "src\\tmp\\file"; //updating writing template
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    /**
     * func is to write into the file
     * @param fileName is a filepath with its name
     */

    void writeToFile(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            System.out.println("Start writing into the file " + fileName);
            dataCell[] arrayData = generalResource.getAllData(); //getting the data copies to write into the file
            for (int i = 0; i < arrayData.length; i++) {
                fileWriter.write(arrayData[i].data);
                fileWriter.write('\r'); //writing into the file
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Finish writing into the file " + fileName);

    }
}

