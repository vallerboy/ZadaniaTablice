package pl.akademiakodu.tablice;

public class Zadanie7 {

	public static void main(String[] args) {

         int[] arrayOfInts = {1,2,4,1,5,1,613,21,5,2}; 
         
         
         for(int i = 0; i < arrayOfInts.length; i++) { 
        	 int counter = 0;
        	 for(int number : arrayOfInts) { 
        		 if(number == arrayOfInts[i]) counter++;
        	 }
        	 if(counter >= 3){ 
        		 System.out.println("TAK");
        		 return;
        	 }
         }
         System.out.println("NIE");

	}

}
