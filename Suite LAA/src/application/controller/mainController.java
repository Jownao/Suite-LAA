package application.controller;

import application.model.Bubble;
import application.model.Insertion;
import application.model.Merge;
import application.model.Ordenacao;
import application.model.Selection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class mainController {
	
    @FXML
    private TextField txtEntrada;

    @FXML
    private TextField txtComplexidade;

    @FXML
    private TextField txtProcessamento;

    @FXML
    private Button btnVerificar;

    @FXML
    private Label labelResultadoComplexidade;

    @FXML
    private TextField txtNumerosBusca;

    @FXML
    private TextField txtNumeroBuscado;

    @FXML
    private Button btnBuscar;

    @FXML
    private Label labelResultadoBusca;

    @FXML
    private TextField txtNumeroOrdenacao;

    @FXML
    private RadioButton radioInsertion;
    
    @FXML
    private RadioButton radioMerge;
    
    @FXML
    private ToggleGroup sort;

    @FXML
    private RadioButton radioBubble;

    @FXML
    private RadioButton radioSelection;

    @FXML
    private Button btnOrdenar;

    @FXML
    private Label labelResultadoOrdenacao;
    
    @FXML
    void buscar(ActionEvent event) {
}
       
    @FXML
    void verificar(ActionEvent event) {
}
    
        
    @FXML
    void ordenar(ActionEvent event) {
    	
    	Ordenacao ordenacao = null;
    	
    	if (this.radioInsertion.isSelected()) {
    		
    		ordenacao = new Insertion();
    		
    	}else if (this.radioBubble.isSelected()) {
    		
    		ordenacao = new Bubble();
    		
    	}else if (this.radioSelection.isSelected()) {
    		
    		ordenacao = new Selection();
    		
    	}else if (this.radioMerge.isSelected()) {
    		
    		ordenacao = new Merge();
    		
    	}
    	
    	String[] ns = this.txtNumeroOrdenacao.getText().split(",");
    	int[] nums = this.parseIntArray(ns);
    	long tinicial = System.nanoTime();
    	int[] resultado = ordenacao.executar(nums);
    	long tfinal = System.nanoTime();
    	
    	StringBuilder stringArray = new StringBuilder();
    	for (int n: resultado) {
    		stringArray.append(n+" ");
    	}
    	this.labelResultadoOrdenacao.setText("O conjunto de números ordenados: "+stringArray.toString()+"\nCom o tempo de:  "+(tfinal-tinicial) + " nanosegundos ");
    }

    private int[] parseIntArray(String[] numeros) {
    	int[] array = new int[numeros.length];
    	int i = 0;
    	for (String n: numeros) {
    		array[i] = Integer.parseInt(n);
    		i++;
    	}
    	return array;
    }

}
