package test;

import org.testng.annotations.Test;

public class Basics {

	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	@Test(groups= {"smoke"})
	public void HomeLoan()
	{
		System.out.println("Homeloan");
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
}
