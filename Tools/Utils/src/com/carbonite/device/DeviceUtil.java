package com.carbonite.device;

public class DeviceUtil {

	public static final Device DEFAULT_DEVICE = Device.DESKTOP;

	private static Device device;

	public static Device getDevice() {
		
		device=Device.getByName(System.getProperty("device",DEFAULT_DEVICE.toString()));

		return device;
	}

}
