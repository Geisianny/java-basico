
package array.exercicios;

/** Lista 4
 * Questao 24
 * @author VAIO
 */
public class Q24_VetorPalindromos {

    public static void main(String[] args) {
        
        int[] numeros =  new int[10];
        boolean ehPalindromo = false;
        
        for(int i =0; i< 10;i++){
            numeros[i] = 1;
        }
        for(int i = 0;i<10;i++){
            for(int j = 0; j< 10; j++){
                if(numeros[i] == numeros[j]){
                    ehPalindromo = true;
                }else{
                    ehPalindromo = false;
                }
            }
            if(!ehPalindromo){
                System.out.println("Não é um palindromo!");
                break;
            }
            
        }
        if(ehPalindromo){
            System.out.println( "É um palindromo!");
        }
        
        
    }
    
}
