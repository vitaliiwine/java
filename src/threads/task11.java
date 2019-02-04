package threads;

/*
Создать класс общественный ресурс, где будет массив с данными, в котором одна ячейка -
это класс содержащий в себе значение и позицию. Создать два класса для работы с
потоками. Один класс будет обрабатывать данные, увеличивая значение данных в массиве
на единичку. Второй каждый раз, когда произойдет увеличение значений в массиве 5 раз,
то производит запись всех данных в файл, каждый раз генерируя новый и сохраняя при
этом старые.
 */

class task11 {
    public static void main(String[] args) {
        dataCell dataCell = new dataCell(3, 5);
        GeneralResource genRes = new GeneralResource();
        dataCell[] tmp = new dataCell[5];
        for (int i = 0; i <tmp.length ; i++) {
            tmp[i] = new dataCell(i,67);
        }
        GeneralResource genRes1 = new GeneralResource(tmp);
        genRes.fillData();
        genRes.printData();

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
        countOfRead = 0; }

    /**
     * func which fills data
     */
     void fillData() {
        arrayData = new dataCell[50];
        for (int i = 0; i < arrayData.length; i++) {
            arrayData[i] = new dataCell(i, (int) (Math.random() * 100)); }
    }

    /**
     * Constructor with dataCell array args
     */
    GeneralResource(dataCell[] data) {
        this.arrayData = data;
        jobs = 0;
        countOfRead = 0; }

    /**
     * Func returns pointer to one of the cells and counter++
     ** @return data cell dataCell
     */
    synchronized dataCell getValue() {
        return arrayData[countOfRead++]; }


    /**
     * func returns a copy of data
     ** @return dataCell array with data copy
     */
    synchronized dataCell[] getAllData() {
        dataCell[] tmpData = new dataCell[arrayData.length];
        for (int i = 0; i < arrayData.length; i++) {
            tmpData[i] = new dataCell(arrayData[i].data, arrayData[i].pos); }
        return tmpData; }

    /**
     * func prints all the data to the screen
     */
    void printData() {
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i].data + " ");
            if (i % 10 == 0 && i != 0) {
                System.out.println(); }
        } System.out.println(); }

    /**
     * func checks if we're out of array bounds
     */
    boolean canDo() {return countOfRead < arrayData.length;}
}

/**
 * One data cell class
 */
class dataCell {
    public int data;
    public int pos;

    /**
     * Constructor with parameters*
     * @param pos  element position in array. All of them must be unique
     * @param data value
     */

    public dataCell(int data, int pos){
        this.data = data;
        this.pos = pos;
    }

}
