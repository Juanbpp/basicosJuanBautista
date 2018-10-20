/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosjuanbautista;

/**
 *
 * @author usu
 */
public class BasicosJuanBautista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logicos();
        // TODO code application logic here
        numericos();
// TODO code application logic here
        cadenas();// TODO code application logic here
    }

     /**
     * Método para mostrar ejemplos de tipos cadenas.
     */
    private static void cadenas() {
    
        //Estos son los tipos básicos
        char cadena;
        char cadena2;
        
        //Ejemplos de asignación de valores a las variables de tipos básicos
        cadena = 'a';
        cadena2 = 97;
        String cadena3 = "Juan Bautista Penalva Perez";
        
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor cadena = a");
        System.out.println(cadena);
        System.out.println("Valor cadena2 = 97");
        System.out.println(cadena2);
        System.out.println("Valor cadena3 = Juan Bautista Penalva Perez");
        System.out.println(cadena3);
        System.out.println("longitud cadena3 = Juan Bautista Penalva Perez");
        System.out.println(cadena3.length());
        System.out.println("caracter numero 10 de la cadena3 = Juan Bautista Penalva Perez");
        System.out.println(cadena3.charAt(10));
            
    }

    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    private static void numericos() {
    //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;
        
        //Ejemplos de asignación de valores a las variables de tipos básicos
        elMasPeque=1;
        chiquitin=235;
        entero = 500000;
        duplicaEntero = 9000000000000L;
        grande = 4.50f;
        doble = 4.432235453323434242;
        
        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Los numeros enteros son:");
        System.out.println("Los de tipo byte que tiene 1 byte:");
        System.out.println(elMasPeque);
        System.out.println("Los de tipo short que tienen 2 bytes:");
        System.out.println(chiquitin);
        System.out.println("Los de tipo int que tienen 4 bytes:");
        System.out.println(entero);
        System.out.println("Los de tipo long que tienen 8 bytes:");
        System.out.println(duplicaEntero);
        System.out.println("Los de tipo float que tienen 4 bytes:");
        System.out.println(grande);
        System.out.println("Los de tipo double que tienen 8 bytes:");
        System.out.println(doble);
        
    }

     /**
     * Método para mostrar ejemplos de tipos logicos.
     */
    private static void logicos() {

        //Estos son los tipos básicos
        boolean verdadero;
        boolean falso;


        //Ejemplos de asignación de valores a las variables de tipos básicos
        verdadero = true;
        falso = false;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.out.println("Valor verdadero");
        System.out.println(verdadero);
        System.out.println("Valor falso");
        System.out.println(falso);
        System.out.println("Operadores logicos AND");
        System.out.println(verdadero && falso);
        System.out.println("Operadores logicos OR");
        System.out.println(verdadero || falso);
        System.out.println("Operadores logicos not sobre falso");
        System.out.println(!falso);
   }
    
}
