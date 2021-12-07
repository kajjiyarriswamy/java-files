package com.technoelevate.exception.programs;

public class ICICIBank {
	private String name;
	private String userName;
	private String password;
	private double balance;

	public ICICIBank(String name, String userName, String password, double balance) {

		this.name = name;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	public void deposit(String userName, String password, double amount) {
		if (!this.userName.equals(userName) | !this.password.equals(password)) {
			throw new InValidDetails();
		} else {
			this.balance += amount;
			System.out.println("The amount deposited is " + amount + " The available balance is " + this.balance);
		}
	}

	public void withdraw(String userName, String password, double amount) {
		if (!this.userName.equals(userName) | !this.password.equals(password)) {
			throw new InValidDetails();
		} else {
			if (amount > this.balance) {
				throw new InSufficientFunds("Low Balance");

			} else {
				this.balance -= amount;
				System.out.println("The amount debited in your account is " + amount + " The available balance is "
						+ this.balance);
			}
		}

	}
}