package App;

public abstract class Message {
	private ILogin login;
	private String sender;
	private String recipient;
	private String content;
	
	public Message(ILogin login, String sender, String recipient, String content) {
		super();
		this.login = login;
		this.sender = sender;
		this.recipient = recipient;
		this.content = content;
	}
	
	
	
	public ILogin getLogin() {
		return login;
	}



	public void setLogin(ILogin login) {
		this.login = login;
	}



	public String getSender() {
		return sender;
	}



	public void setSender(String sender) {
		this.sender = sender;
	}



	public String getRecipient() {
		return recipient;
	}



	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public abstract void send(String username, String password);
}

