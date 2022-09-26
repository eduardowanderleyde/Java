import java.util.Scanner;
	

public static void main(){
	
	public static void main(String[] args) {

     Scanner ler = new Scanner(System.in);

     int pop, filhos, total_filhos=0, i, y=1;

     float sal, total_sal=0, media_sal, media_filhos, maior_sal=0, perc_sal = 0;

     System.out.println("Qual a populacao da cidade..: ");

     pop = ler.nextInt();

     for(i=1;i<=pop;i++){

     System.out.println ("\nQual o seu salario.........: R$ ");

     sal = ler.nextFloat();

     System.out.println ("\nQual a quantia de filhos...: ");

     filhos = ler.nextInt();

     /* Soma dos salarios */

     total_sal = sal + total_sal;

     /* Soma dos filhos */

     total_filhos = total_filhos + filhos;

               /* Maior salario */

               if(maior_sal < sal){

               maior_sal = sal;

               }

               /* Percentagem até R$ 900,00 */

               if(sal <= 900){

               perc_sal = (y * 100) / pop;

               y++;

               }

     }

     /* Media dos salarios */

     media_sal = total_sal / pop;

     /* Media dos filhos */

     media_filhos = total_filhos / pop;

     System.out.println ("\n---------------------------------------------------------------\n");

     System.out.println ("\nA media do salario da populacao eh R$ "+ media_sal);

     System.out.println ("\nA media do numero dos filhos eh "+ media_filhos);

     System.out.println ("\nO maior salario eh R$ "+ maior_sal);

     System.out.println ("\nA percentagem das pessoas com salarios ate R$ 100,00 eh "+perc_sal);

     

   }          

}  	
		
	