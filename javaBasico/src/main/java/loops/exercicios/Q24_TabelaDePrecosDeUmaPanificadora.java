
package loops.exercicios;

/** Lista 3
 *  Questao 24
 * @author VAIO
 */
public class Q24_TabelaDePrecosDeUmaPanificadora {

    public static void main(String[] args) {
        
        System.out.println("Tabela de preços - Panificadora");
    
        float soma = 0;
        
        for(int i = 1; i<=50;i++){
            
            soma += 0.18;
         
            System.out.printf("%2d - R$ %.2f\n",i,soma);
        }
        
        
    }
    
}
