package it.edu.iisgubbio.Converitore;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Convertitore extends Application{

	TextField tValore= new TextField();
	TextField tBaseP= new TextField();
	TextField tBaseA= new TextField();
	
	Label lRisultato= new Label();
	
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		griglia.setPadding(new Insets(10));
		
		Scene scena = new Scene(griglia, 300, 300);
		
		finestra.setScene(scena);
		finestra.setTitle("Converitore");
		finestra.show();
		
		Label lConversione= new Label("N. da convertire");
		Label lBaseP= new Label("Base partenza");
		Label lBaseA= new Label("Base arrivo");
		Label lConverito= new Label("N. convertito");
		
		Button pCalcola= new Button("CONVERTI");
		
		griglia.add(lConversione, 0, 0);
		griglia.add(tValore, 0, 1);
		griglia.add(tBaseP, 0, 3);
		griglia.add(lBaseP, 0, 2);
		griglia.add(tBaseA, 0, 5);
		griglia.add(lBaseA, 0, 4);
		griglia.add(pCalcola, 0, 7);
		griglia.add(lConverito, 0, 8);
		griglia.add(lRisultato, 0, 9, 2, 1);
	
		pCalcola.setOnAction(e -> Calcola());
	}
	
	private void Calcola() {
		
		int baseA= Integer.parseInt(tBaseA.getText());
		int baseP= Integer.parseInt(tBaseP.getText());
		int valore= Integer.parseInt(tValore.getText());
		
		int Resto=0;
		
		String s="";
		
		if(baseP == 10) {
			
			while(valore > 0) {
				
				Resto= valore;
				
				valore= valore / baseA;
				
				Resto= Resto-(valore*baseA);
				
				if( Resto < 10 ) {
					
					s= Resto+s;
					
				}else {
					
					if(Resto == 10) {
						
						s= "A" + s;
						
					}
					if(Resto == 11) {
						
						s= "B" + s;
						
					}
					if(Resto == 12) {
						
						s= "C" + s;
						
					}
					if(Resto == 13) {
						
						s= "D" + s;
						
					}
					if(Resto == 14) {
						
						s= "E" + s;
						
					}
					if(Resto == 15) {
						
						s= "F" + s;
						
					}
					
				}
			}
		}
		
		if(baseA == 10) {
			
			int Somma=0;
			
			int Potenza=0;
			
			String n[]= tValore.getText().split("");
			
			int v[]= new int[n.length];
			
			for(int i=0; i< v.length; i++) {
				
				v[i]=Integer.parseInt(n[i]);
				
			}
			
			Potenza = v.length;
			
			for(int i=0; i < v.length; i++) {
				
				Somma+= v[i]*Math.pow(baseP, Potenza-1);
				
				Potenza--;
				
				s= ""+Somma;
		}
		}
		lRisultato.setText(s);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}