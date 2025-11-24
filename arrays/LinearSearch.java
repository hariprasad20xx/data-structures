package arrays;

import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements for the array: ");  
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = scanner.nextInt();

        boolean isFound = false;
        int index;
        for (index = 0; index < n; index++) {
            if (arr[index] == key) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println(key + " is found at index " + index + ".");
        } else {
            System.out.println(key + " is not found.");
        }
        scanner.close();
    }
}