package atividade01;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite suas notas do bimestre, e em seguida P para ponderada, A para aritmetica:");
		
		
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		float nota3 = scan.nextFloat();
		String tipomedia = scan.next();
		float resultado;
	
		if (tipomedia == "A") {
		 resultado = (nota1 + nota2 + nota3) / 3;
		
		}
		else {
		resultado  = ((nota1 * 2) + (nota2 * 4) + (nota3 * 6)) / (2 + 4 + 6);
		}
		
		if (resultado < 5) {
			System.out.println(resultado + "seu conceito foi D, ESTUDE!!");
		}
		else if (resultado < 7) {
			System.out.println(resultado + "seu conceito foi D, pode melhorar!");
		}
		else if (resultado < 9) {
			System.out.println(resultado + "seu conceito foi B, muito bom!");
		}
		else {
			System.out.println(resultado + "seu conceito foi A, excelente!!");
		}
		
	}

}
