/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import utils.Lista;

/**
 * FXML Controller class
 *
 * @author Martín
 */
public class VistaController implements Initializable {

    @FXML
    private TextArea txtArea;
    @FXML
    private Button btnAccion;

    Lista list;
    @FXML
    private TextField txtIngre;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Accion(ActionEvent event) {
        char[] Cadena;
        Cadena=txtIngre.getText().toCharArray();
        list = new Lista(Cadena, txtArea);
        list.start();
    }
    
}
