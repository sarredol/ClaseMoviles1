package notasclase;

import java.util.Scanner;

public class practicaArray2 {

    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        //String paises[]= new String[5];
        //paises[0]="Colombia";

        String primerPais = sc.nextLine();
        String segundoPais = sc.nextLine();
        String tercerPais = sc.nextLine();

        String paises[] = {primerPais,segundoPais,tercerPais};


        System.out.println(paises[0]);
        System.out.println(paises[1]);
        System.out.println(paises[2]);

        for (int i=0; i< paises.length;i++){
            System.out.println(paises[i]);
        }

        for (String pais: paises){
            System.out.println(pais);
        }
    }
}
