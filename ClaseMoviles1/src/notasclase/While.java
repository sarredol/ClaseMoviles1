package notasclase;

import java.util.Scanner;

public class While {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        int servicios =8;

        while (servicios >0){
            System.out.println("Servicio:" + servicios);
            //servicios-=1;
            servicios--;
        }

    }
}
