package it.edu.iisgubbio.Int;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AreaPerimetroQ extends Application{
	
	TextField tLato= new TextField();
	Label lPerimetro2= new Label();
	Label lArea2= new Label();

	public void start ( Stage finestra) {
		
		GridPane griglia= new GridPane();
		 
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Area e perimetro di un quadrato");
		finestra.show();
		
		Button pCalcola= new Button("CALCOLA");
		Label lLato= new Label();
		
		Label lPerimetro1= new Label("PERIMETRO");
		Label lArea1= new Label("AREA");
		
		griglia.add(tLato, 0, 0);
		griglia.add(lLato, 1, 0);
		griglia.add(pCalcola, 0, 1, 2, 1);
		
		griglia.add(lPerimetro1, 0, 2);
		griglia.add(lArea1, 0, 3);
		griglia.add(lArea2, 1, 3);
		griglia.add(lPerimetro2, 1, 2);
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		pCalcola.setOnAction(e -> calcola());
		
		
	}
		public void calcola() {
			int Lato = Integer.parseInt(tLato.getText());
			int Area = Lato * Lato ;
			int Perimetro = Lato * 4;
			lPerimetro2.setText(""+Perimetro);
			lArea2.setText(""+Area);
		}
	
	public static void main(String [] args ) {
		launch(args);
	}
}
