package pl.akademiakodu.tablice;

import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Podaj wartoœci rozdzielone spacj¹: ");
		String[] newArray = scan.nextLine().split(" ");
        scan.close();
        
        
        
		System.out.println("Wynik: ");
		for (int i = newArray.length-1; i >= 0; i--) {
			System.out.print(newArray[i] + " ");
		}

	}

}
