package org.bank;

public class Axis extends Bank {
@Override
public void deposit() {
System.out.println("Deposit 9%");
}

public static void main(String[] args) {
	Axis sfd=new Axis();
	sfd.deposit();
}
}
