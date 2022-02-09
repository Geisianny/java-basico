
package array;

/**
 *
 * @author VAIO
 */
public class TemperaturaMediaDiariaDeUmAno {

   
    public static void main(String[] args) {
        
        double[] temperaturas = new double[365];
        
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[1] = 33.7;
        temperaturas[1] = 34;
        temperaturas[1] = 33.1;
        
        System.out.println("O valor da temperatura do dia 1 é: " 
                + temperaturas[0]);
        
        System.out.println("O tamanho do array: "+ temperaturas.length);
        
        for(int i =0;i< temperaturas.length;i++){
            System.out.println("O valor da temperatura do dia "+(i+1) + " é: " 
                    + temperaturas[i]);
        }
        
        for(double temp : temperaturas){
            System.out.println(temp);
            
        }
    }
    
}
