import java.util.Scanner;
public class Exec4_Q3{



public static void preencher (double [ ] [ ] mat){ 
Scanner in = new Scanner (System.in); 
int i, j; for (i = 0; i < mat.length; i++) { 
for (j = 0; j < mat[i].length; j++) { 
mat[i][j] = in.nextDouble(); 

      } 
    }
  }
  public static void exibir (double [ ] [ ] mat){ 
    int i, j;
    for (i = 0; i < mat.length; i++) {
      for (j = 0; j < mat[i].length; j++) {
       System.out.prinln(mat[i][j]);
      } 
    }
  }

public static void usuario(double [ ] [ ] mat){ 

int b;

System.out.println("\n Insira o número de linhas desejados para sua matriz:”);
b[0] = read.nextInt();

System.out.println("\n Insira o número de colunas desejados para sua matriz:”);
b[1] = read.nextInt();

}


  public static void main (String [ ] args ) {

  System.out.println (“Qual o tamanho da sua matriz?”);
  usuario (matriz);

   double [] [] matriz = new double [b[0]][b[1]]; 
   
   System.out.println (“Preenchimento da matriz.”); 
    preencher (matriz); 

    System.out.println ("Exibição da matriz.");
    exibir(matriz);  
    
  }
}