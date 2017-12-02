/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_rentalsepeda;

import com.jfoenix.controls.JFXButton;
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

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLhome_sepedaController implements Initializable {

    @FXML
    private JFXButton simpan;
    @FXML
    private JFXButton hapus;
    @FXML
    private TextField a5;
    @FXML
    private TextField b5;
    @FXML
    private TextField c5;
    @FXML
    private TextField a6;
    @FXML
    private TextField b6;
    @FXML
    private TextField c6;
    @FXML
    private TextField a7;
    @FXML
    private TextField b7;
    @FXML
    private TextField c7;
    @FXML
    private TextField a8;
    @FXML
    private TextField b8;
    @FXML
    private TextField c8;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
   private void lanjut(ActionEvent event) throws IOException {
                   try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLDataPeminjam.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),800,500);

                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Data Peminjam");
                stage.show();
            }
                catch (IOException e){
                        System.out.println("Failed to create new Window." + e);
                        }
    }

    @FXML
    private void delet(ActionEvent event) {
        a5.setText(" ");
        a6.setText(" ");
        a7.setText(" ");
        a8.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        c5.setText(" ");
        c6.setText(" ");
        c7.setText(" ");
        c8.setText(" ");
    }

    @FXML
    private void gambar5(MouseEvent event) {
        a5.setText("005");
        b5.setText("BMX");
        c5.setText("Rp 30.000 / hari");
    }

    @FXML
    private void gambar6(MouseEvent event) {
        a6.setText("006");
        b6.setText("POLYGON");
        c6.setText("Rp 25.000 / hari");
    }

    @FXML
    private void gambar7(MouseEvent event) {
        a7.setText("007");
        b7.setText("PINKY");
        c7.setText("Rp 25.000 / hari");
    }
     @FXML
    void gambar8(MouseEvent event) {
        a8.setText("008");
        b8.setText("BMX BLACK");
        c8.setText("Rp 30.000 / hari");
    }
    
}
