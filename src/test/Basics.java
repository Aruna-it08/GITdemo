package test;

import org.testng.annotations.Test;

public class Basics {

	@Test
	public void Demo()
	{
		System.out.println("Hello");
		System.out.println("HelloWorld");
	}
	@Test(groups= {"smoke"})
	public void HomeLoan()
	{
		System.out.println("Homeloan");
		System.out.println("Homeloan accepted");
	}
	@Test(groups= {"smoke"})
	public void CarLoan()
	{
		System.out.println("CArLoan");
	}
	@Test
	public void HomeLoanLogin()
	{
		System.out.println("HomeLoanLogin");
	}
	@Test
	public void GoldLoanLogin()
	{
		System.out.println("GoldLoanLogin");
	}
}
