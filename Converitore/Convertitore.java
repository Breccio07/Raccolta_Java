package it.edu.iisgubbio.Converitore;

import java.util.*;

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
	
	Hashtable <Integer,String> mydict =  new Hashtable <Integer,String>();
	
	Hashtable <String,String> base16 =  new Hashtable <String,String>();
	
	
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
		
		mydict.put(10, "A");
		mydict.put(11, "B");
		mydict.put(12, "C");
		mydict.put(13, "D");
		mydict.put(14, "E");
		mydict.put(15, "F");
		
		base16.put("1", "1");
		base16.put("2", "2");
		base16.put("3", "3");
		base16.put("4", "4");
		base16.put("5", "5");
		base16.put("6", "6");
		base16.put("7", "7");
		base16.put("8", "8");
		base16.put("9", "9");
		base16.put("A", "10");
		base16.put("B", "11");
		base16.put("C", "12");
		base16.put("D", "13");
		base16.put("E", "14");
		base16.put("F", "15");
		
		int Somma=0;
		
		int Potenza=0;
		
		int valore, Resto;
	
		String n[]= tValore.getText().split("");
		
		for(int i=0; i<n.length; i++) {
			
			n[i] = base16.get(n[i]);
			
		}
		
		int v[]= new int[n.length];
		
		for(int i=0; i< v.length; i++) {
			
			v[i]=Integer.parseInt(n[i]);
			
		}
		
		int baseA= Integer.parseInt(tBaseA.getText());
		int baseP= Integer.parseInt(tBaseP.getText());

		
		String s="";
		
		if(baseP == 10) {
			
			valore= Integer.parseInt(tValore.getText());
			Resto=0;
			
			while(valore > 0) {
				
				Resto= valore;
				
				valore= valore / baseA;
				
				Resto= Resto-(valore*baseA);
				
				if( Resto < 10 ) {
					
					s= Resto+s;
					
				}else {
					
					s = mydict.get(Resto) + s;
					
				}
			}
		}
		
		if(baseA == 10) {
			
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