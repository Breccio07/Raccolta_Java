package it.edu.iisgubbio.Converitore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Converitore extends Application{

	TextField tValore= new TextField();
	TextField tBase= new TextField();
	
	Label lRisultato= new Label();
	
	public void start(Stage finestra) throws Exception {

		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena = new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("Converitore");
		finestra.show();
		
		Label lConversione= new Label("N. da convertire");
		Label lBase= new Label("Base");
		Label lConverito= new Label("N. convertito");
		
		Button pCalcola= new Button("CONVERTI");
		
		griglia.add(lConversione, 0, 0);
		griglia.add(tValore, 0, 1);
		griglia.add(tBase, 0, 3);
		griglia.add(lBase, 0, 2);
		griglia.add(pCalcola, 0, 5);
		griglia.add(lConverito, 0, 6);
		griglia.add(lRisultato, 0, 7, 2, 1);
	
		pCalcola.setOnAction(e -> Calcola());
	}
	
	private void Calcola() {
		
		int valore= Integer.parseInt(tValore.getText());
		int base= Integer.parseInt(tBase.getText());
		
		int Resto=0;
		
		String s= "";
		
		
		while(valore > 0) {
			
			Resto= valore;
			
			valore= valore / base;
			
			Resto= Resto-(valore*base);
			
			s= Resto+s;
			
		}
		

		
		lRisultato.setText(s);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
