package demo4;

import demo3.Honda;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Toyota t = new Toyota();
        System.out.println(t.getBrand());
        t.run();
        Honda h = new Honda();
        h.speedUp();
        System.out.println(h.getBrand());

        Car.type = "moto and car";

        Human hm = new Human() { //anonymous class
            @Override
            public void eat() {

            }

            @Override
            public void walk() {

            }
        };
    }
}
