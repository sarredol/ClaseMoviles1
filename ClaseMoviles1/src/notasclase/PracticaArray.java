package notasclase;

import java.util.Scanner;

public class PracticaArray {

    public static  void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Como se declara un array

        // 1ER CASO: Llenar un formulario:

        String[] datosUsuario = new String[5];

        //datosUsuario[0]="Pepito"

        for (int i= 0; i< datosUsuario.length; i++){

            System.out.println("Ingrese el dato #" + (i+1));
            datosUsuario[i] = sc.nextLine();
        }

        for ( String dato : datosUsuario){
            System.out.println(dato);
        }

    }
}
