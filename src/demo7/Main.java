package demo7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        String ns = "13/5/";
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);
        LocalDate ld2 = ld1.plusDays(2);
        System.out.println(ld2); // ngày
        LocalDate ld3 = ld1.plusWeeks(3);
        System.out.println(ld3); // tuần
        LocalDate ld4 = ld1.minusDays(3);
        System.out.println(ld4); // trừ 3 ngày

        String bth = "2004-04-15";
        LocalDate ld5 = LocalDate.parse(bth);
        System.out.println(ld5.getDayOfWeek());

        LocalDate ld6 = LocalDate.of(2004,04,15);
        System.out.println(ld6.getDayOfWeek());

        LocalDateTime lt1 = LocalDateTime.now(); // giờ and days
        System.out.println(lt1);
        LocalDateTime lt2 = lt1.plusMinutes(5); // thêm 5p
        LocalDateTime lt3 = lt1.minusMinutes(5); // trừ 5p


    }
}
