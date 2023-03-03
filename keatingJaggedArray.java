/* 
 * Written by Kevin Keating 
 * Date written: 9/22/2021
 * Purpose: To fill a jagged array where array[0] is randomly generated,
 * and the following values are sequentially filled according to array[0].
 * Sum and average of the values are then found.
*/
package keatingJaggedArray;
import java.util.*;

public class keatingJaggedArray {

	public static void main(String[] args) {
		int size = 50;
		int [][]array = new int[size][];
		
		// Loads the array
		loadArray(array);
		
		// Outputs the array
		displayArray(array);
		
		// Gets the sum
		getSum(array);
		
		//Gets the average
		getAverage(array);

	}
	public static void displayArray(int[][]array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + ". " + "\t");
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		} //End of outer for
	} //End of display
	
	
	public static double getAverage(int[][]array) {
		double sum = 0.0;
		int length = 0;
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
	            sum += array[i][j]; //Adds the values together
	        } 
		} //End of outer for
		for(int i = 0; i < array.length; i++) {
			length += array[i].length;
		}
		double average = sum / length;
		System.out.println("The average of all values is: " + String.format("%.2f", average)); //Average is a bit more accurate
		return average;
	} //End of getAverage
	
	public static double getSum(int[][]array) {
		double sum = 0.0;
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
	            sum += array[i][j]; //Adds the values together
	        } 
		} //End of outer for
		System.out.println("The sum of all values is: " + sum);
		return sum;
	} //End of getSumAndAverage
	
	public static void loadArray(int[][]array) {
		int loB = 1;
		int upB = 20;
		for(int i = 0; i < array.length; i++) {
			int cols = (int)(Math.random() * (upB - loB + 1) + loB); // Populates array[0]
			array[i] = new int[cols + 1]; // cols + 1 allows the program to add the correct columns to each row
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = cols++; //Sequentially fills the rows accordingly
			}
		} //End of outer for
	} //End of loadArray

}
