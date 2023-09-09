package org.trailblazer;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Charger charger = new Charger();
        PowerBank powerBank = new PowerBank();
        powerBank.phone.connect();
        powerBank.charger.connect();


    }
}