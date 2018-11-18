package methods;

public class MyFile {
    public static void main(String[] args) {

        MyFile file = new MyFile();
        file.initialize("c:\\Пользователи\\wine\\Документы\\MyCV.txt");
        System.out.println(file);


    }

    private String filename = null;

    public void initialize(String name){
        this.filename = name;
    }

    public void initialize(String folder, String name){
        this.filename = folder + name;
    }
}
