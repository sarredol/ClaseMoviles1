package notasclase;

public class Variable {

    public static void main(String[] args){


        byte numByte;

        numByte= 127;

        short numShort= 32767;

        int numInt= 2147483647;

        // Casting de variable

        short numByteShort= (short) numByte;

        System.out.println(numByteShort);

        numByteShort = 128;

        System.out.println(numByteShort);

        int numShortInt = (int) numInt;

        numShortInt= 1160000;

        byte numIntByte;

        /// Parseo:
        String numString= "32";
        System.out.println();

        // pasar un numero en texto
        int numInt2= 25;
        String numIntToString= numInt2 + "";

        // Variable por tipo de datos

        String name= "Pepito";

        byte num1= 127;

        float nota= 4.5f;

        double salario= 1300000;

        long numeroLargo= 3054215292l;

        boolean trabaja = true;

        boolean casado = false;

        char arroba = 64;

        System.out.println(arroba);

        //constante
        final float PI =3.1416f;

        //concatenacion con operador +

        String nombre = "Sebastian Arredondo";
        int edad = 29;
        double pagoRecibido = 1300000;
        boolean esEmpleado = true;
        System.out.println("El empleado" + nombre + "\n" + " tiene " + edad + "\n" + " gana " + pagoRecibido + "\n" + " y se encuentra activo" + "\n" + esEmpleado);



    }
}
