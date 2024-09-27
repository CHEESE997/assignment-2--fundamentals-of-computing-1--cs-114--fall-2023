import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    //Initialize times diamond is drawn
    int timesrun =0;
       //Input
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int size = scan.nextInt();

    //check if input is odd or even using mod
    if((size%2)==0) {
      System.out.println("Your diamond is even");
      int half = (size/2);

      //draw first astirisk of the daimond, positions the astarisk in exaclty half the size of the diamond
      for(int x = half+2; 0 < x; x--){
        System.out.print("  ");
      }

      System.out.println("*");

      //adds 1 to times due to the first astirisk
      //starts from 2nd line (times = 1)
      while(timesrun < half){

        //draws spaces imcrementing by 1 each time the loop is run, 1 more space is drawn
        for(int spaces=(half-(timesrun)) ; 0 <= spaces;spaces--){
          System.out.print("  ");
        }

        //Draws the asterisks starting at half the input minus 1, and eachtime the loop is run, 2 less asterisks are drawn
        for(int astarisks = (1+(timesrun)*2); 0 <= astarisks; astarisks--){
          System.out.print(" *");
        }

        System.out.println();
        timesrun++;
      }
      //set times to half minus 1 for other half to decrease properly
      timesrun = (half-1);
        while(timesrun >= 1){
        //draws spaces draws, draws half the input, then decreases by 1 each time
        for(int spaces=(half-(timesrun-1)) ; 0 <= spaces;spaces--){
          System.out.print("  ");
        }

        //Draws asterisks will always draw an even amount of asterisks as input is form 0 to the size of the diamond inclusive
        for(int astarisks = 1+((timesrun-1)*2); 0 <= astarisks; astarisks--){
          System.out.print(" *");
        }

        System.out.println();
        timesrun--;
      }
      //draw last astirisk of the daimond
      for(int x = half+2; 0 < x; x--) {
        System.out.print("  ");
      }
      System.out.println("*");

    } else { //if input is odd
      System.out.println("Your diamond is odd");
      //rounds the diamond up in size
      int halfroundedup = ((size+1)/2);

      //does half the diamond, increasing
      while(timesrun < halfroundedup) {
        //draws spaces draws, draws half the input, then decreases by 1 each time
        for(int spaces=((halfroundedup-timesrun)) ; 0 < spaces;spaces--){
          System.out.print(" ");
        }

        //draws astarisks, guarenteed to draw once, then 2 more times each time the amount of times goes up by 1
        for(int asterisks = 1+(timesrun*2); 0 < asterisks; asterisks--){
          System.out.print("*");
        }

        System.out.println();
        timesrun++;
       }

      //set times to half minus 2 for other half to decrease properly
      timesrun = (halfroundedup-2);

       //other half of the diamond, decreasing
      while(timesrun >= 0){
        //draws spaces for half the size of the diamond minus the times the program has run, so it draws 1 more space each time
        for(int spaces=((halfroundedup-timesrun)) ; 0 < spaces;spaces--){
          System.out.print(" ");
        }

        //draws astarisks, guarenteed to draw once, then 2 less times each time the amount of times goes down by 1
        for(int astarisks = 1+(timesrun*2); 0 < astarisks; astarisks--){
          System.out.print("*");
        }

        System.out.println();
        timesrun--;
       }
    }
      scan.close();
  }
}
