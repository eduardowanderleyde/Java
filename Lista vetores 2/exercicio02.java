import java.util.Scanner;


public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X, Y, Z; //Escreva um programa que leia tr�s valores para os lados de um tri�ngulo

      	System.out.print("Verificador de Tri�ngulo\n\n");


        System.out.print("Digite o lado A=");
        X = entrada.nextInt(); //Escreva um programa que leia tr�s valores para os lados de um tri�ngulo
		
        System.out.print("Digite o lado B=");
        Y = entrada.nextInt(); //Escreva um programa que leia tr�s valores para os lados de um tri�ngulo
		
		System.out.print("Digite o lado C=");
        Z = entrada.nextInt(); //Escreva um programa que leia tr�s valores para os lados de um tri�ngulo


		if( X < Y + Z && Y < X + Z && Z < X + Y ){ //Verificar se cada lado � menor que a soma dos outros dois lados.
			if(X==Y && Y == Z){ //saber de A==B e se B==C, sendo verdade o tri�ngulo � eq�il�tero
				System.out.print("O tri�ngulo � Eq�il�tero.");
			}else if(X==Y || X==Z || Y==Z){ //Se n�o, verificar de A==B ou se A==C ou se B==C, sendo verdade o tri�ngulo � is�sceles
				System.out.print("O tri�ngulo � Is�sceles.");
			}else{ //e caso contr�rio, o tri�ngulo ser� escaleno
				System.out.print("O tri�ngulo � Escaleno.");
			}
		}else{ //Caso os lados fornecidos n�o caracterizarem um tri�ngulo, avisar a ocorr�ncia.
			System.out.print("Os lados fornecidos n�o caracterizam um tri�ngulo");
		}

    }

}