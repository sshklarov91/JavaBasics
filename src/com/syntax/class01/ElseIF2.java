package com.syntax.class01;

public class ElseIF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHungry = false;
		if (isHungry)
			System.out.println("lets east something yummy");
		if (3 > 2)
			System.out.println("there is a true statement inside parentesis");

		double myBankBalance = 2000;
		double TheAmountThatIwantToTransfer = 250;

		if (myBankBalance > TheAmountThatIwantToTransfer)
			System.out.println("Funds transefed succesfully");
		else
			System.out.println("Please try again not enought balance");

	}
}
