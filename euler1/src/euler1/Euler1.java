
package euler1;

/**
 *
 * @author AmlebC
 */
public class Euler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
    for (int i = 3; i < 1000; i++) 
    {

    if (i % 3 == 0 || i % 5==0)

    {
       sum = sum + i;
        System.out.println(i);
    }    
        
    }
     System.out.println("The sum of all the multiples of 3 or 5 below 1000 is " + sum);
        
    }
    
}
