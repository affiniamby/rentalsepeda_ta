/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_rentalsepeda;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDataController implements Initializable {

    @FXML
    private JFXTextField dataNama;
    @FXML
    private JFXTextField dataTanggal;
    @FXML
    private JFXTextField dataAlamat;
    @FXML
    private JFXTextField dataNohp;
    @FXML
    private JFXTextField dataSewa;
    @FXML
    private JFXTextField dataLama;
    @FXML
    private JFXTextField dataHitung;
    @FXML
    private JFXButton Close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
void setdata(String Nama,String Tanggal,String Alamat,String No_hp,String Sewa,String Lama,String Hitung){
        dataNama.setText(Nama);
        dataTanggal.setText(Tanggal);
        dataAlamat.setText(Alamat);
        dataNohp.setText(No_hp);
        dataLama.setText(Sewa);
        dataSewa.setText(Lama);
        dataHitung.setText(Hitung);
}
      
    @FXML
    private void Keluar(ActionEvent event) {
         Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }
    
}
