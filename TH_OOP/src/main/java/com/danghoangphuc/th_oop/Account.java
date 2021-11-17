/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danghoangphuc.th_oop;

/**
 *
 * @author phucp
 */
public class Account {
    private int id;
    private String name;
    private int balance;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void credit(int amount){
        this.balance += amount;
    }
    
    public void debit(int amount){
        this.balance -= amount;
    }
    
    public void tranferTo(Account account, int amount){
        account.credit(amount);
        this.debit(amount);
    }
    
    public String showInformation(){
        return "ID: " + id + "\n Name: " + name + "\n Balance: " + balance;
    }
}
