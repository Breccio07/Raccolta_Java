package it.edu.iisgubbio.Ripetizione;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fattorilale extends Application{
	
	TextField tNumero= new TextField();
	Label lRisultato= new Label();
	
	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene( griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("N fattoriale");
		finestra.show();
		
		Button pCalcola= new Button("CALCOLA");
		
		griglia.add(tNumero, 0, 0);
		griglia.add(pCalcola, 0, 1);
		griglia.add(lRisultato, 0, 2);
		
		pCalcola.setOnAction(e -> Calcola());
	}
	private void Calcola() {
		
		int n, c;
		long prodotto= 1;
		n= Integer.parseInt(tNumero.getText());
		
		for(c = 1; c<=n; c++) {
			prodotto= prodotto * c;
		}
		lRisultato.setText("il fattoriale di "+n+" è di: "+prodotto);
	}
	public static void main(String [] args) {
		launch(args);
	}
}
