package quadradoMagico;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int linha = 0, coluna = 0, principal = 0;
		int n = sc.nextInt(); 
		int [][] mat = new int [n][n]; 
		
		for (int i=0; i<mat.length; i++) {  
			for (int j=0; j<n; j++) { 
				mat[i][j] = sc.nextInt(); 	
			}
		}
		for (int i=0; i<mat.length; i++) { 
			linha = 0;
			for (int j=0; j<mat[i].length; j++) { 
				linha += mat [i][j]; 
			}	
			System.out.println("Linha: "+ linha);
		}
		for (int i=0; i<mat.length; i++) { 
			coluna = 0;
			for (int j=0; j<mat[i].length; j++) { 
				coluna += mat [j][i];
			}
			System.out.println("Coluna:" + coluna);
		}
		for (int i=0; i<mat.length; i++) {
			int aux = 0;
			aux += mat[i][i];
			principal += aux ;
		}
		System.out.println("Diagonal: " + principal);
		if (coluna != linha || coluna != principal) {
			System.out.println("");
			System.out.println("Não é um quadrado mágico!");
		}
		else {
			System.out.println("");
			System.out.println("Quadrado mágico!");
		}
		sc.close();
	}
}
		
				
		
		