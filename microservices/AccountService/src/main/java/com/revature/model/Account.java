package com.revature.model;

public class Account {
	private int id;
	private double balance;
	private int ownerId;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int id, double balance, int ownerId) {
		super();
		this.id = id;
		this.balance = balance;
		this.ownerId = ownerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ownerId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (ownerId != other.ownerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", ownerId=" + ownerId + "]";
	}

}
