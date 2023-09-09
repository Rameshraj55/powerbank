package org.trailblazer;

public class PowerBank implements Capacity, Connectable, Disconnectable {
    // INSTANCE VARIABLES
    public final int POWER_BANK_CAPACITY = 10000;
    private static boolean status = false;
    public Phone phone;
    public Charger charger;

    //CONSTRUCTORS
    public PowerBank(){

    }
    public PowerBank(Phone phone){
        this.phone = new Phone();
    }

    //METHODS
    public boolean switchOn(){
        return status = true;
    }
    public boolean switchOff(){
        return status = false;
    }
    public boolean switchStatus(){
        return status;
    }

    @Override
    public int getCapacity() {
        return this.POWER_BANK_CAPACITY;
    }

    @Override
    public String setCapacity(int capacity) {
        return ("Can't set capacity to Power Bank");

    }


    @Override
    public boolean connect() {

        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }
}
