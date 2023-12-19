//Laird,Chris
//1229_4026; Sept 20,2022
//Description: First Java Program

import java.util.Scanner;

public class ComputerInvestment{
	public static void main(String[] args){
	//create a scanner
	Scanner input = new Scanner(System.in);

	//enter initial investment amount
	System.out.print("Enter investment amount IIA:");
	double initialInvestmentAmount = input.nextDouble();
	
	//Enter anual interest rate
	System.out.print ("Enter annual interest rate in percentage:");
	double anualInterestRate = input.nextDouble();
	
	//Enter number of years
	System.out.print ("Enter number of years:");
	int amountOfYears = input.nextInt();
	
	//Declaring FIA
	double futureInvestmentAmount = initialInvestmentAmount * Math.pow((1 + anualInterestRate/1200),(12 * amountOfYears));
	System.out.printf("%s%.4f\n","Future Investment Value FIA is calculated $" , + futureInvestmentAmount);
	
	//Conversion to interger
	System.out.println("After conversion to integer FIAI is:" + (int)futureInvestmentAmount);
	
	//Declare the individual digits
	int digit1, digit2, digit3, digit4, digit5;
	
	//digit1
	digit1 = (int)futureInvestmentAmount / 10000;
	System.out.println("digit1=" + digit1);
	
	//digit2
	digit2 = (int)futureInvestmentAmount % 10000 / 1000;
	System.out.println("digit2=" + digit2);
	
	//digit3
	digit3 = (int)futureInvestmentAmount % 1000 / 100;
	System.out.println("digit3=" + digit3);
	
	//digit4
	digit4= (int)futureInvestmentAmount % 100 / 10;
	System.out.println("digit4=" + digit4);
	
	//digit5
	digit5= (int)futureInvestmentAmount % 10;
	System.out.println("digit5=" + digit5);
	
	
	}
}
