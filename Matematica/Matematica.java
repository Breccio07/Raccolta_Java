package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Matematica extends Application{
	
	TextField tX2= new TextField();
	TextField tX= new TextField();
	TextField tN= new TextField();
	
	Label lRisultato= new Label();
	
	public void start(Stage finestra) {
		
		tX2.setMaxSize(50,50);
		tX.setMaxSize(50,50);
		tN.setMaxSize(50,50);
		
		GridPane griglia=new GridPane();
		
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia,300,250);
		finestra.setScene(scena);
		finestra.setTitle("Risolutore di equazioni di 2° grado");
		finestra.show();
		
		Button pCalcola=new Button("CALCOLA");
		
		pCalcola.setMinWidth(100);
		
		Label lX2= new Label("X^2 + ");
		Label lX= new Label("X + ");
		Label lN0= new Label("= 0");
		
		griglia.add(tX2, 0, 0);
		griglia.add(lX2, 1, 0);
		griglia.add(tX,2, 0);
		griglia.add(lX, 3, 0);
		griglia.add(tN, 4, 0);
		griglia.add(lN0, 5, 0);
		griglia.add(pCalcola, 1, 1, 4, 1);
		griglia.add(lRisultato, 1, 2,4,1);
		
		pCalcola.setOnAction(e-> Calcola());
	}
	
	public void Calcola() {
		
		Double Delta; 
		Double X1;
		Double X2 ;
		
		int x2= Integer.parseInt(tX2.getText());
		int x= Integer.parseInt(tX.getText());
		int N= Integer.parseInt(tN.getText());
		
		Delta = Math.pow(x, 2) - 4*(x2)*(N);
			if (Delta > 0) {
				X1= ((-x +Math.sqrt(Delta))/2*x2);
				X2= ((-x -Math.sqrt(Delta))/2*x2);
				lRisultato.setText("Completa: X1= "+X1+" ; X2= "+X2);
			}
			if (Delta == 0) {
				X1= (double) (-x/(2*x2));
				X2= (double) (-x/(2*x2));
				lRisultato.setText("Completa X1= "+X1+" ; X2= "+X2);
			}
			if (Delta < 0) {
				lRisultato.setText("Impossibile");
			}
		}
	
	public static void main(String [] args) {
		launch(args);
	}
}

