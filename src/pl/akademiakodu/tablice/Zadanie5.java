package pl.akademiakodu.tablice;

public class Zadanie5 {

	public static void main(String[] args) {
		
		int[] arrayOfInts = {3,12,51,213,124,12,213,1231,1};
		
		  int min = arrayOfInts[0], max = arrayOfInts[0]; 
		  
		  for(int number : arrayOfInts){ 
			  if(min > number) min = number;
			  if(max < number) max = number;
		  }
		  
		  System.out.println("Liczba max: " + max + ", a liczba min: " + min);

	}

}
