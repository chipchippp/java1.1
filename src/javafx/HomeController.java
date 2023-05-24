package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx3.Product2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HomeController extends FromController implements Initializable {
    public static ObservableList<Student> listStudents = FXCollections.observableArrayList();
    public ListView<Student> lv;
    public static Student editStudent;

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(listStudents);
    }



    public void editStudent(MouseEvent mouseEvent) throws Exception {
       goToForm(null);
        editStudent = lv.getSelectionModel().getSelectedItem();
        if (editStudent != null) {
            if (txtName != null) {
                txtName.setText(editStudent.getName());
            }
            if (txtEmail != null) {
                txtEmail.setText(editStudent.getEmail());
            }
            if (txtTel != null) {
                txtTel.setText(editStudent.getTel());
            }
        }
    }

}



