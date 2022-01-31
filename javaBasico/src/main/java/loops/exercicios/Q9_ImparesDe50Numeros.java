
package loops.exercicios;

/** Lista 3
 * Questao 9
 * @author VAIO
 */
public class Q9_ImparesDe50Numeros {

    public static void main(String[] args) {
        
        System.out.println("Os numeros impares de o a 50 são: ");
        for(int i = 0; i < 50; i++){
            if( i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
    
}
