/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dy0987688
 */
import java.util.Arrays;
import java.util.Scanner;

public class p7DerekYang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Array Size: ");
        int size = input.nextInt();
        double[] array = new double[size];
        int sizeLength = array.length;
        fillArray(array, sizeLength);
        System.out.println("The average is " + averageArray(array, sizeLength));
        displayArray(array, sizeLength);
    }
    public static void fillArray(double[] array, int sizeLength){
        Scanner input = new Scanner(System.in);
        System.out.println("Add values to array: ");
        for(int x = 0; x < sizeLength; ++x){
            array[x] = input.nextInt();
        }
    }
    public static double averageArray(double[] array, int sizeLength){
        double total = 0;
        for(int x = 0; x < sizeLength; ++x){
            total = total + array[x];
        }
        double average = total / sizeLength;
        return average;
    }
    public static void displayArray(double[] array, int sizeLength){
        System.out.println(Arrays.toString(array));
    }
}
