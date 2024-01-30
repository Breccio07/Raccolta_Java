package it.edu.iisgubbio.prove.PrimeInterfaccie;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaInterfaccia extends Application{
		
	TextField tUno= new TextField();
	TextField tDue= new TextField();
		
	Label lUno= new Label();
	Label lUnoDue= new Label();
	Label lDue= new Label();

	public void start(Stage finestra) {
		
		Button bCopiaSx= new Button("Copia");
		Button bCopiaDx= new Button("Copia");
		Button bUnisci= new Button("Unisci");
		Button bPulisci= new Button("Pulisci");
								
		GridPane griglia= new GridPane();
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("PrimaInterfaccia");
		finestra.show();
		
		griglia.add(tUno, 0, 0);
		griglia.add(bUnisci, 1, 0);
		griglia.add(tDue, 2, 0);
		
		griglia.add(bCopiaSx, 0, 1);
		griglia.add(lUnoDue, 1, 1);
		griglia.add(bCopiaDx, 2, 1);
		
		griglia.add(lUno, 0, 2);
		griglia.add(bPulisci, 1, 2);
		griglia.add(lDue, 2, 2);
		
		bCopiaSx.setOnAction(e -> copia1());
		bCopiaDx.setOnAction( e -> copia2());
		
		bUnisci.setOnAction(e -> unisci());
		
		bPulisci.setOnAction(e -> pulisci());
	}
	
	public void copia1() {
		String parte1;
		parte1= tUno.getText();
		lUno.setText(parte1);
		
	}
	
	public void copia2() {
		String parte2;
		parte2= tDue.getText();
		lDue.setText(parte2);
		
	}
	
	public void unisci() {
		String uno;
		String due;
		uno= tUno.getText();
		due=tDue.getText();
		lUnoDue.setText(uno + " " + due); 
				
	}
	
	public void pulisci() {
		lUno.setText("");
		lDue.setText("");
		lUnoDue.setText("");
		tUno.setText("");
		tDue.setText("");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
