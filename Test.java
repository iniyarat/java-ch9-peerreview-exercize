/*  
Program: The Account Class
Programmer: Iniya Rathinakumar
Date: October 15th, 2026

Purpose: Create an Account class that stores account information,
calculates monthly interest, and allows money to be deposited
and withdrawn. The program creates an account with an ID of 1122
and a balance of $20,000, withdraws $2,500, deposits $3,000,
and displays the final balance, monthly interest, and date created.

*/

import java.util.Date;

/**
 * This class represents a bank account.
 * It stores the account ID, balance, interest rate, and date created.
 * It also provides methods to deposit and withdraw money.
 *
 * @author Iniya Rathinakumar
 */
class Account {

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    /**
     * Creates a default account.
     */
    public Account() {
    }

    /**
     * Creates an account with a specified ID and balance.
     *
     * @param id the account ID
     * @param balance the initial account balance
     */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * Returns the account ID.
     *
     * @return the account ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the account ID.
     *
     * @param id the new account ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Returns the account balance.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the account balance.
     *
     * @param balance the new account balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the annual interest rate.
     *
     * @return the annual interest rate
     */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Sets the annual interest rate for all accounts.
     *
     * @param rate the annual interest rate
     */
    public static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    /**
     * Returns the date the account was created.
     *
     * @return the account creation date
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Calculates and returns the monthly interest rate.
     *
     * @return the monthly interest rate as a decimal
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    /**
     * Calculates and returns the monthly interest.
     *
     * @return the monthly interest amount
     */
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }
}

/**
 * This program tests the Account class.
 *
 * @author Iniya Rathinakumar
 */
public class Test {

    /**
     * Runs the program and tests the account methods.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is "
                + account.getMonthlyInterest());
        System.out.println("This account was created at "
                + account.getDateCreated());
    }
}
