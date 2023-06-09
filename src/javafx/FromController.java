package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class FromController  {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;
    public static ObservableList<Student> listStudents = FXCollections.observableArrayList();

    public static Student editStudent;
    public ListView<Student> lv;

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            if (editStudent!= null){
                editStudent.setName(name);
                editStudent.setEmail(email);
                editStudent.setTel(tel);


                lv.setItems(listStudents);
                lv.refresh();
                editStudent = null;
                clear();


            }
            for (Student s: HomeController.listStudents){
                if(s.getName().equals(name))
                    throw new Exception("Name đã tồn tại");
                if(s.getEmail().equals(email))
                    throw new Exception("Email đã tồn tại");
            }
            Student sv = new Student(name,email,tel);
            HomeController.listStudents.add(sv);
            backToList(null);
            clear();

        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }


    public void clear(){
        txtName.clear();
        txtEmail.clear();
        txtTel.clear();
    }

}
