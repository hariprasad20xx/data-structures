package arrays;

import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");  
        for (int i = 1; i <=n ; i++) {
            arr[i] = scanner.nextInt();
        }


        scanner.close();
    }
}
