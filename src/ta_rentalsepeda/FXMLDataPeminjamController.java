/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_rentalsepeda;

import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDataPeminjamController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private JFXDatePicker tanggal;
    @FXML
    private TextField alamat;
    @FXML
    private TextField no_hp;
    @FXML
    private TextField sewa;
    @FXML
    private TextField lama;
    @FXML
    private RadioButton female;
    @FXML
    private RadioButton male;
    @FXML
    private Button jumlah;
    @FXML
    private TextField hitung;
    @FXML
    private Button hapus;
    @FXML
    private Button simpan;
    @FXML
    private Button exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     String Nama,Tanggal,Alamat,No_hp,Sewa,Lama,Hitung;
     
    @FXML
    private void hitung_jumlah(ActionEvent event) {
         int a1 = Integer.parseInt(sewa.getText());
        int a2 = Integer.parseInt(lama.getText());
        int total1 = a1*a2;
        hitung.setText(" "+total1);
    }

    @FXML
    private void hapuss(ActionEvent event) {
        nama.setText(" ");
        male.setSelected(false);
        female.setSelected(false);
        alamat.setText(" ");
        lama.setText(" ");
        sewa.setText(" ");
        hitung.setText(" ");
        no_hp.setText(" ");
        
    }

    @FXML
    private void save(ActionEvent event) throws IOException {
        Kirim();
                   try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLData.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),450,460);

                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("Data");
                stage.show();
                
                FXMLDataController Data = new FXMLDataController();
            Data = fxmlLoader.getController();
            
            Data.setdata(Nama,Tanggal,Alamat,No_hp,Sewa,Lama,Hitung);
            }
                   
                catch (IOException e){
                        System.out.println("Failed to create new Window." + e);
                        }
    }
  
    void Kirim(){
        //untuk validasi isian
         if(nama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan nama Anda");
        }else if (tanggal.getValue().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Harap isikan tanggal pinjam Anda");
        }else if(alamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan alamat Anda");
        }else if(no_hp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan nomor hp Anda");
        }else if(sewa.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap masukkan harga sewa");
        }else if(lama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap masukkan berapa lama anda meminjam");
        
        }
        //untuk pengambilan nilai isian
        Nama = nama.getText();
        Tanggal = tanggal.getValue().toString();
        Alamat = alamat.getText();
        No_hp = no_hp.getText();
        Sewa = sewa.getText();
        Lama= lama.getText();
        Hitung=hitung.getText();
        
        
    }
    @FXML
    private void keluar(ActionEvent event) {
        if (JOptionPane.showConfirmDialog(null,
                "Anda Yakin?","Confirmation Dialog",
            JOptionPane.YES_NO_OPTION)==
            JOptionPane.YES_OPTION){ 
            System.exit(0);
    }
    }  
}
