package demo3;

public class FPTStudent extends  Student{
    // tai su dung lai ma nguon
    String telephone;

    public FPTStudent(int id, String name, int age, String telephone) {
        super(id, name, age);
        this.telephone = telephone;
    }

    public void playFootball(){
        System.out.println("Play Football");
        super.learn(); //super - doi tuong ngam dich cua lop trong lop con
        this.learn();
    }
// tisnh da hinh -> overload - override ghi de
    @Override
    public void learn(){
        System.out.println("Fpt Student learning...");
    }
}
