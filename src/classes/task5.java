package classes;
//Описать класс «домашняя библиотека». Предусмотреть возможность работы с
//произвольным числом книг, поиска книги по какому-либо признаку (например, по автору или
//по году издания), добавления книг в библиотеку, удаления книг из нее, сортировки книг по
//разным полям


import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Library library = new Library(10);
        Books books = new Books();
        library.printLib();
        System.out.println("____________________________________");
        System.out.println();
        library.add(books);
        library.sortByYears();
        library.printLib();


    }
}

class Books {
    String author;
    String name;
    int year;
    int page;

    public Books() {
        Generator generator = new Generator();
        Random random = new Random();
        name =  generator.generateBookName();
        author = generator.generateName() + " " + generator.generateLastName();
        year = generator.generateYear();
        page = generator.generatePages();
    }

    public Books(String author, String name, int year, int page) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.page = page;
    }

    public void printBook(){
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
        System.out.println("Book name: " + name);
        System.out.println("Pages: " + page);
    }
}

class Library {
    Books [] libbooks;
    int size;

    Library (int size) {
        libbooks = new Books[size];
        this.size = size;
        for (int i = 0; i < size; i++) {
         libbooks[i] = new Books();
        }
    }

    public void printLib() {
        for (int i = 0; i < size; i++) {
            libbooks[i].printBook();
        }
    }

    public void sortByYears() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (libbooks[j].year > libbooks[j + 1].year){
                    Books tmp = libbooks[j];
                    libbooks[j] = libbooks[j + 1];
                    libbooks[j + 1] = tmp;
                }
            }
        }
    }

    public void add(Books books) {
        if (libbooks.length == size) {
            Books[] tmp = new Books[libbooks.length * 2];
            for (int i = 0; i < size; i++) {
                tmp[i] = libbooks[i];
            }
            libbooks = tmp;
        }
        libbooks[size] = books;
        size++;
    }
}

