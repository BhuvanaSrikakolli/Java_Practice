/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

import java.util.Scanner;
public class Pattern {
    //main method
    public static void main(String[] args) {
        //Declare variable n and initialize value as 5
        int n ;
        //Check whether the i and j are equal or not using for loop
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the n value");
      n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                //If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero
                if((i+j)%2==0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            //printing values in next line
            System.out.println();
        }
    }
}
