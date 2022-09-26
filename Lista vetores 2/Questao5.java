/*
Escreva um algoritmo que calcule e imprima a tabuada do 7 ao considerar a sequência 10 a 25. 
A impressão deve ser no formato:
TABUADA DO 7
7 x 10 = 70
7 x 11= 77
...
7 x 25 = ?*/

public class Questao5{
	
 	public static void main(String[] args){
 		
		System.out.println("TABUADA DO 7");
		for (int n=10; n<=25; n++){
			System.out.println("7 x "+n+" = "+(7*n));		
		}	
	} //FIM DO METODO MAIN
}//FIM DA CLASSE

