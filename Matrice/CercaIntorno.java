package it.edu.iisgubbio.Matrice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CercaIntorno extends Application{

	int matrice[][]= new int[5][5];
	
	Label l1= new Label();
	Label l2= new Label();
	Label l3= new Label();
	Label l4= new Label();
	Label l5= new Label();
	
	TextField tX= new TextField("inserisci la x");
	TextField tY= new TextField("inserisci la y");
	
	Label lTrova= new Label();
	
	public void start(Stage finestra) throws Exception {

		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena=new Scene(griglia, 300 ,225);
		
		finestra.setScene(scena);
		finestra.setTitle("Cerca Intorno");
		finestra.show();	
		
		Button pGenera= new Button("GENERA");
		Button pTrova= new Button("TROVA");
		
		pGenera.setPrefWidth(300);
		
		griglia.add(pGenera, 0, 0, 2, 1);
		griglia.add(l1, 0, 1, 2, 1);
		griglia.add(l2, 0, 2, 2, 1);
		griglia.add(l3, 0, 3, 2, 1);
		griglia.add(l4, 0, 4, 2, 1);
		griglia.add(l5, 0, 5, 2, 1);
		griglia.add(tX, 0, 6);
		griglia.add(tY, 0, 7);
		griglia.add(pTrova, 0, 8);
		griglia.add(lTrova, 0, 9);
		
		pGenera.setOnAction(e -> Genera());
		
		pTrova.setOnAction(e -> Trova());
	}
	
	private void Genera() {
		
		String s1= "";
		String s2= "";
		String s3= "";
		String s4= "";
		String s5= "";
		
		for(int x=0; x < 5; x++) {
			
			for(int y=0; y < 5; y++) {
				
				int random= (int) (Math.random()*100);
				
				matrice[x][y]= random;
				
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
		
	}
	
	private void Trova() {
		
		int cX= Integer.parseInt(tX.getText());
		int cY= Integer.parseInt(tY.getText());
		
		int MaxX = 0;
		int MaxY = 0;
		
		if(cY-1 < 0) {
			
			lTrova.setText("OUT OF RANGE");
			
		}else {
			
			if(cY+1 > 4) {
				
				lTrova.setText("OUT OF RANGE");
				
			}else {
				
				if(cX-1 < 0) {
					
					lTrova.setText("OUT OF RANGE");
					
				}else {
					
					if(cX+1 > 4) {
						
						lTrova.setText("OUT OF RANGE");
						
					}else {
						
						if(matrice[cX-1][cY] > matrice[cX][cY]) {
							
							if(matrice[MaxX][MaxY] > matrice[cX-1][cY]) {
								
								MaxX=cX-1;
								
								MaxY=cY;
							}
							
						}
						if(matrice[cX+1][cY] > matrice[cX][cY]) {
							
							if(matrice[MaxX][MaxY] > matrice[cX+1][cY]) {
								
								MaxX=cX+1;
								
								MaxY=cY;
							}
							
						}
						if(matrice[cX][cY-1] > matrice[cX][cY]) {
							
							if(matrice[MaxX][MaxY] > matrice[cX][cY-1]) {
								
								MaxX=cX;
								
								MaxY=cY-1;
							}
							
						}
						if(matrice[cX][cY+1] > matrice[cX][cY]) {
							
							if(matrice[MaxX][MaxY] > matrice[cX][cY+1]) {
								
								MaxX=cX;
								
								MaxY=cY+1;
							}
							
						}
					}
					
				}
				
			}
			
		}
		lTrova.setText("è stato troato una valore maggiore nelle coordinate: "+cX+","+cY);
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
