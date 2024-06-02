package slot14;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentList sl = new StudentList();
        int select = 0;
        do {    
                
            System.out.println("---------MENU----------");
            System.out.println("1. Add student.\n" +
                    "2. Edit student by id.\n" +
                    "3. Delete student by id.\n" +
                    "4. Sort student by gpa.\n" +
                    "5. Sort student by name.\n" +
                    "6. Show student.\n" +
                    "0. Exit.");
            select = sc.nextInt();
            sc.nextLine();
            if (select==1){
                System.out.println("Id: "); String id = sc.nextLine();
                System.out.println("Name: "); String name = sc.nextLine();
                System.out.println("Date of Birth: "); String dateOfBirth = sc.nextLine();
                System.out.println("Adress: "); String adress = sc.nextLine();
                System.out.println("Gpa: "); float gpa = sc.nextFloat();
                Student st = new Student(id, name, dateOfBirth, adress, gpa);
                sl.addStudent(st);

            } else if (select==2) {

            }else if (select==3) {
                System.out.println("Id: "); String id = sc.nextLine();
                Student st = new Student(id);
                System.out.println("Delete student by id: " +sl.deleteStudent(st));
            }else if (select==4) {
                sl.sortStudentByGpa();
                sl.showStudent();
            }else if (select==5) {

            }else if (select==6) {
                sl.showStudent();
            }

        } while (select!=0);
    }
}
