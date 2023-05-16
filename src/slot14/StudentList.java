package slot14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> students;

   public StudentList(){
       this.students = new ArrayList<Student>();
   }
   public StudentList(ArrayList<Student> students){
       this.students = students;
   }
//    1. Thêm sv vào danh sách
   public void  addStudent(Student st){
       this.students.add(st);
   }




//    2. Chỉnh sửa sinh viên theo id.





//    3. Xóa sinh viên theo id.
    public boolean deleteStudent (Student st){
       return  this.students.remove(st);
    }




//    4. Sắp xếp học sinh theo điểm trung bình.
    public  void sortStudentByGpa(){
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
               if (st1.getGpa()<st2.getGpa()){
                   return 1;
               } else if (st1.getGpa()>st2.getGpa()) {
                   return -1;
               } else {
                   return 0;
               }
            }
        });
    }




//    5. Sắp xếp học sinh theo tên.
    public void sortStudentByName(){
//       Collections.sort(this.students, new Comparator<Student>() {
//           @Override
//           public int compare(Student st3, Student st4) {
//               if (st3.getName()=>st4.getName()){
//                   return 1;
//               } else if (st3.getName()<st4.getName()) {
//                   return -1;
//               } else {
//                   return 0;
//               }
//           }
//       });
    }





//            6. Cho học sinh xem.
    public void showStudent(){
        for (Student student: students){
            System.out.println(student);
        }
    }




//            0. Thoát.
}
