package pl.akademiakodu.tablice;

public class Zadanie3 {
    
	 public static void main(String[] args){
		 
		 int[] arrayOfInt = {1,1,5,12,141,1,5,5,2,6123,12,1,623,31,3,3,3};
		 int[] arrayOfResponse = new int[arrayOfInt.length];
		 
		 // Zapisujemy sobie do odrêbnej tablicy, wynik grupowania danych
		 for(int i = 0; i < arrayOfInt.length; i++) { 
			 int counter = 0; 
			 for(int number : arrayOfInt)  {
				  if(arrayOfInt[i] == number) counter++;
			 }
			 arrayOfResponse[i] = counter;
		 }
		 
		 // Szukamy najwiêkszej liczby która siê powtarza
		 int temp = 0; 
		 int tempIndex = 0;
		 for(int i = 0; i < arrayOfResponse.length; i++) { 
			 if(arrayOfResponse[i]  > temp) { 
				 temp = arrayOfResponse[i];
				 tempIndex = i; 
			 }
		 }
		 
		 System.out.println("Najczêœciej wystêpuj¹ca liczba to: " + arrayOfInt[tempIndex]);
		 
		 
	 }
}
