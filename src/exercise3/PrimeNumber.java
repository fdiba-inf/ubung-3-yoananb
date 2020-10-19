package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Number: ");
         int num = input.nextInt();

         int a = 2;
boolean prime = true;

while(num > a){

  if(num % a==0){

  prime = false;

    break;

  }
 a++;
}
System.out.println("Prime number: " + prime);


 
    }


} 