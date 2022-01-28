
package loops;

/**
 *
 * @author VAIO
 */
public class WhileEDowhile {

    public static void main(String[] args) {
        
        int i = 1; //contador
        int max = 10; //maximo da contagem
        
        System.out.println("Contando até " + max);
        
        while(i <= max){
            
            System.out.println("Valor de i: " + i);
            i++;
        }
        
        System.out.println(i);
        
        
        do {
            i++;
            System.out.println("Valor de i: " + i);
        }while(i <= 15);
        
        
        
    }
      
    
}
