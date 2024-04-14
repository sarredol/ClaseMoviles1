package ejercicios;

public class PracticaVariable {
    public static void main(String [] args){

        String nombre= "Sebastian";
        String apellido="Arredondo Loaiza";
        int edad= 29;
        long nTelefono=3054215292l;
        String direccion= "Calle 76 Sur # 50 C 34";
        String curso="Programacion web1";
        boolean activo= true;

        String numStringpago="1300000";
        int pagoStringToInt= Integer.parseInt(numStringpago);
        System.out.println(pagoStringToInt);

        String numStringpagoCarnet="1200000";
        int pagoCarnetString= Integer.parseInt(numStringpagoCarnet);
        System.out.println(pagoCarnetString);

        int totalPago= pagoStringToInt + pagoCarnetString;

        System.out.println("Nombre " + nombre + "\n" + "Apellido " + apellido + "\n" + "Edad " + edad + "\n" + "Telefono " + nTelefono +
                "\n" + "Direccion " + direccion + "\n" + "Curso " + curso + "\n" + "Estado " + activo + "\n" + "Pago " + pagoStringToInt + "\n" +
                "Pago carnet " + pagoCarnetString + "\n" + "Total a pagar " + totalPago);


    }
}
