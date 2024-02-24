package it.edu.iisgubbio.Matrice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BattagliaNavale extends Application{

	Label l1= new Label();
	Label l2= new Label();
	Label l3= new Label();
	Label l4= new Label();
	Label l5= new Label();
	
	Label lColpito= new Label();
	
	TextField tX= new TextField("inserisci la X");
	TextField tY= new TextField("inserisci la Y");
	
	int matrice[][] = new int[5][5];
	
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena=new Scene(griglia, 300 ,225);
		
		finestra.setScene(scena);
		finestra.setTitle("Battaglia Navale");
		finestra.show();	

		Button pGenera= new Button("Genera");
		Button pGioca= new Button("Gioca");
		
		pGenera.setPrefWidth(300);
		
		griglia.add(pGenera, 0, 0, 2, 1);
		griglia.add(l1, 0, 1, 2, 1);
		griglia.add(l2, 0, 2, 2, 1);
		griglia.add(l3, 0, 3, 2, 1);
		griglia.add(l4, 0, 4, 2, 1);
		griglia.add(l5, 0, 5, 2, 1);
		griglia.add(tX, 0, 7);
		griglia.add(tY, 0, 8);
		griglia.add(pGioca, 0, 9);
		griglia.add(lColpito, 0, 10);
		
		pGenera.setOnAction(e -> Genera());
		
		pGioca.setOnAction(e -> Gioca());
		
	}
	
	private void Genera() {
		
		String s1= "";
		String s2= "";
		String s3= "";
		String s4= "";
		String s5= "";
		
		for(int x=0; x < 5; x++) {
			
			for(int y=0; y < 5; y++) {
				
				int random= (int) (Math.random()*2);
				
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
	
	private void Gioca() {
		
		int cX= Integer.parseInt(tX.getText());
		int cY= Integer.parseInt(tY.getText());
		
		if(matrice[cX][cY] == 1) {
			
			if(cY-1 < 0) {
				
				if(matrice[cX][cY+1] == 1) {
					
					lColpito.setText("Colpito");
					
					matrice[cX][cY] = 0;
					
					
				}else {
					
					lColpito.setText("Colpito e affondato");
				
					matrice[cX][cY] = 0;
					
				}
				
			}else {
				
				if(cY+1 > 4) {
					
					if(matrice[cX][cY-1] == 1) {
						
						lColpito.setText("Colpito");
						
						matrice[cX][cY] = 0;
						
						
					}else {
						
						lColpito.setText("Colpito e affondato");
						
						matrice[cX][cY] = 0;
						
					}
				}else {
					
					if(matrice[cX][cY+1] == 1 && matrice[cX][cY-1] ==1) {
						
						lColpito.setText("Colpito");
						
						matrice[cX][cY] = 0;
						
					}else {
						
						lColpito.setText("Colpito e affondato");
						
						matrice[cX][cY] = 0;
						
					}	
				}	
			}
	}else { 
		
		lColpito.setText("Non colpito");
		
	}
}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
