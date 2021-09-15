package org.xpdojo.bank;

public class Account {
    public int balance;

    public void deposit(int i) {
        this.balance += i;
    }

    public void withdraw(int i) {
        this.balance -= i;
    }
}
