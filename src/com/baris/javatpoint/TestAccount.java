package com.baris.javatpoint;

class Account {
    int account_no;
    String name;
    float amount;
    void insert(int a, String s, float f){
        account_no = a;
        name = s;
        amount = f;
    }
    void deposit(float f) {
        amount = amount + f;
        System.out.println(f + " is deposited");
    }
    void withdraw(float f) {
        if (amount<f) {
            System.out.println("balance insufficent");
        }
        else {
            amount = amount + f;
            System.out.println(f + " withdrawn");
        }
    }
    void checkBalance() {
        System.out.println("Balance is: "+amount);
    }
    void display(){
        System.out.println(account_no+" "+name+" "+amount);
    }
}


public class TestAccount {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(123,"baris",100);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();

    }
}
