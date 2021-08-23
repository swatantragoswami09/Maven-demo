
//Write a Java program that will calculate the percentage of calories that comes from 
//fat for a food item. It is recommended that no more than 30 percent of a person's 
//daily calories come from fat.  Each gram of fat is 9 calories. Given the grams of fat and 
//the number of calories in a food item calculate the percentage of calories that comes from 
//fat for a food item.

//Input
//1. Item name   
//2. Item quantity per gram 
//3.Calories
//Input should be accepted with following command line options:
//-name 	<first item name>
//-grams of fat <first item quantity>
//-calories < first item  calories>

//Program design:
//   INPUT : 
// 1. Prompt user to enter name of a food
//    "Enter the name of a food item: "
// 2. Input food name
// 3. Prompt user to enter the grams of fat in the food
//    (for the food he/she entered in previous input)
//    "Enter the grams of fat: "
// 4. Input grams of fat
// 5. Prompt user to enter the number of calories in the food
//    "Enter the number of calories: "
// 6. Input the number of calories

//OUTPUT :
//1. Print the food item and the percentage of calories that come from fat
//    (fatCalPercent)
// 2. Print one of the two following messages depending on the percentage
// of calories from fat (value of fatCalPercent).
//"This item is Heart Heathy!"
// "This item is NOT Heart Heathy!“
//
//Make use of java's object-oriented capabilities for implementing this business logic
//Exception handling is expected in the program
//Jdk8 should be used for development

import java.util.Scanner;

public class FatGramCal {

	public static void main(String[] args) {
//		System.out.println("hello");
		Scanner sc=new Scanner(System.in);
		FatGramCalc fgc= new FatGramCalc();
		try {
		System.out.println("Please Enter the number of calories");
		fgc.totalNumberOfCalories = sc.nextDouble();

		System.out.println("Please Enter the number of fat Gram in the food");
		fgc.fatGrams = sc.nextDouble();
		
		fgc.caloriesFromFat = fgc.fatGrams*9;
//		System.out.println(fgc.caloriesFromFat);
		fgc.percentageOfCaloriesFromFat = fgc.caloriesFromFat/fgc.totalNumberOfCalories;
		
		if(fgc.caloriesFromFat > fgc.totalNumberOfCalories) {
			System.out.println("The input is invalid ");
		}else {
			
			if(fgc.caloriesFromFat < 0.30 * fgc.totalNumberOfCalories) {
				System.out.println("The food is low in fat");
							
			}
			System.out.printf("The percentage of calories that come from fat is %.2f%%",fgc.percentageOfCaloriesFromFat);
//			fgc.toString();
		}
		
		
		}catch(Exception e) {
			System.out.println("Please Enter Correct Value");
		}
		
		
	}
}
