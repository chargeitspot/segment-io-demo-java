package com.cis.segmentio.objects;

public class Traits {
	
	private String email;
	private String brand;
	
	public String getEmail() {
		return email;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
        return "Email=" + email + " Brand='" + brand + "'";
    }
	
}
