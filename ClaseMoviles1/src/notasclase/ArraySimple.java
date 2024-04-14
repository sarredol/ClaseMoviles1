package notasclase;

public class ArraySimple {

    public static void main (String[] args){

        // Este tipo de array es estático, por lo que no podemos agregar nuevos elementos
        // Lo que si puedo hacer es modificar los existentes

        int [] edades = {35, 45, 23, 38, 46};

        //        index=  0   1   2   3   4

        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        System.out.println(edades[4]);

        // Podemos saber el tamaño de un array usuando el atributo .length

        System.out.println( edades.length);

        //edades[5]=23;

        edades[2]= 29;

        System.out.println("Esta es la posición dos " + edades[2]);

        // Para recorrer los arrays tenemos las estructuras for y foreach

        System.out.println("---------------ciclo for-------------------");

        for (int i = 0; i < edades.length; i++){
            System.out.println(edades[i]);
        }

        System.out.println("---------------ciclo foreEach-------------------");

        // Funciona de una forma abrebiada

        for (int i: edades){
            System.out.println(i);
        }

        System.out.println("---------------Array con un while-------------------");

        // Podemos recorrer el Array con un while

        int i = 0;

        while (i< edades.length){

            System.out.println(edades[i]);

            i++;
        }

        // Cuando utilizar un for o un while
        // Cuando conocemos el tamaño utilizamos un For
        // Cuando no conocemos un numero de interaciones necesarias para romper la condición usamos un while
    }
}
