package it.edu.iisgubbio.Ripetizione;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class InteresseComposto extends Application{
	
	TextField tCapitale= new TextField();
	TextField tTasso= new TextField();
	TextField tAnni= new TextField();
	
	Label lRisultato= new Label();
	public void start (Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena = new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("Interesse composto");
		finestra.show();
		
		Label lCapitale= new Label("capitale");
		Label lTasso= new Label("tasso");
		Label lAnni= new Label("num. di anni");
		
		Button pCalcola= new Button("caclola");
		
		griglia.add(tCapitale, 0, 0);
		griglia.add(lCapitale, 1, 0);
		griglia.add(tTasso, 0, 1);
		griglia.add(lTasso, 1, 1);
		griglia.add(tAnni, 0, 2);
		griglia.add(lAnni, 1, 2);
		griglia.add(pCalcola, 0, 3);
		griglia.add(lRisultato, 0, 4, 2, 4);
		
		pCalcola.setOnAction(e -> Calcola());
		
	}
	
	private void Calcola() {
		int capitale= Integer.parseInt(tCapitale.getText());
		int tasso= Integer.parseInt(tTasso.getText());
		int anni= Integer.parseInt(tAnni.getText());
		
		int interessi=0;
		
		int c;
		
		for(c=1; c <= anni; c++) {
			interessi= capitale*tasso/100;
			capitale= interessi+capitale;
		}
		lRisultato.setText("Il totale è di "+capitale);
	}
	public static void main(String [] args) {
		launch(args);
	}
}
