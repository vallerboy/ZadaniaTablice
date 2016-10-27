package pl.akademiakodu.tablice;

public class Zadanie4 {

	 public static void main(String[] args) { 
		 
		  int[] arrayOfInts = {5,5,5,5}; 
		  
		  long sum = 0; 
		  for(int number : arrayOfInts) { 
			  sum += number;
		  }
		  
		  System.out.println("Suma: " + sum);
		  System.out.println("Œrednia: " +  (sum / arrayOfInts.length));
		 
	 }
}
