package java2.demo1;

import javafx.Student;
import javafx.scene.control.Alert;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashSet<String> hs = new HashSet<>();
//        hs.add("heloo");
//        hs.add("heloo");
//        hs.add("wrold");
//        System.out.println("Count: "+hs.size());
//
//        // viet chuong trinh nhap vao 10 so nguyen khac nhau
//
//        Scanner sc = new Scanner(System.in);
//            HashSet<Integer> inths = new HashSet<>();
//            for (int i = 0; i < 10; i++) {
//                System.out.println("nhập số nguyền tố: ");
//                inths.add(sc.nextInt());
//            }

//            while (inths.size()<10){
//                System.out.println("nhập số nguyền tố: ");
//                inths.add(sc.nextInt());
//
//        }


        PriorityQueue<Integer> ps = new PriorityQueue<>();
        ps.add(3);
        ps.add(4);
        ps.add(8);
        ps.add(1);

        while (ps.size()>0){
            int i = 0;
            i = ps.poll();
            System.out.println("queue: "+i);
        }

        PriorityQueue<Student> spt = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("B10", 20);
        hm.put("A5", 18);
        System.out.println(hm.get("B10"));
        System.out.println(hm.get("A5"));
        //        key là b10 , value là 20

    }
}
