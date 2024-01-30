package it.edu.iisgubbio.Geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rombo extends Application{
	
	TextField tBaseMin= new TextField();
	TextField tBaseMagg= new TextField();
	
	Label lRisultato= new Label();
	
	public void start ( Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Rombo");
		finestra.show();
		
		Label lBaseMin= new Label("Diagonale Minore");
		Label lBaseMagg= new Label("Diagonale Maggiore");
		
		Button pArea= new Button("AREA");
		Button pPerimetro= new Button("PERIMETRO");

		pArea.setMinWidth(100); 
		pPerimetro.setMinWidth(100);
		griglia.add(tBaseMin, 0, 0);
		griglia.add(tBaseMagg, 0, 1);
		griglia.add(lBaseMin, 1, 0);
		griglia.add(lBaseMagg, 1, 1);
		griglia.add(pArea, 0, 2);
		griglia.add(pPerimetro, 1, 2);
		griglia.add(lRisultato, 0, 3, 1, 3 );
		
		pArea.setOnAction(e -> Area());
		pPerimetro.setOnAction(e -> Perimetro() );
		
		
	}
	
	public void Area() {
		
		int BaseMin = Integer.parseInt(tBaseMin.getText());
		int BaseMagg = Integer.parseInt(tBaseMagg.getText());
		int Area= (BaseMin*BaseMagg)/2;
		lRisultato.setText(""+Area);
	}
	
	public void Perimetro() {
		
		int BaseMin = Integer.parseInt(tBaseMin.getText());
		int BaseMagg = Integer.parseInt(tBaseMagg.getText());
		double Lato= Math.sqrt(Math.pow(BaseMin / 2, 2) + Math.pow(BaseMagg / 2, 2)) ;
		int Perimetro= (int) (Lato*4);
		lRisultato.setText(""+Perimetro);
	}
	public static void main(String [] args) {
		launch( args);
	}
}

