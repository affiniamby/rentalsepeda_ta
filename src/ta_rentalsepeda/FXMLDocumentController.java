/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_rentalsepeda;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    private JFXButton btnLogin;
    
    @FXML
    private JFXTextField InUser;
    @FXML
    private JFXTextField InPass;
    private Label tampilPass;
    private Label tampilUser;
     @FXML
    private JFXButton signup;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
       // tampilUser.setText(username);
       // tampilPass.setText(password);
        
        Connection connection;
        PreparedStatement ps;
        try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            connection = DriverManager.getConnection("jdbc:mysql://localhost/rental", "root", "");
            ps = connection.prepareStatement("SELECT * FROM `login` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, InUser.getText());
            ps.setString(2, InPass.getText());
            ResultSet result = ps.executeQuery();
            if (result.next()) {
               FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLhome.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Home");
                stage.show();

                              
            } else {
                JOptionPane.showMessageDialog(null, "Salah!");
                InPass.setText("");
                InUser.requestFocus();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    
    }
     
    @FXML
    void Signup(ActionEvent event)throws IOException {
        
                   try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLSign Up.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),600,400);

                
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
