
package operadores;

/**
 *
 * @author VAIO
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8 ;
        System.out.println(resultado);
         
        resultado = resultado % 7;
        System.out.println(resultado);
        
        String primeiroNome = "Esta é";
        String segundoNome = "uma String conatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        resultado++;
        System.out.println(resultado);
        
        ++resultado;
        System.out.println(resultado);
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
    }
    
}
