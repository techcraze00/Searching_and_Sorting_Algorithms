package com.searchingAlgos;

import java.util.Scanner;

public class BinarySearch {

	private static void binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1, mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == key) {
				System.out.println("Element found at index " + mid);
				return;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("Element not found.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] intArray = new int[n];

		System.out.println("Enter the elements of the array (sorted in ascending order):");
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			intArray[i] = scanner.nextInt();
		}

		System.out.print("Enter the element to be searched: ");
		int searchElement = scanner.nextInt();

		binarySearch(intArray, searchElement);
	}
}
