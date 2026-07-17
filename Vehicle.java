class VehicleInfo {

    String name;
    int model;
}

class Car extends VehicleInfo {

    void display() {
        System.out.println(name);
        System.out.println(model);
    }
}

public class Vehicle {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.name = "Honda";
        c1.model = 2021;

        c1.display();
    }
}
