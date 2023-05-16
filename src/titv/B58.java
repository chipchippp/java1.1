package titv;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class B58 {
    public static void main(String[] args) {

//        hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis(); // time hien tai
        for (int i = 0; i < 100; i++){
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy for: " +t1);
        System.out.println("Sau khi chạy for: " +t2);
        System.out.println("Thời gian: " + ((t2-t1)) + "mls" ); //Nếu (t2-t1) => Millis
        System.out.println("Thời gian: " + ((t2-t1)/1000) + "s" ); //((t2-t1)/1000) tính ra đc số giây

//        timeUnit
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000*365)+"s");
        System.out.println("24h = "+TimeUnit.HOURS.toSeconds(24)+ "s");
        System.out.println("24h = "+TimeUnit.MINUTES.toSeconds(24)+ "Phút");
            //  - Giây = second
            //- Mili giây = millisecond
            //- Micro giây = microsecond
            //- Nano giây = nanosecond
            //   1 giây = 1000 mili giây = 1000.000 micro giây = 1000.000.000 nano giây


//        Date
        Date d = new java.sql.Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));

//        Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        c.add(Calendar.HOUR, 20); // 20h
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        c.add(Calendar.DATE, 9); // ngày thi
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));


//        DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
    }
}
