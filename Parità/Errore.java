package it.edu.iisgubbio.Parità;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Errore extends Application{

	RadioButton c1 = new RadioButton("Bit di parità");
	RadioButton c2= new RadioButton();
	RadioButton c3= new RadioButton();
	
	TextField tParola= new TextField();
	
	Label lRisultato= new Label();
	
	public void start(Stage finestra){
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("Errore");
		finestra.show();
		
		ToggleGroup genere = new ToggleGroup();
		
		c1.setToggleGroup(genere);
		c2.setToggleGroup(genere);
		c3.setToggleGroup(genere);
		
		Label lParola= new Label("Inserisci la frase");
		
		Button pCalcola= new Button("Calcola");
		
		griglia.add(lParola, 0, 0);
		griglia.add(tParola, 0, 1);
		griglia.add(c1, 0, 2);
		griglia.add(c2, 0, 3);
		griglia.add(c3, 0, 4);
		griglia.add(pCalcola, 0, 5);
		griglia.add(lRisultato, 0, 6);
		
		pCalcola.setOnAction(e -> Calcola());
		
	}
	
	public void Calcola() {
		
		String sV[]=tParola.getText().split("");
		
		if(c1.isSelected()) {
			
			int c=0;
			
			for(int i=0; i < sV.length; i++) {
				
				if(sV[i] == "1") {
					
					c++;
					
				}
			}
			
			String s="";
			
			for(int i=0; i < sV.length; i++) {
				
				s= s+sV[i];
				
			}
			
			if(c % 2 ==0) {
				
				s= s+"1";
				
				lRisultato.setText(s+" (bit di parità = 1)");
				
			}else {
				
				s= s+"0";
				
				lRisultato.setText(s+" (bit di parità = 1)");
			}
			

		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
