/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labsheet_algorithmn;

/**
 *
 * @author dilakshi
 */

import java.util.Scanner;

/**
 *
 * @author dilakshi
 */
public class BubbleSort2 {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false; 

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                    swapped = true; 
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] b = new int[8];
            
            System.out.println("Enter 8 numbers:");
            
            for (int i = 0; i < 8; i++) {
                b[i] = scanner.nextInt();
            }
            
            bubbleSort(b);
            
            System.out.println("Your array is sorted");
            printArray(b);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}