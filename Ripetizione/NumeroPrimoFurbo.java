package it.edu.iisgubbio.Ripetizione;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NumeroPrimoFurbo extends Application{

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
		
		Button pDivisore = new Button("Primo?");
		
		griglia.add(tNumero, 0, 0);
		griglia.add(pDivisore, 0, 1);
		griglia.add(lRisultato, 0, 2, 2, 2);
		
		pDivisore.setOnAction( e -> Calcola());
	}
	
	private void Calcola() {
		
		int c, n;
		boolean divisoreTrovato;
		n = Integer.parseInt(tNumero.getText());
		divisoreTrovato = false;
		
		for(c = 2; c < n && !divisoreTrovato; c++) {
			
		    if(n%c == 0) {
		        divisoreTrovato = true;
		      }
		    if( divisoreTrovato ) {
		        lRisultato.setText("Il numero non è primo");
		      } else {
		        lRisultato.setText("Il numero è primo!");
		      }
		}
		}
	
	public static void main(String [] args) {
		launch(args);
	}
}