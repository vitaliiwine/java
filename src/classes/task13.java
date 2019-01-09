package classes;
//Разработать три класса, которые следует связать между
//собой, используя наследование:
// класс Product, который имеет три элемент-данных — имя,
//цена и вес товара (базовый класс для всех классов);
//класс Buy, содержащий данные о количестве покупаемого
//товара в штуках, о цене за весь купленный товар и о весе
//товара (производный класс для класса Product и базовый
//класс для класса Check);
//класс Check, не содержащий никаких элемент-данных.
//Данный класс должен выводить на экран информацию о
//товаре и о покупке ( производный класс для класса Buy);
//Для взаимодействия с данными классов разработать set- и
//get—методы. Все элемент-данные классов объявлять как
//private.

public class task13 {
    public static void main(String[] args) {
        Check check = new Check("Milk", 8.50, 1.0, 5);
        Check check1 = new Check("Bread",3.60, 0.7, 2);
        check.calcAllWeight();
        check1.calcAllPrice();
        check.print();
        check1.print();

    }
}

class Product{
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public void setName(String name) { this.name = name; }

    public void setPrice(double price) { this.price = price; }

    public void setWeight(double weight) { this.weight = weight; }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public double getWeight() { return weight; }
}


class Buy extends Product{

    private double productQuantity;
    private double weightAll;
    private double priceAll;

    public Buy(String name, double price, double weight, double productQuantity) {
        super(name, price, weight);
        this.productQuantity = productQuantity;
    }

    public double getProductQuantity() { return productQuantity; }

    public void setProductQuantity(double productQuantity) { this.productQuantity = productQuantity; }

    public double calcAllPrice(){
       return priceAll = getPrice() * productQuantity;
    }

    public double calcAllWeight(){
        return weightAll = getWeight() * productQuantity;
    }
}

class Check extends Buy{
    public Check(String name, double price, double weight, int productQuantity) {
        super(name, price, weight, productQuantity);
    }

    public void print(){
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Weight: " + getWeight());
        System.out.println("Quantity: " + getProductQuantity());
        System.out.println("Total weight: " + this.calcAllWeight());
        System.out.println("Total price: " + this.calcAllPrice());

    }
}
