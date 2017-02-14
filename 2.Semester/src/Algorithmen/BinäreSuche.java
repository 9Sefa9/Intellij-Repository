package Algorithmen;

import java.util.Scanner;

public class BinäreSuche {

	public static void main(String[] a) {
		int[] b = { 2, 10, 15, 20, 30, 45, 70, 89, 99 };
		System.out.println(rank(20, b));
	}
	public static int rank(int key, int a[]) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mitte = low + (high - low) / 2; 
			System.out.println("Mitte: " + mitte);
			if (key < a[mitte]) {
				high = mitte - 1;
				System.out.println("high = mitte-1: " + high);
			} else if (key > a[mitte]) {
				low = mitte + 1;
				System.out.println("low = mitte+1: " + low);
			} else
				return mitte;
		}
		return -1;
	}
}
