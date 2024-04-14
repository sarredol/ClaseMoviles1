package notasclase;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        //1. Recomendaciones imc = bajopeso
        //2. Recomendaciones imc = peso normal
        //3. Recomendaciones imc = Sobrepreso
        //4. Recomendaciones imc = Obesidad

        System.out.println("Seleccione:\n" +
                "1. Bajo peso\n" +
                "2. Peso normal\n"+
                "3. Sobrepeso\n" +
                "4. Obesidad");

        int opc=sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Recomedaciones medicas para aumentar el imc");
                break;
            case 2:
                System.out.println("Recomendaciones medicas para mantener el imc del peso normal");
                break;
            case 3:
                System.out.println("Recomendaciones medicas para disminuir el peso");
                break;
            case 4:
                System.out.println("Recomendaciones medicas para tratar la obesidad");
                break;
            default:
                System.out.println("ingrese una opcion valida");
                break;
        }


    }


}
