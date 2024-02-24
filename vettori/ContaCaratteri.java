package it.edu.iisgubbio.Vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ContaCaratteri extends Application{

	TextField tFrase = new TextField();
	
	Label lRisultato= new Label();
	
	public void start(Stage finestra) throws Exception {

		GridPane griglia= new GridPane();
		
		griglia.setPadding(new Insets(10, 10, 10, 10));
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena = new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("ContaCaratteri");
		finestra.show();
		
		Label lFrase= new Label("Frase");
		
		Button pControlla= new Button("CONTROLLA");
		
		griglia.add(tFrase, 0, 0);
		griglia.add(lFrase, 1, 0);
		griglia.add(pControlla, 0, 1);
		griglia.add(lRisultato, 0, 2, 2, 1);
		
		pControlla.setOnAction(e -> Controlla());
	}
	
	private void Controlla() {
		
		String lettera= tFrase.getText();
		String [] parola=lettera.split("");
		int contaVoc=0;
		int contaCons=0;
		int contaPar=1;
		
		for(int i=0;i<parola.length;i++) {
			if(parola[i].equals("a")|| parola[i].equals("e")|| parola[i].equals("i")| parola[i].equals("o")|| parola[i].equals("u")) {
				contaVoc=contaVoc+1;
				
			}
			else if(parola[i].equals(" ")) {
			contaPar+=1;
			} else {
				contaCons=contaCons+1;
			}
		
	}
		
		lRisultato.setText("Numero di vocali: "+contaVoc+"; numero di consonanti: "+contaCons+"; numeri di parole: "+contaPar);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
