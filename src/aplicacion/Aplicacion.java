/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author alejandro.j-erades
 */
public class Aplicacion {
    
    static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println(veredicto(args[1], args[2]));
    }
    
}
