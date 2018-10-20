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
        System.err.println("Valor cadena = a");
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
    
}
