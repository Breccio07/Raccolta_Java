package it.edu.iisgubbio.Ripetizione;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Divisori extends Application{

	TextField tNumero = new TextField();
	Label lRisultato= new Label();

	public void start(Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("Divisori");
		finestra.show();
		
		Button pDivisore = new Button("divisori");
		
		griglia.add(tNumero, 0, 0);
		griglia.add(pDivisore, 0, 1);
		griglia.add(lRisultato, 0, 2, 2, 2);
		
		pDivisore.setOnAction( e -> Calcola());
	}
	
	private void Calcola() {
		
		int numero, c;
		   String sequenza;
		   numero = Integer.parseInt(tNumero.getText());
		   sequenza = "1";
		   for(c = 2; c < numero; c++) {
		      if(numero%c== 0) {
		         sequenza += ", " + c;
		      }
		   }
		   sequenza += ", " + numero;
		   lRisultato.setText(sequenza);
		}
	
	public static void main(String [] args) {
		launch(args);
	}
}
