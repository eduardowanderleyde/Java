import java.util.Scanner;
public class Exec4_Q2{

  public static void exibir (double [ ] [ ] mat){ 
    int i, j;
    for (i = 0; i < mat.length; i++) {
      for (j = 0; j < mat[i].length; j++) {
        System.out.prinln(mat[i][j]);
      } 
    }
  }

public static void preencher (double [ ] [ ] mat){ 
Scanner in = new Scanner (System.in); 
int i, j; for (i = 0; i < mat.length; i++) { 
for (j = 0; j < mat[i].length; j++) { mat[i][j] = in.nextDouble(); 

      } 
    }
  }

  public static void main (String [ ] args ) {

    double [] [] matriz = new double [3][3]; 
   
   System.out.println (“Preenchimento da matriz.”); 
    preencher (matriz); 

    System.out.println ("Exibição da matriz.");
    exibir(matriz);  
    
  }
}