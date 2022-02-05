
package loops.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/** Lista 03
 *  Questao 31
 * @author VAIO
 */
public class Q31_AumentoSalario {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salario = 1000;
        double percentual = 1.5;
    
        salario += (salario/100) *percentual;
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        
        for(int i = 1997;i<2023;i++){
            
            percentual *= 2;
            
            salario += (salario/100)*percentual;
            
            System.out.println(i+ " = "+ df.format(salario) + " - " + 
                    percentual + "%");
        }
    }
    
    
    
}
