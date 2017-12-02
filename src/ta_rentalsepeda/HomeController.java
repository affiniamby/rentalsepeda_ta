/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_rentalsepeda;

import com.jfoenix.controls.JFXButton;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class HomeController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField a1;
    @FXML
    private TextField b1;
    @FXML
    private TextField c1;
    @FXML
    private TextField a2;
    @FXML
    private TextField b2;
    @FXML
    private TextField c2;
    @FXML
    private TextField a3;
    @FXML
    private TextField b3;
    @FXML
    private TextField c3;
     @FXML
    private TextField a4;

    @FXML
    private TextField b4;

    @FXML
    private TextField c4;

    @FXML
    private JFXButton simpan;
    @FXML
    private JFXButton hapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void save(ActionEvent event) throws IOException {
                   try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLhome_sepeda.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),780,550);

                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }
                catch (IOException e){
                        System.out.println("Failed to create new Window." + e);
                        }
    }

    @FXML
    private void del(ActionEvent event) {
        a1.setText(" ");
        a2.setText(" ");
        a3.setText(" ");
        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        c1.setText(" ");
        c2.setText(" ");
        c3.setText(" ");
    }

    @FXML
    private void gambar1(MouseEvent event) {
         a1.setText("001");
        b1.setText("POLYGON");
        c1.setText("Rp 25.000 / hari");
    }

    @FXML
    private void gambarr2(MouseEvent event) {
         a2.setText("002");
        b2.setText("UNITED");
        c2.setText("Rp 20.000 / hari");
    }

    @FXML
    private void gambarr3(MouseEvent event) {
         a3.setText("003");
        b3.setText("PHONIX");
        c3.setText("Rp 20.000 / hari");
    }
     @FXML
    void gambar4(MouseEvent event) {
        a4.setText("004");
        b4.setText("HELLO KITTY");
        c4.setText("Rp 22.000 / hari");
    }
}
