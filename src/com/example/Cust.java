package com.example;

public class Cust {
    public String n;
    public String id;
    public BankAccount acct;

    public Cust(String name, String identifier, BankAccount account) {
        n = name;
        id = identifier;
        acct = account;
    }

    public void printCustDetails() {
        System.out.println("Nombre del cliente: " + n);
        System.out.println("ID del cliente: " + id);
        acct.pAccD();
    }
}
