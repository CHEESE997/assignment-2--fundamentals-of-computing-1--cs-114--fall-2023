//import
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //open scanner
    Scanner scan = new Scanner(System.in);
    //Input
    System.out.println("Please enter a number:");
    int size = scan.nextInt();
    //check if input is odd or even using mod
    //if input is even
    if((size%2)==0) {
      System.out.println("Your diamond is even");
      int half = (size/2);
    }
    //if input is odd
    else{
      System.out.println("Your diamond is odd");
      int half = ((size+1)/2);
      //does half the diamond
        for(int times = 0; times < half; times++){
          //draws spaces
         for(int space1=((half-times)) ; 0 < space1;space1--){
            System.out.print(" ");
          }
          //draws astarisks
          for(int astarisk = 1+(times*2); 0 < astarisk; astarisk--){
            System.out.print("*");
          }
          System.out.println();

       }
    }

    //close scan
    scan.close();
  }
}
