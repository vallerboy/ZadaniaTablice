package pl.akademiakodu.tablice;

public class Zadanie2 {

	public static void main(String[] args) {

		int[] arrayOfInts = { -5, 54, 1, 24, 12, 41, 5, 156, 12 };

		int temp = arrayOfInts[0];
		for (int i = 1; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < temp)
				temp = arrayOfInts[i];
		}

		System.out.println("Najmniejsza liczba to: " + temp);
		
		
	}

}
