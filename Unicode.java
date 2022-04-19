//JFM1T3_Assignment3:
/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.

  Sample Input:
       character=M

  Expected Output:
      ASCII value of M is:77

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

 
//Define main method
class Unicode
   {
    public static void main(String args[])
   {
     int i,M ;
     System.out.println(" enter the Character= ");
     Scanner sc=new Scanner(System.in);
     i=sc.next().charAt(0);
     M=77;
     System.out.println("ASCII value of M is: "+M);
      }
   }
//Use the scanner class to provide character at execution time
/*Scanner scanner = new Scanner(System.in);  
char character = scanner.next().charAt(0);  
int asciiValue = character; 
*/

//Print the Result

