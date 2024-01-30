package it.edu.iisgubbio.Geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Triangolo extends Application {
	
	TextField tBase= new TextField();
	TextField tAltezza= new TextField();
	
	Label lRisultato= new Label();
	
	public void start ( Stage finestra) {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("quadrato");
		finestra.show();
		
		Label lBase= new Label("BASE");
		Label lAltezza= new Label("ALTEZZA");
		
		Button pArea= new Button("AREA");
		Button pPerimetro= new Button("PERIMETRO");

		pArea.setMinWidth(100); 
		pPerimetro.setMinWidth(100);
		griglia.add(tBase, 0, 0);
		griglia.add(tAltezza, 0, 1);
		griglia.add(lBase, 1, 0);
		griglia.add(lAltezza, 1, 1);
		griglia.add(pArea, 0, 2);
		griglia.add(pPerimetro, 1, 2);
		griglia.add(lRisultato, 0, 3, 1, 3 );
		
		pArea.setOnAction(e -> Area());
		pPerimetro.setOnAction(e -> Perimetro() );
		
		
	}
	
	public void Area() {
		
		int Base = Integer.parseInt(tBase.getText());
		int Altezza = Integer.parseInt(tAltezza.getText());
		int Area= Base*Altezza;
		lRisultato.setText(""+Area);
	}
	
	public void Perimetro() {
		
		int Base = Integer.parseInt(tBase.getText());
		int Altezza = Integer.parseInt(tAltezza.getText());
		int Perimetro= (Base+Altezza)*2;
		lRisultato.setText(""+Perimetro);
	}
	public static void main(String [] args) {
		launch( args);
	}
}
