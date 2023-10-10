//import
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //Initialize times
    int times =0;
    Scanner scan = new Scanner(System.in);
    //Input number
    System.out.println("Please enter a number:");
    int size = scan.nextInt();
    //check if input is odd or even using mod
    //if input is even using mod
    if((size%2)==0) {
      System.out.println("Your diamond is even");
      int half = (size/2);

    }
    //if input is odd
    else{
      System.out.println("Your diamond is odd");
      //rounds the diamond up in size
      var halfup = ((size+1)/2);
      //does half the diamond, increasing
        while(times < halfup){
          //draws spaces draws, draws half the input, then decreases by 1 each time
         for(int space1=((halfup-times)) ; 0 < space1;space1--){
            System.out.print(" ");
          }
          //draws astarisks, guarenteed to draw once, then 2 more times each time the amount of times goes up by 1
          for(int astarisk = 1+(times*2); 0 < astarisk; astarisk--){
            System.out.print("*");
          }
          System.out.println();
          times++;
        }
        times = (halfup-2);
        //other half of the diamond, decreasing
        while(times >= 0){
          //draws spaces
          for(int space1=((halfup-times)) ; 0 < space1;space1--){
            System.out.print(" ");
          }
          //draws astarisks
          for(int astarisk = 1+(times*2); 0 < astarisk; astarisk--){
            System.out.print("*");
          }
          System.out.println();
          times--;
        }
      }
      scan.close();
  }
}
