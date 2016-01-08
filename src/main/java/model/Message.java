package model;

public class Message {

	private int messageId;
	private String messageBody;
	private String messageAuthor;
	public Message(){}
	public Message(int messageId, String messageBody, String messageAuthor) {
		super();
		this.messageId = messageId;
		this.messageBody = messageBody;
		this.messageAuthor = messageAuthor;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	public String getMessageAuthor() {
		return messageAuthor;
	}
	public void setMessageAuthor(String messageAuthor) {
		this.messageAuthor = messageAuthor;
	}
}
