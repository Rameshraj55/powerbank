package devices;

public class Mobile {

    private String mobileName;
    private final int capacity;
    private int batteryStatus;
    public Mobile(String mobileName, int capacity, int batteryStatus){
        this.mobileName = mobileName;
        this.capacity = capacity;
        this.batteryStatus = batteryStatus;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }
}
