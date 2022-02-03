
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questao 25
 * @author VAIO
 */
public class Q25_CaixaRegistradora {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lojas Tabajara");
        
        int i = 1;
        
        float total = 0;
        while(true){
            
            System.out.printf("Produto %d : R$ \n",i);
            float valor = scan.nextFloat();
           
            total += valor;
            if(valor == 0){
                System.out.println("Total: R$ " + total + "\n \n");
                i = 1;
            }else{
                i++;
            }
            
        }
        
        
    }
    
}
