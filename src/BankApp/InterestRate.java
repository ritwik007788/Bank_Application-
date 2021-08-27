package BankApp;

public interface InterestRate {
	//write a method that returns the base rate
		default double getBaseRate() {  //An API 
			return 2.5;
		}
}
