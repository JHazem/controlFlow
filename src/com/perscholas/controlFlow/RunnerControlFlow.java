package com.perscholas.controlFlow;

import java.util.Scanner;

public class RunnerControlFlow {

	public static void main(String[] args) {
		question7();
	}
	
								// 303.3.1 Practice Assignment - Loops
	
	public static void question1() {
	/* 1
	1.Write a program that declares 1 integer variable x, and then assigns 7 to it. 
	Write an if statement to print out “Less than 10” if x is less than 10. 
	Change x to equal 15, and notice the result (console should not display anything).*/
	 	
		int x = 7;
		if( x < 10){
		System.out.println("x = " + x + " less then 10");
		}// if
		
		 System.out.println("-------------------");
		}
  
	
	public static void question2() {
	/* 2
	2. Write a program that declares 1 integer variable x, and then assigns 7 to it. 
	Write an if-else statement that prints out “Less than 10” if x is less than 10, 
	and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.*/
	 
		int x1 = 7;
		if( x1 < 10){
		System.out.println("x1 = " + x1 + " less then 10");
		} 
		 
		int x2 = 15;
		if( x2 < 10){
			System.out.println("x2 = " + x2 + " Less then 10");
		} else
			System.out.println("x2 = " + x2 + " Greater than 10");
		 
		
		System.out.println("-------------------");

		}
	 
		
	public static void question3() {
	/*
	3. Write a program that declares 1 integer variable x, and then assigns 15 to it. 
	Write an if-else-if statement that prints out “Less than 10” if x is less than 10; 
	“Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or 
	equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.*/
	 
	 
	int x3= 15;
		if( x3 < 10){
		System.out.println("x3 = " + x3 + " less then 10");
	}else 
		if( x3 > 10 && x3 < 20){
		System.out.println("x3 = " + x3 + " Between 10 and 20");
	} else 
		if(x3 >= 20) {
		System.out.println("x3 = " + x3 + " Greater than or equal to 20");
		}

	 System.out.println("-------------------");

	}
	
	public static void question4() {
	/*
	4. Write a program that declares 1 integer variable x, 
	and then assigns 15 to it. Write an if-else statement that prints “Out of range”
	 if the number is less than 10 or greater than 20 and prints “In range” if 
	 the number is between 10 and 20 (including equal to 10 or 20). 
	 Change x to 5 and notice the result.*/
	 
	 int x4 = 15;
	 if(x4 < 10 || x4 > 20) {
		 System.out.println("x4 = " + x4 + " Out of range");
	 }else 
		 if(x4 >= 10 && x4 <=20) {
			 System.out.println("x4 = " + x4 + " In range");
		 }
	  
	 System.out.println("-------------------");
	 
	}
	
	public static void question5() {
	/*
	5. Write a program that uses if-else-if statements 
	to print out grades A, B, C, D, F according to the following criteria:
	A: 90-100
	B: 80-89
	C: 70-79
	D: 60-69
	F: <60
	Use the Scanner class to accept a number score from the user to determine the letter grade. 
	Print out “Score out of range” if the score is less than 0 or greater than 100.*/
	 
	 Scanner grade = new Scanner(System.in);
	 
	 System.out.print("Enter your test score : ");
	 int score = grade.nextInt();

     if (score >= 90 && score <= 100) {
    	 System.out.println("A");
     } else 
    	 if (score >= 80 && score <= 89)  {
    	 System.out.println("B");
     } else 
    	 if (score >= 70 && score <= 79) {
    	 System.out.println("C"); 
     } else 
    	 if (score >= 60 && score <= 69) {
    	 System.out.println("D"); 
     } else
      
    	 System.out.println("F");
     

 
	 System.out.println("-------------------");
 
	}
	
	public static void question6() { 
	/*
	6. Write a program that accepts an integer between 1 and 7 from the user. 
	Use a switch statement to print out the corresponding weekday. 
	Print “Out of range” if the number is less than 1 or greater than 7. 
	Do not forget to include “break” statements in each of your cases.*/
	  
	 Scanner in = new Scanner(System.in);
     System.out.print("Enter number between 1 - 7 : ");
     int day = in.nextInt();

	     switch (day) {
         case 1: 
        	 System.out.println("Sunday");
        	 break;
         case 2: 
        	 System.out.println("Monday");
         	 break;
         case 3:
        	 System.out.println("Tuesday");
        	 break;
         case 4:
        	 System.out.println("Wednesday");
        	 break;
         case 5:
        	 System.out.println("Thursday");
        	 break;
         case 6:
        	 System.out.println("Friday");
        	 break;
         case 7:
        	 System.out.println("Saturday");
        	 break;
         default:
        	 System.out.println("Out of range");
     }

	}    
	 
	
	public static void question7() {
	/*
	7. Create a program that lets the users input their filing status and income. 
	Display how much tax the user would have to pay according to status and income.
		❑	The U.S. federal personal income tax is calculated based on the filing status and taxable income. 
		❑	There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household. 
		❑	The tax rates for 2009 are shown below.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter the filing status : ");
		int status = input.nextInt();
		System.out.print ("Enter your income : ");
		double income = input.nextDouble();
		double tax = 0;
		
		switch(status){
			case 0: if (income <= 8350) {
						tax = income * 0.10 ;
						System.out.print("Result :" + tax);
					}else
					if (income <= 33950) {
						tax = income * 0.15 ;
						System.out.print("Result :" + tax);
					}else
					if (income >= 33951 || income <= 82250) {
						tax = income * 0.25 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 82250 || income <= 171550) {
						tax = income * 0.28 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 171551 || income <= 372950) {
						tax = income * 0.33 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 372951) {
						tax = income * 0.35 ;
						System.out.print("Your Tax :" + tax);
	
					}
			break;
			
			case 1: if (income <= 16700) {
						tax = income * 0.10 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 16701 || income <= 67900) {
						tax = income * 0.15 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 67901 || income <= 137050) {
						tax = income * 0.25 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 137051 || income <= 208850) {
						tax = income * 0.28 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 208851 || income <= 372950) {
						tax = income * 0.33 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 372951) {
						tax = income * 0.35 ;
						System.out.print("Your Tax :" + tax);
					}
			break;
			
			case 2: if (income <= 8350) {
						tax = income * 0.10 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 8351 || income <= 33950) {
						tax = income * 0.15 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 33951 || income <= 68525) {
						tax = income * 0.25 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 68525 || income <= 104425) {
						tax = income * 0.28 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 104421 || income <= 186475) {
						tax = income * 0.33 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 186471) {
						tax = income * 0.35 ;
						System.out.print("Your Tax :" + tax);
					}
			break;
			
			case 3: if (income <= 11950) {
						tax = income * 0.10 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 11951 || income <= 45500) {
						tax = income * 0.15 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 45501 || income <= 117450) {
						tax = income * 0.25 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 117451 || income <= 190200) {
						tax = income * 0.28 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 190201 || income <= 372950) {
						tax = income * 0.33 ;
						System.out.print("Your Tax :" + tax);
					}else
					if (income >= 372951) {
						tax = income * 0.35 ;
						System.out.print("Your Tax :" + tax);
					}
			break;
		
	}
	}
	
}
