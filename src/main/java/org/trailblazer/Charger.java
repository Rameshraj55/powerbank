package org.trailblazer;

public class Charger implements Connectable, Disconnectable {

    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }
}
