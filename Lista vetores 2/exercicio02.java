import java.util.Scanner;


public class ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int X, Y, Z; //Escreva um programa que leia três valores para os lados de um triângulo

      	System.out.print("Verificador de Triângulo\n\n");


        System.out.print("Digite o lado A=");
        X = entrada.nextInt(); //Escreva um programa que leia três valores para os lados de um triângulo
		
        System.out.print("Digite o lado B=");
        Y = entrada.nextInt(); //Escreva um programa que leia três valores para os lados de um triângulo
		
		System.out.print("Digite o lado C=");
        Z = entrada.nextInt(); //Escreva um programa que leia três valores para os lados de um triângulo


		if( X < Y + Z && Y < X + Z && Z < X + Y ){ //Verificar se cada lado é menor que a soma dos outros dois lados.
			if(X==Y && Y == Z){ //saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero
				System.out.print("O triângulo é Eqüilátero.");
			}else if(X==Y || X==Z || Y==Z){ //Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles
				System.out.print("O triângulo é Isósceles.");
			}else{ //e caso contrário, o triângulo será escaleno
				System.out.print("O triângulo é Escaleno.");
			}
		}else{ //Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
			System.out.print("Os lados fornecidos não caracterizam um triângulo");
		}

    }

}