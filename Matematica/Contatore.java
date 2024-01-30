package it.edu.iisgubbio.prove.PrimeInterfaccie;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Contatore extends Application{
	
	TextField tNome= new TextField();
	TextField tCognome= new TextField();
	Label lRisposta = new Label("Ciao, sono impaziente");
	
	public void start (Stage finestra) {
		
		GridPane griglia = new GridPane();
		
		griglia.setPadding(new Insets(20, 20, 20, 20));
		
		Scene scena= new Scene(griglia, 300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Calcolatore");
		finestra.show();
		
		Button pScrivi= new Button();
		Button pCancella= new Button();
		Button pSvuota= new Button();
		
		pScrivi.setMinHeight(75);
		pScrivi.setMinWidth(65);
		
		
		pSvuota.setMinWidth(315);
		pScrivi.setText("scrivi");
		pCancella.setText("cancella");
		pSvuota.setText("svuota");
		
		ImageView immagine = new ImageView("/it/edu/iisgubbio/prove/PrimeInterfaccie/cestino.jpeg");
		
		pCancella.setGraphic( immagine );
		
		griglia.add(pScrivi, 0, 0, 1, 2);
		griglia.add(pCancella, 1, 0, 1, 2 );
		griglia.add(pSvuota, 0, 2, 2, 2);
		griglia.add(tNome, 3, 0);
		griglia.add(tCognome, 3, 1);
		griglia.add(lRisposta, 0, 5);
		
		pScrivi.setOnAction( e -> scrivi());
		
		pCancella.setOnAction( e -> cancella());
		
		pSvuota.setOnAction(e -> svuota());
	}
		public void scrivi() { 
			String nome;
			String cognome;
			nome = tNome.getText();
			cognome = tCognome.getText();
			
			lRisposta.setText("ciao "+ nome + " "+ cognome);
			
		}
		
		public void cancella() { 
			tNome.setText("Nome");
			tCognome.setText("Cognome");
		}
		
		public void svuota() { 
			tNome.setText("");
			tCognome.setText("");
			lRisposta.setText("");
		}
		
	public static void main (String [] args) {
		launch(args);
	}
}
