package it.edu.iisgubbio.prove.PrimeInterfaccie;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SecondaInterfaccia extends Application {

	TextField tNome = new TextField();
	TextField tCognome= new TextField();
	TextField tIndirizzo= new TextField();
	Label lUnisci= new Label();
	
	public void start(Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("NomeCognomeIndirizzo");
		finestra.show();
		
		Button pScrivi = new Button("Scrivi");
		
		griglia.add(tNome, 0, 0);
		griglia.add(tCognome, 1, 0);
		griglia.add(pScrivi, 0, 2);
		griglia.add(tIndirizzo, 0, 1);
		griglia.add(lUnisci, 0,3 );
		
		pScrivi.setOnAction( e -> esegui());
	}
	
	public void esegui() {
		
		String nome;
		String cognome;
		String indirizzo;
		
		nome=tNome.getText();
		cognome=tCognome.getText();
		indirizzo=tIndirizzo.getText();
		
		lUnisci.setText("Tu sei " + nome + "" + cognome + " e abiti in " + indirizzo);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
