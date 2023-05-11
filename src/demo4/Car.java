package demo4;

public class Car {
    private String brand;
    double price;


    public final String madeIn = "VN"; // kieeu k co con chau.

    // class varible
    public static  String type = "Car";


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price>0?price:0; //toán tử 3 ngôi
    }

    public static void setType(String type) {
        Car.type = type;
    }

    public void run(){

    }
}
