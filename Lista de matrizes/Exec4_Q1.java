public class Exec4_Q1{

  public static void exibir (double [ ] [ ] mat){ 
    int i, j;
    for (i = 0; i < mat.length; i++) {
      for (j = 0; j < mat[i].length; j++) {
        System.out.prinln(mat[i][j]);
      } 
    }
  }
  public static void main (String [ ] args ) {

    double [] [] matriz = {{0,1,2},{3,4,5},{6,7,8}}; 
    System.out.println ("Exibição da matriz.");
    exibir(matriz);  

  

  }
}