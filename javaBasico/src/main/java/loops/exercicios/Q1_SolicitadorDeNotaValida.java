 
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 * Questao 01
 * @author VAIO
 */
public class Q1_SolicitadorDeNotaValida {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
    
        boolean valido = false;
        float nota = 0;
        
        do{
            System.out.println("Digite uma nota entre 0 e 10: " );
            nota = scan.nextFloat();
            
            if(nota >= 0 && nota <= 10){
                valido = true;
                System.out.println("A nota digitada é: " + nota);
                
            }else{
                System.out.println("Tente novamente!Digite outra nota "
                    + "que esteja no intervalo! ");
                
                
            }
            
        }while(!valido);
        
        
    }
    
}
