package lesson11;
//Создать абстрактный класс “Dog” с переменными для клички, пола, веса собак,
//содержащий также абстрактные методы Voice и Action. Наследовать от него три
//обычных класса “DomesticDog”, “ServiceDog” и “HomelessDog”, для каждого из которых
//определить строковую переменную address, organization, area соответственно.

public class task1 {
    public static void main(String[] args) {

    }
}

abstract class Dog{
    String name;
    String sex;
    int weight;

    public Dog(String name, String sex, int weight) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }

    abstract void Voice();
    abstract void Action();
}

class DomesticDog extends Dog{
    String address;

    public DomesticDog(String name, String sex, int weight, String address) {
        super(name, sex, weight);
        this.address = address;
    }

    public void Voice(){ System.out.println("Raaawr"); }

    public void Action(){ System.out.println("Eating"); }
}

class ServiceDog extends Dog{
    String organization;

    public ServiceDog(String name, String sex, int weight, String organization) {
        super(name, sex, weight);
        this.organization = organization;
    }

    public void Voice(){ System.out.println("Raaawrrr"); }

    public void Action(){ System.out.println("Working"); }
}

class HomelessDog extends Dog{
    String area;

    public HomelessDog(String name, String sex, int weight, String area) {
        super(name, sex, weight);
        this.area = area;
    }

    public void Voice(){ System.out.println("Raaawr"); }

    public void Action(){ System.out.println("Crying"); }

}
