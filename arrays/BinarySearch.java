package arrays;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array in ascending order: ");  
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = scanner.nextInt();

        scanner.close();
    }
}
