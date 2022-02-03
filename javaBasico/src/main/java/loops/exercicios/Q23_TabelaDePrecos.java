
package loops.exercicios;

/** Lista 03
 *  Questao 23
 * @author VAIO
 */
public class Q23_TabelaDePrecos {

    public static void main(String[] args) {
        
        System.out.println("\nTabela de precos: \n");
        
        float valor = 0;
        for(int i = 1; i<51; i++){
            valor += 1.99;
            System.out.printf("%2d - R$ %.2f \n",i,valor );
        }
    }
    
}
