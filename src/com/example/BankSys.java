package com.example;

public class BankSys {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("1111", 100.0);
        Cust c1 = new Cust("Pedro López", "C001", ba1);

        ba1.dep(50, "2024-12-12");
        ba1.wd(30, "2024-12-13");
        ba1.dep(200, "2024-12-14");
        ba1.wd(500, "2024-12-15");
        ba1.wd(-10, "2024-12-16");
        c1.printCustDetails();
    }
}
