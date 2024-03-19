package it.edu.iisgubbio.Converitore;

import java.util.Hashtable;

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
		
		Hashtable<Integer, String> interi = new Hashtable<Integer, String>();
		
		interi.put(10, "A");
		interi.put(11, "B");
		interi.put(12, "C");
		interi.put(13, "D");
		interi.put(14, "E");
		interi.put(15, "F");
		
		interi.get(10);
		interi.get(11);
		interi.get(12);
		interi.get(13);
		interi.get(14);
		interi.get(15);
		
		Hashtable<String, Integer> dizionario = new Hashtable<String, Integer>();
		
		dizionario.put("A", 10);
		dizionario.put("B", 11);
		dizionario.put("C", 12);
		dizionario.put("D", 13);
		dizionario.put("E", 14);
		dizionario.put("F", 15);
		
		dizionario.get("A");
		dizionario.get("B");
		dizionario.get("C");
		dizionario.get("D");
		dizionario.get("E");
		dizionario.get("F");
		
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
			
			for(int i=0; i< n.length; i++) {
				
				if(n[i] == "A") {
					
					n[i] = "10";
					
				}
				
				if(n[i] == "B") {
					
					n[i] = "10";
					
				}
				
				if(n[i] == "C") {
					
					n[i] = "10";
					
				}
				
				if(n[i] == "D") {
					
					n[i] = "10";
					
				}
				
				if(n[i] == "E") {
					
					n[i] = "10";
					
				}
				
				if(n[i] == "F") {
					
					n[i] = "10";
					
				}
				
			}
			
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