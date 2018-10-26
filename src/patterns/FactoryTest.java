package patterns;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car audi = factory.create("Audi");
        Car ford = factory.create("Ford");
        audi.drive();
        ford.drive();
    }
}

interface Car {
    void drive();
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class Ford implements Car {
    @Override
    public void drive() {
        System.out.println("drive ford");
    }
}

class Factory {
    Car create(String typeOfCar) {
        switch (typeOfCar) {
        case "Audi":
            return new Audi();
        case "Ford":
            return new Ford();
        default:
            return null;
        }
    }
}