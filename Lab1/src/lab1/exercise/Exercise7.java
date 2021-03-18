package lab1.exercise;

import java.util.Scanner;

public class Exercise7 {  

	    public static void main(String[] args) throws Exception {
	        calculateWeight();
	    }
	 
	    private static void calculateWeight() throws Exception {
	        System.out.print("Please enter your weight in kg: ");
	        Scanner s = new Scanner(System.in);
	        double weight = s.nextFloat();
	        
	      
	        double a = (weight/9.81)*3.711;
	         
	        System.out.println("Your weight in mars is: "+a);
	      
	         
	    }
	}

