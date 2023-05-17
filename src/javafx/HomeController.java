package javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomeController {

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;
    public Text txtOut;
    public ArrayList<String> emailList = new ArrayList<>();
    public ArrayList<String> phoneList = new ArrayList<>();
    public void submit(ActionEvent actionEvent) {
        try {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String telePhone = txtPhone.getText();

            if (emailList.contains(email))
               throw new Exception("Email đã tồn tại");
               if (phoneList.contains(telePhone))
                   throw new Exception("Phone này đã tồn tại");
                phoneList.add(telePhone);
                emailList.add(email);
                String sv = "\n" + name + "\n" + email + "\n" +telePhone;
                txtOut.setText(txtOut.getText()+sv);
                txtName.clear();
                txtEmail.clear();
                txtPhone.clear();

        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }

    }
} //list view
