package com.cis.segmentio.objects;

public class Message {

	private String type;
	private String messageId;
	private String timestamp;
	private Context context;
	private String userId;
	private Integrations integrations;
	private Traits traits;
	private String writeKey;
	private String sentAt;
	private String receivedAt;
	private String originalTimestamp;
	
	
	@Override
	public String toString() {
        return type + " - messageid";
    }
	
	
}
