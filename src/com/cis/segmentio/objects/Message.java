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
	
	
	public String getType() {
		return type;
	}


	public String getMessageId() {
		return messageId;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public Context getContext() {
		return context;
	}


	public String getUserId() {
		return userId;
	}


	public Integrations getIntegrations() {
		return integrations;
	}


	public Traits getTraits() {
		return traits;
	}


	public String getWriteKey() {
		return writeKey;
	}


	public String getSentAt() {
		return sentAt;
	}


	public String getReceivedAt() {
		return receivedAt;
	}


	public String getOriginalTimestamp() {
		return originalTimestamp;
	}


	@Override
	public String toString() {
        return type + " - " + messageId + " @ " + timestamp
        		+ "\n" + "Traits: " + traits.toString();
    }
	
	
}
