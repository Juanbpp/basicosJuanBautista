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
