package br.univel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private TextField campo;

    @FXML
    private Button botao;

    @FXML
    void executar(ActionEvent event) {
    	System.out.println(campo.getText());
    }
}
