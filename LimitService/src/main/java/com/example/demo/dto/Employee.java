package com.example.demo.dto;

public class Employee {

	private int id;
	private String name;
	private int account;

	public Employee(int id, String name, int account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", account=" + account + "]";
	}

}
