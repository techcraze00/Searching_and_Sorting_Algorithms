package com.searchingAlgos;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] intArray = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			intArray[i] = scanner.nextInt();
		}

		System.out.print("Enter the element to be searched: ");
		int searchElement = scanner.nextInt();

		boolean found = false;

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == searchElement) {
				System.out.println(searchElement + " found at index " + i);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println(searchElement + " not found in the array.");
		}
	}
}
