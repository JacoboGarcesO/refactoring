package com.example;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public String accn;
    public double b;
    public List<Tran> trans = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        accn = accountNumber;
        b = balance;
    }

    public void dep(double a, String d) {
        if (a > 0) {
            b += a;
            trans.add(new Tran("dep", a, d));
            System.out.println("Depósito exitoso, nuevo saldo: " + b);
        } else {
            System.out.println("Monto inválido para depósito");
        }
    }

    public void wd(double a, String d) {
        if (a > 0) {
            if (b >= a) {
                b -= a;
                trans.add(new Tran("wd", a, d));
                System.out.println("Retiro exitoso, nuevo saldo: " + b);
            } else {
                System.out.println("Fondos insuficientes");
            }
        } else {
            System.out.println("Monto inválido para retiro");
        }
    }

    public void printTrans() {
        System.out.println("Historial de transacciones para la cuenta: " + accn);
        for (Tran t : trans) {
            t.printTran();
        }
        System.out.println("Fin del historial.");
    }

    public void pAccD() {
        System.out.println("Detalles de la cuenta:");
        System.out.println("Número de cuenta: " + accn);
        System.out.println("Saldo actual: " + b);
        System.out.println("Transacciones:");
        printTrans();
    }
}

