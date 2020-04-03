package Day5;

import java.util.Scanner;

public class PlayDay {

	public static void main(String[] args) {
		/*   The squirrels in Palo Alto spend most of the day playing.
		 *  In particular, they play if the temperature 
		 *  is between 60 and 90 (inclusive). Unless it is summer, 
		 *  then the upper limit is 100 instead of 90.
		 *   Given an int temperature and a boolean isSummer,
		 *  return true if the squirrels play and false otherwise.*/
    Scanner in =new Scanner(System.in);
    System.out.println("Enter Tem outside ");
    int temp = in.nextInt();
    boolean isSummer = true;
    System.out.println(sqPlay(temp,isSummer));
    	in.close();
	} 
	public static boolean sqPlay(int temp, boolean isSummer) {
		
		if (isSummer&& temp >= 60 && temp <=100) {
			return true;
			
			}
		if(!(isSummer)&& temp >= 60 && temp <=90) {
			
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

}
