/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_rentalsepeda;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLSignUpController implements Initializable {

    @FXML
    private JFXTextField user;
    @FXML
    private JFXTextField pass;
    @FXML
    private JFXButton daftar;
    @FXML
    private JFXButton keluar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Daftar(ActionEvent event) {
        Connection connection;
        PreparedStatement pr;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/rental", "root", "");
            pr=connection.prepareStatement("INSERT INTO login(username,password) VALUES(?,?)");
            pr.setString(1,user.getText());
            pr.setString(2,pass.getText());
            pr.execute();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Daftar Gagal!");
        }
    }

    @FXML
    private void Exit(ActionEvent event) throws IOException {
        
                   try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),600,500);

                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("SignUp");
                stage.show();
            }
                catch (IOException e){
                        System.out.println("Failed to create new Window." + e);
                        }
    }
    
}
