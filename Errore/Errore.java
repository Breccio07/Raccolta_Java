package it.edu.iisgubbio.Errori;

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

	TextField tValore= new TextField();
	
	RadioButton c1= new RadioButton("Bit di parità");
	RadioButton c2= new RadioButton("Hamming (8 bit)");
	RadioButton c3= new RadioButton();
	
	Label lRisultato = new Label();
	
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia= new GridPane();
		griglia.setVgap(10);
		griglia.setHgap(10);
		
		Scene scena= new Scene(griglia,300, 250);
		finestra.setScene(scena);
		finestra.setTitle("Errore (D.M)");
		finestra.show();
		
		ToggleGroup Errore = new ToggleGroup();
		
		c1.setToggleGroup(Errore);
		c2.setToggleGroup(Errore);
		c3.setToggleGroup(Errore);
		
		Label lValore= new Label("Inserisci valore");
		
		Button pCalcola= new Button("CALCOLA");
		
		griglia.add(lValore, 0, 0);
		griglia.add(tValore, 0, 1);
		griglia.add(c1, 0, 2);
		griglia.add(c2, 0, 3);
		griglia.add(c3, 0, 4);
		griglia.add(pCalcola, 0, 5);
		griglia.add(lRisultato, 0, 6);
		
		pCalcola.setOnAction(e -> Calcola());
		
	}
	
	private void Calcola() {
		
		String vS[] = tValore.getText().split("");
		
		if(c1.isSelected()) {
			
			int v[] = new int [vS.length];
			
			for(int i=0; i < v.length; i++) {
				
				v[i] = Integer.parseInt(vS[i]);
				
			}
			
			int c=0;
			
			for(int i=0; i < vS.length; i++) {
				
				if(v[i] == 1) {
					
					c++;
					
				}
				
			}
			
			String s="";
			
			for(int i=0; i < vS.length; i++) {
				
				s+=vS[i];
				
			}
			
			if(c %2 ==0) {
				
				s+="0";
				
			}else {
				
				s+="1";
				
			}
			lRisultato.setText(s);
			
		}
		if(c2.isSelected()) {
			
			int v[] = new int [12];
			
			for(int i=0; i < v.length-1; i++) {
				
				if(i == 1 || i == 2 || i== 4 || i == 8) {

					
				}else {
					
					v[i] = Integer.parseInt(vS[i]);
					
				}
			}
			
			int c=0;
			
			for(int i =0; i < v.length-1; i++) {
				
				if(v[2] == 1 || v[4] == 1 || v[6] == 1 || v[8] == 1 || v[10] == 1) {
					
					c++;
					
				}
				
			}
			
			if(c % 2 == 0) {
				
				v[0] = 0;
				
			}else {
				
				v[0] = 1;
				
			}
			
			c = 0;
			
			for(int i =0; i < v.length-1; i++) {
				
				if(v[2] == 1 || v[5] == 1 || v[6] == 1 || v[9] == 1 || v[10] == 1) {
					
					c++;
					
				}
				
			}
			
			if(c % 2 == 0) {
				
				v[1] = 0;
				
			}else {
				
				v[1] = 1;
				
			}
			
			c = 0;
			
			for(int i =0; i < v.length-1; i++) {
				
				if(v[4] == 1 || v[5] == 1 || v[6] == 1 || v[11] == 1) {
					
					c++;
					
				}
				
			}
			
			if(c % 2 == 0) {
				
				v[3] = 0;
				
			}else {
				
				v[3] = 1;
				
			}
			
			c = 0;
			
			for(int i =0; i < v.length-1; i++) {
				
				if(v[2] == 1 || v[4] == 1 || v[6] == 1 || v[8] == 1 || v[10] == 1) {
					
					c++;
					
				}
				
			}
			
			if(c % 2 == 0) {
				
				v[7] = 0;
				
			}else {
				
				v[7] = 1;
				
			}
			
			String s ="";
			
			for(int i = 0; i < v.length; i++) {
				
				s+= v[i]+"";
				
			}
			
			lRisultato.setText(s);
			
		}
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
