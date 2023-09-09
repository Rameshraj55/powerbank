package org.trailblazer;

public class Phone implements Capacity, Connectable, Disconnectable{
    private int phoneCapacity;
    @Override
    public int getCapacity() {
        return this.phoneCapacity;
    }
    public String setCapacity(int phoneCapacity) {
        this.phoneCapacity = phoneCapacity;
        return "Capacity Set "+ this.phoneCapacity;

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
