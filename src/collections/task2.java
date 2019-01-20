package collections;

/*
Создать класс, который расширяет возможности hashMap. А именно, позволяет
хранить под одним ключом несколько значений. Должны быть реализованы функции
добавления элемента по ключу, поиск по ключу, поиск по значению. Изменение
значения по ключу. Удаление элементов по значению
 */

import java.util.ArrayList;

public class task2 {
    public static void main(String... arg) {
        myHashTable hashTable = new myHashTable();
        hashTable.add(1, "Sam");
        hashTable.add(1, "Kim");
        hashTable.add(1, "Guf");
        hashTable.print();
        String[] tmp = hashTable.findByKey(5);
            for (String s : tmp) {
            System.out.println(s); }
            System.out.println(hashTable.findByValue("Guf"));
            try {
                hashTable.changeByKey(4, 3, "Guf" );
            } catch (MyHashException e){
                e.printStackTrace();
            }
         hashTable.print();

    }
}

class MyHashException extends Exception{
    MyHashException(String message){
        super(message);
    }
}

class myHashTable {
    ArrayList<String>[] data;

    myHashTable() {
        data = new ArrayList[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = new ArrayList<>();
        }
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < data[i].size(); j++) {
                System.out.print( data[i].get(j));
                if (j != data[i].size() - 1)
                    System.out.print(" , ");
            }
            System.out.println();
        }
    }


    public void add(Integer key, String val) {
        data[getPos(key)].add(val);
    }

    private int getPos(Integer key) {
//        System.out.println(key.hashCode());
        return key.hashCode() % 10;
    }


    public String[] findByKey(Integer key){
        String[] res = new String[data[getPos(key)].size()];

        for (int i = 0; i < res.length; i++) {
            res[i]= data[getPos(key)].get(i);
        }
        return  res;
    }

    public boolean findByValue(String val){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].size(); j++) {
                if (data[i].get(j).equals(val)){
                    return true;
                }
            }
        }
        return false;
    }

    public void changeByKey(int key, int position, String value) throws MyHashException{
        if (data[getPos(key)].size() - 1 < position) {
            throw new MyHashException("Out of bounds");
        }
            data[getPos(key)].set(position, value);
    }
}


