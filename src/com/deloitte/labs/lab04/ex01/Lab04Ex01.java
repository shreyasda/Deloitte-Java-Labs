package com.deloitte.labs.lab04.ex01;

class Person {
	String name;
	float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
}

class Account {
	long accNum;
	double balance;
	Person accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}
}

class SavingsAccount extends Account {
	private static final double MINIMUM_BALANCE = 500;

	@Override
	public void withdraw(double amount) {
		if (balance - amount < MINIMUM_BALANCE) {
			System.out.println("Cannot withdraw. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
		} else {
			balance -= amount;
			System.out.println("Withdrawn " + amount + ". New balance: " + balance);
		}
	}
}

class CurrentAccount extends Account {
	private static final double OVERDRAFT_LIMIT = 1000;

	@Override
	public void withdraw(double amount) {
		if (balance - amount < -OVERDRAFT_LIMIT) {
			System.out.println("Cannot withdraw. Overdraft limit of " + OVERDRAFT_LIMIT + " exceeded.");
		} else {
			balance -= amount;
			System.out.println("Withdrawn " + amount + ". New balance: " + balance);
		}
	}
}

public class Lab04Ex01 {
	public static void main(String[] args) {
		SavingsAccount smithSavings = new SavingsAccount();
		smithSavings.setBalance(2000);
		Person smithPerson = new Person();
		smithPerson.setAge(25);
		smithPerson.setName("Smith");
		smithSavings.setAccHolder(smithPerson);

		smithSavings.deposit(2000);
		System.out.println("Smith's balance after deposit: " + smithSavings.getBalance());
		smithSavings.withdraw(3000);
		smithSavings.withdraw(2000); 

		CurrentAccount kathyCurrent = new CurrentAccount();
		kathyCurrent.setBalance(3000);
		Person kathyPerson = new Person();
		kathyPerson.setAge(30);
		kathyPerson.setName("Kathy");
		kathyCurrent.setAccHolder(kathyPerson);

		kathyCurrent.withdraw(3500);
		kathyCurrent.withdraw(700); 
	}
}
