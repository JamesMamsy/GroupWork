
import java.util.Scanner;


/**
 *
 * @author Armon Hashemi
 */
public class p7ArmonAsle_Hashemi {
    /**
     * asks for how many numbers
     * @param args 
     */
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers will be read: ");
        int[] num = new int[input.nextInt()];

        System.out.print("Enter " + num.length + " elements: ");
        Scanner Scanner = new Scanner(System.in);

        methodA(num, Scanner);
                
        System.out.println("The average is " + methodB(num));
        methodC(num);

    }
/**
 * Calculates average
 * @param num
 * @param input 
 */
    public static void methodA(int[] num, Scanner input) {
        
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) input.nextDouble();
        }        
    }
    public static double methodB(int[] num) {
        
        double sum = 0;
        
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
       
        double averageNums;
        averageNums = sum / num.length; 
        return averageNums ;
    }
    /**
     * prints contents of array
     * @param num 
     */
    public static void methodC(int[] num) {
        System.out.print("The contents of the array: \n" + java.util.Arrays.toString(num));
    }
}

