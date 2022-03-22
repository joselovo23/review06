package com.syntax.review06;

public class Patterns {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("************Better way**********");
		System.out.println("10x10 square");
		for(int r=1; r<=10;r++) {
			for (int col=1; col<=10; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		for(int r=5; r>=1; r--) {
			for(int c=1; c<=4; c++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}

	}

}
