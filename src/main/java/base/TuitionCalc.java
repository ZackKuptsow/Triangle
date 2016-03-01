package base;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class TuitionCalc {
	
	public static void TuitionCost(){
		
		//Gives access to user input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
				
		//Asks user for variables needed to calculate total tuition
		System.out.println("What is your current tuition?");
		double TuitionCost = input.nextDouble() * 2;
		System.out.println("What is the percentage increase of your tuition?");
		double PercentInc = input.nextDouble() * .01;
		System.out.println("What is your repayment APR?");
		double APR = input.nextDouble() * .01;
		System.out.println("How many terms do plan to pay back your loan?");
		int Terms = input.nextInt();
		
		PercentInc = (double)(Math.round(PercentInc * 100.0) / 100.0);
		APR = (double)(Math.round(APR * 100.0) / 100.0);
		
		//States all of the variables that have been given
		System.out.println("Your tuition cost is " + TuitionCost + ".");
		System.out.println("Your tuition increase is " + (PercentInc * 100) + "% per year.");
		System.out.println("Your APR is " + (APR * 100) + "%.");
		System.out.println("You are paying your loan back in " + Terms + " years.");
		System.out.println("\n");
		
		double oldTuitionCost = TuitionCost;
		double sum = 0.0;
		for(int years = 0; years < 4; years++){
			TuitionCost +=(TuitionCost * PercentInc);
			sum += TuitionCost;
			TuitionCost = (double)(Math.round(TuitionCost * 100.0) / 100.0);
			System.out.println("Tuition cost will be " + TuitionCost + " after " + (years + 1) + " year.");
			}
		
		System.out.println("\n");
		
		double TotalCost = FinanceLib.pmt(APR, Terms, oldTuitionCost, TuitionCost, (Terms < 4));
		TotalCost = (double)(Math.round(TotalCost * 100.0) / 100.0);
		double MonthlyPayment = Math.abs(TotalCost) / 12;
		System.out.print("Your monthly payment will be $" + MonthlyPayment + ".");
	}
	
	
}

