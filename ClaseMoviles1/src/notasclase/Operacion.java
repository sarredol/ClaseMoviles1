package notasclase;

import java.util.Scanner;

public class Operacion {

    public static void main(String [] args){

        Scanner sc = new Scanner( System.in);

        //operaciones Aritmeticas +,-,*,/,%//

        double resultado = 3+2/7*3;

        System.out.println(resultado);

        System.out.println("Ingrese el numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el numero");
        int num2 = sc.nextInt();

        int operacionSuma = num1 + num2;

        int operacionResta = num1 - num2;

        int operacionMultiplicacion = num1 * num2;

        double operacionDivision = num1 / num2;

        double operacionModulo = num1 % num2;


        System.out.println("Resultado Suma: " + operacionSuma);
        System.out.println("Resultado resta: " + operacionResta);
        System.out.println("Resultado Multiplicacion: " + operacionMultiplicacion);
        System.out.println("Resultado Division: " + operacionDivision);
        System.out.println("Resultado Modulo: " + operacionModulo);

        //Operaciones comparacion -->Boolean (Verdadero, falso)//

        System.out.println("num1 es mayor que num2");
        boolean esMayor = num1 > num2;
        System.out.println("Es mayor?" + esMayor);

        System.out.println("num1 es menor que num2");
        boolean esMenor = num1 < num2;
        System.out.println("Es menor?" + esMenor);

        System.out.println("num1 es Igual que num2");
        boolean esIgual = num1 == num2;
        System.out.println("Es igual?" + esIgual);

        System.out.println("num1 no es igual que num2");
        boolean noEsIgual = num1 != num2;
        System.out.println("No es igual?" + noEsIgual);

        //Operadores Logicos &&=Y  ||= o //

        boolean telefono = false;
        boolean correo = false;

        boolean contraseña = false;

        boolean ingreso = (telefono || correo )&& contraseña;

        System.out.println("Su ingreso es: " + ingreso);


        // Ejemplo de uso de operadores de asignación +=, -=, *=, /=, %=,

        int num3 = 5;

        //num3 = num3 + num2;

        num3 += num1;

        System.out.println(num3);

        // Operaciones incremeto decremento i++, i--, --i, ++i
    }
}
