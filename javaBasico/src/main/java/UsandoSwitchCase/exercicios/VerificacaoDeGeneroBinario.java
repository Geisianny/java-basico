
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 3
 * @author VAIO
 */
public class VerificacaoDeGeneroBinario {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu genero binario: ");
        String genero =  scan.next();
        
        switch(genero){
            case "F":
                System.out.println("Genero: feminino");
                break;
                
            case "M": 
                System.out.println("Genero: Masculino");
                break;
                
            default:
                System.out.println("Genero binario invalido.");
        }       
    }   
    
    
}
