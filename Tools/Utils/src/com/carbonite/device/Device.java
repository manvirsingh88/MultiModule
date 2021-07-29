package com.carbonite.device;

public enum Device {

	DESKTOP("DESKTOP"),MOBILE("MOBILE");
	
	private String name;
	
	private Device(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
	
	public String getDeviceName() {
		return name;
	}
	
	public static Device getByName(String name) {

		Device returnvalue=null;
		for(final Device element: Device.values()) {
		if(element.toString().equals(name)) {
			
			returnvalue=element;
		}	
		}
		return returnvalue;
		}
	
	
}
