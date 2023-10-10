//import
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    //Initialize times diamond is drawn
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
      //draw first astirisk of the daimond
      for(int x = half+2; 0 < x; x--){
        System.out.print("  ");
      }
      System.out.println("*");
      //adds 1 to times due to the first astirisk
      //starts from 2nd line (times = 1)
      while(times < half){
        //draws spaces draws, draws half the input, then decreases by 1 each time
        for(int spaces=(half-(times)) ; 0 <= spaces;spaces--){
          System.out.print("  ");
        }
        for(int astarisks = (1+(times)*2); 0 <= astarisks; astarisks--){
          System.out.print(" *");
        }
        System.out.println();
        times++;
      }
      //set times to half minus 2 for other half to decrease properly
      times = (half-1);
        while(times >= 1){
        //draws spaces draws, draws half the input, then decreases by 1 each time
        for(int spaces=(half-(times-1)) ; 0 <= spaces;spaces--){
          System.out.print("  ");
        }
        for(int astarisks = 1+((times-1)*2); 0 <= astarisks; astarisks--){
          System.out.print(" *");
        }
        System.out.println();
        times--;
      }
      //draw last astirisk of the daimond
      for(int x = half+2; 0 < x; x--){
        System.out.print("  ");
      }
      System.out.println("*");
    }

    //if input is odd
    else{
      System.out.println("Your diamond is odd");
      //rounds the diamond up in size
      var halfup = ((size+1)/2);
      //does half the diamond, increasing
      while(times < halfup){
        //draws spaces draws, draws half the input, then decreases by 1 each time
        for(int spaces=((halfup-times)) ; 0 < spaces;spaces--){
          System.out.print(" ");
        }
        //draws astarisks, guarenteed to draw once, then 2 more times each time the amount of times goes up by 1
        for(int asterisks = 1+(times*2); 0 < asterisks; asterisks--){
          System.out.print("*");
        }
         System.out.println();
         times++;
       }
      //set times to half minus 2 for other half to decrease properly
      times = (halfup-2);
       //other half of the diamond, decreasing
      while(times >= 0){
        //draws spaces
         for(int spaces=((halfup-times)) ; 0 < spaces;spaces--){
          System.out.print(" ");
        }
        //draws astarisks
        for(int astarisks = 1+(times*2); 0 < astarisks; astarisks--){
          System.out.print("*");
         }
        System.out.println();
        times--;
       }
    }
      scan.close();
  }
}
