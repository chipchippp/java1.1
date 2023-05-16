package demo6;

public class Main {
    public static void main(String[] args)  throws  Exception{
        try {
            int x = 10;
            int y = 2;
            if (y< 5){
                throw new Exception("k đúng giá trị"); // chủ động phát ra ngoại lệ vd: ứng dụng cập nhật nó sẽ thông báo cập nhật và bắt ta phải cập nhật
            }
            demoExcertion();
            int z = x/y;
            System.out.println("z = " +z);
        } catch (ArithmeticException e){
            System.out.println("ARI:" +e.getMessage());
        } catch (Exception e){
            System.out.println("EX:" +e.getMessage());
        } finally {

        }
        System.out.println("done");
    }


    public static  void demoExcertion() throws Exception{

    }
}
