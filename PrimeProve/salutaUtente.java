package it.edu.iisgubbio.PrimeProve;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class salutaUtente extends Application{

	TextField tNome= new TextField();
	TextField tCognome= new TextField();
	Label lMessaggio = new Label("Sono impaziente..");
	Button pSaluta= new Button("Saluta");
	
	public void start(Stage finestra) {
				
		GridPane griglia= new GridPane();
		
		Scene scena= new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("SalutoInterattivo");
		finestra.show();
		
		Label lnome= new Label("nome: ");
		Label lcognome= new Label("cognome:");
		
		griglia.add(lnome, 0, 0);
		griglia.add(tNome, 1, 0);
		griglia.add(pSaluta, 1,2);
		griglia.add(lcognome, 0, 1);
		griglia.add(tCognome, 1, 1);
		griglia.add(lMessaggio, 1,3);
		
		pSaluta.setOnAction(e -> saluta());
	}
	
	public void saluta() {
		String nome;
		String cognome;
		cognome= tCognome.getText();
		nome= tNome.getText();
		lMessaggio.setText("ciao "+ nome +" "+ cognome);
		pSaluta.setText("Saluta un'altro utente");
	} 
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
