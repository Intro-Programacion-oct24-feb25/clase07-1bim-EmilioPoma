/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

/**
 *
 * @author reroes
 */
public class Ejemplo0112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 13;
        int numerador = 1;
        
        while (numerador <= limite) {
            System.out.printf("%d\n", numerador);
            numerador += 1;
            }
        System.out.printf("Variable fuera del while: %d\n", numerador);
        }
    
}
