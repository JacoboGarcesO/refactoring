package com.example;

class Tran {
    public String t;
    public double amt;
    public String d;

    public Tran(String type, double amount, String date) {
        t = type;
        amt = amount;
        d = date;
    }

    public void printTran() {
        System.out.println("Tipo: " + t + ", Monto: " + amt + ", Fecha: " + d);
    }
}