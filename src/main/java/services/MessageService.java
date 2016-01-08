package services;

import java.util.ArrayList;
import java.util.List;

import model.Message;

public class MessageService {

	Message msg=new Message(1,"Message1", "MFH");
	Message msg1=new Message(2,"Message2", "FH");
	
	
	public List<Message> getMessage()
	{
		List<Message> msgList=new ArrayList<Message>();
		msgList.add(msg);
		msgList.add(msg1);
		return msgList;
	}
	
}
