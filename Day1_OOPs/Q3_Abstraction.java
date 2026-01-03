package Practise_Questions.Day1_OOPs;
/*
Q3. PhysicalProduct vs DigitalProduct

- Common behavior: getPrice(), deliver()
- Use abstract class for shared state + behavior
*/

abstract class Product {
    double price;

    abstract void deliver();

    public double getPrice() {
        return price;
    }
}

class PhysicalProduct extends Product {
    PhysicalProduct(double price) {
        this.price = price;
    }

    @Override
    void deliver() {
        System.out.println("Shipping physical product");
    }
}

class DigitalProduct extends Product {
    DigitalProduct(double price) {
        this.price = price;
    }

    @Override
    void deliver() {
        System.out.println("Sending download link");
    }
}

public class Q3_Abstraction {
    public static void main(String[] args) {
        Product p1 = new PhysicalProduct(1000);
        Product p2 = new DigitalProduct(500);

        p1.deliver();
        p2.deliver();
    }
}
