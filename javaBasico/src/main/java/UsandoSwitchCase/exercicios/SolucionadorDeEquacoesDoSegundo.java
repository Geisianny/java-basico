
package UsandoSwitchCase.exercicios;

import java.util.Scanner;

/** Lista 2
 * Questao 16
 * @author VAIO
 */
public class SolucionadorDeEquacoesDoSegundo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Como a equação do 2 grau é dada por ax2 + bx + c.");
        System.out.println("Digite o valor de a: ");
        float a = scan.nextFloat();
        
        
        if(a == 0){
            System.out.println("A equação dada não é do segundo grau.");
        }else{
            float b = scan.nextFloat();
            float c = scan.nextFloat();
            
            float delta = 0;
        
            delta = b*b - (4*a*c);
            
            if(delta < 0 ){
                System.out.println("A equação não possui raizes reais.");
            }else if (delta == 0){
                
                float x = (float) ((- b + Math.sqrt(delta) )/(2*a));
                System.out.println("A equação possui apenas uma raiz real, que é"
                        + ": " + x);
                
               
            }else{
               
                float xPos = (float) ((- b + Math.sqrt(delta) )/(2*a));
                float xNega = (float) ((- b - Math.sqrt(delta) )/(2*a));
                
                System.out.printf("A equação possui duas raizes reais: %.2f, "
                        + "%.2f",xPos,xNega);
            }
        }
        
        
        
    }
    
}
