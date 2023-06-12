package demo2;

public class Main {
    public static  void main(String args[]){
        int x = 10;
        Customer c = new Customer();
        Customer k = new Customer();
//        c.setId(100);
//        k.setId(90);
        c.buyCart();
        k.buyCart();
//        c.sayHello("haNoi");
//        k.sayHello("SaiGon");
        c.printInfo();
        k.printInfo();
    }



}
