package com.cis.segmentio.objects;

public class Context {
	
	private String timezone;
	private String locale;
	//private Library library;
	
	@Override
	public String toString() {
        return timezone + " - " + locale;
    }
	
}
