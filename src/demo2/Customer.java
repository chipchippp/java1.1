package demo2;

public class Customer {
    int id;
    String name;
    int age;
    String address;

    public  Customer(){ // ham  khởi tạo của lớp - contructor
        // tên giống hệt với lớp
        // k có dự liệu trả về
        // và tựu đọng chạy khi tạo đói tượng
        System.out.println("đã tạo ra 1 đối tượng customer: " );

    }



//getter setter

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void buyCart(){

    }
    void sayHello(String msg){
        System.out.println("Hello"  +msg);
    }

    void printInfo(){
        System.out.println("Name: " +this.name); // this la doi tuong ngam dich
        System.out.println("Name: " +this.age);
    }
}
