
package loops;

/**
 *
 * @author VAIO
 */
public class For {
    
    public static void main(String[] args) {
        
        for(int i = 0; i<5; i++){
            System.out.println("i tem valor: " + i);
            
        }
        
        for(int i = 5; i> 0; i--){
            System.out.println("i tem valor: " + i);
            
        }
        
        for(int cont = 0; cont < 10; cont += 2){
            System.out.println("Valor de cont: "+ cont);
        }
           
        int soma = 0;
        for(int i = 1; i< 5; soma += i++);
        System.out.println("O valor da soma é" + soma);
        
    }
    
}
