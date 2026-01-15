package devices;

import constants.StatusConstants;

public class PowerBank {
    public static final int MAX_CAPACITY = 10000;
    private static final int MAX_MOBILE_DEVICE_COUNT = 3;
    public int connectedDeviceCount = 0;
    public Mobile connectedMobile;

    public PowerBank(){

    }

    public String connect(Mobile connectingMobile) {
        if (connectedDeviceCount > MAX_MOBILE_DEVICE_COUNT ){
            return StatusConstants.NO_PORT_AVAILABLE_MSG;
        }
        connectedMobile = connectingMobile;
        return showConnectedMessage(connectedDeviceCount++);

    }

    private String showConnectedMessage(int connectedDeviceCount){
        if (connectedMobile.getBatteryStatus() == StatusConstants.FULL_CHARGE_PERCENT) {
            return "Device " + connectedDeviceCount + " " + StatusConstants.FULLY_CHARGED;
        }
        return "Device " + connectedDeviceCount + " " + StatusConstants.CHARGING;

    }

}
