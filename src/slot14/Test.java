//package slot14;
//
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StudentList stl = new StudentList();
//        int select = 0;
//        do {
//            System.out.println("--------MeNu-------" );
//            System.out.println("1. Add student.\u2028\n"
//                   + "2. Edit student by id.\u2028\n"
//                   + "3. Delete student by id.\u2028\n"
//                   + "4. Sort student by gpa.\u2028\n"
//                   + "5. Sort student by name.\u2028\n"
//                   + "6. Show student.\u2028\n"
//                   + "0. Exit.");
//            select = sc.nextInt();
//
//            if (select==1){
//                System.out.println("Id: ");
//                String id = sc.nextLine();
//                System.out.println("Name: ");
//                String name = sc.nextLine();
//                System.out.println("Date of Birth: ");
//                String dateOfBirth = sc.nextLine();
//                System.out.println("Adress: ");
//                String address = sc.nextLine();
//                System.out.println("Gpa: ");
//                float gpa = sc.nextFloat();
//                Student st = new Student(id, name, dateOfBirth, address, gpa);
//                stl.addStudent(st);
//
//            } else if (select == 2) {
//
//            }  else if (select == 3) {
//                System.out.println("Id: ");
//                String id = sc.nextLine();
//
////                System.out.println("Delete student by id: " + stl.deleteStudent(st));
//            } else if (select == 4) {
//                stl.sortStudentByGpa();
//
//            } else if (select == 5) {
//
//            } else if (select == 6) {
//                stl.showStudent();
//            }
//        } while (select!=0);
//    }
//
//}
