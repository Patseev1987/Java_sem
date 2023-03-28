package My;

public class ClasesAndObjects {
    public static void main(String[] args) {
        Pesron pesrson1 = new  Pesron();
pesrson1.name="John";
pesrson1.age=40;
        System.out.println("My name is "+pesrson1.name+","+"my age is "+pesrson1.age);
        Pesron pesrson2 = new  Pesron();
        pesrson2.name="Coule";
        pesrson2.age=30;
        System.out.println("My name is "+pesrson2.name+","+"my age is "+pesrson2.age);

    }

    }

class Pesron {
    String name;
    int age;
}