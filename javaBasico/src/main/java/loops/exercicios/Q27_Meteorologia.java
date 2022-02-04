
package loops.exercicios;

import java.util.Scanner;

/** Lista 03
 *  Questao 27
 * @author VAIO
 */
public class Q27_Meteorologia {

    public static void main(String[] args) {
        
         
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Entre com a qtd de temperaturas");
        int qtdTemperaturas = scan.nextInt();
        
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        
        for(int i=1; i<= qtdTemperaturas;i++){
            
            System.out.println("Entre com a temperatura " + i);
            temp = scan.nextDouble();
            
            soma += temp;
            
            if (temp > maior){
                maior = temp;
            }
            
            if (temp < menor){
                menor = temp;
            }
        }
        
        System.out.println("Média: " + (soma/qtdTemperaturas));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
    }
    
}
