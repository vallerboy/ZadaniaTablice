package pl.akademiakodu.tablice;

public class Zadanie6 {

	public static void main(String[] args) {

		int[] arrayOfInts = { 1, 3, 2, 6 };

		for (int i = 0; i < arrayOfInts.length; i++) {
			int counter = 0;
			for (int o = i; o < arrayOfInts.length; o++) {
				counter += arrayOfInts[o];
			}
			System.out.print(counter + " ");
		}

	}

}
