package com.tg;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Tina","Butterfly",1000.00);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00,balance,0); // third parameter: as lo
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void withdraw() {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance() {
        fail("This test has yet to be implemented");
    }

}