package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;

    public static ObservableList<Student> listStudents = FXCollections.observableArrayList();
    public ListView<Student> myListView;
    public static Student editStudent;

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String telePhone = txtPhone.getText();
            if (editStudent != null){
                editStudent.setName(name);
                editStudent.setEmail(email);
                editStudent.setTelePhone(telePhone);

                myListView.setItems(listStudents);
                myListView.refresh();
                editStudent = null;

                txtName.clear();
                txtEmail.clear();
                txtPhone.clear();
                return;
            }
            for (Student s : listStudents) {
                if (s.getName().equals(name))
                    throw new Exception("name da ton tai"); // chi chua dc 1 dong
//              throw new Exception("name da ton tai"); // nam ngoai cua if neu muon cho vao trong thif them {}
                if (s.getName().equals(email))
                    throw new Exception("Email da ton tai");

            }
            Student sv = new Student(name, email, telePhone);
            listStudents.add(sv);
            myListView.setItems(listStudents);
            txtName.clear();
            txtEmail.clear();
            txtPhone.clear();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }

    }
    public void editStudent(MouseEvent mouseEvent) {
        editStudent = myListView.getSelectionModel().getSelectedItem();
        if (editStudent != null) {
            txtName.setText(editStudent.getName());
            txtEmail.setText(editStudent.getEmail());
            txtPhone.setText(editStudent.getTelePhone());
        }
    }
}
