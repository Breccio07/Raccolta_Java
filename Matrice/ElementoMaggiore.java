package it.edu.iisgubbio.Matrice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ElementoMaggiore extends Application{

	Label l1= new Label();
	Label l2= new Label();
	Label l3= new Label();
	Label l4= new Label();
	Label l5= new Label();
	Label lMax= new Label();
	
	public void start(Stage finestra) throws Exception {

		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena=new Scene(griglia, 300 ,225);
		
		finestra.setScene(scena);
		finestra.setTitle("Matrice Random");
		finestra.show();	
		
		Button pTrova= new Button("TROVA");
		
		pTrova.setPrefWidth(300);
		
		griglia.add(pTrova, 0, 0, 2, 1);
		griglia.add(l1, 0, 1, 2, 1);
		griglia.add(l2, 0, 2, 2, 1);
		griglia.add(l3, 0, 3, 2, 1);
		griglia.add(l4, 0, 4, 2, 1);
		griglia.add(l5, 0, 5, 2, 1);
		griglia.add(lMax, 0, 6, 2, 1);
		
		pTrova.setOnAction(e -> Trova());
		
	}
	
	private void Trova() {

		int matrice[][] = new int[5][5];
		
		String s1= "";
		String s2= "";
		String s3= "";
		String s4= "";
		String s5= "";
		
		int cX=0;
		int cY=0;
		
		int Max=0;
		
		for(int x=0; x < 5; x++) {
			
			for(int y=0; y < 5; y++) {
				
				int random= (int) (Math.random()*100);
				
				matrice[x][y]= random;
				
				if(matrice[x][y] > Max) {
					
					Max=matrice[x][y];
					
					cX=x;
					cY=y;
					
				}
				
			}	
		}
		
		for(int x=0; x < 5; x++) {
			
			for(int y=0; y < 5; y++) {
					
				if(x == 0) {
					
					s1+= matrice[x][y] + " ";
					
				}
				
				if(x == 1) {
					
					s2+= matrice[x][y] + " ";
					
				}
				
				if(x == 2) {
					
					s3+= matrice[x][y] + " ";
					
				}
				if(x == 3) {
					
					s4+= matrice[x][y] + " ";
					
				}
				if(x == 4) {
					
					s5+= matrice[x][y] + " ";
					
				}
			}
		}
		l1.setText(s1);
		l2.setText(s2);
		l3.setText(s3);
		l4.setText(s4);
		l5.setText(s5);
		
		lMax.setText("il numero più grande è: "+Max+" ed è sulle coordinate: "+cX+","+cY);
	}
		

	
	public static void main(String[] args) {
		launch(args);
	}

}
