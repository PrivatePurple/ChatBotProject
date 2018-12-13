package chat.controller;
import javax.swing.JOptionPane;
import chat.view.ChatFrame;
import chat.model.Chatbot;

public class chatbotController
{
	private ChatFrame appFrame;
	public chatbotController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	private Chatbot simpleBot;
	{
		simpleBot = new Chatbot();
	}
	
	
	public void start()
	{
		
	}
	

	public String interactWithChatbot(String text)
	{
		String output = "";
		output += simpleBot.processText(text);
		return output;
	}
	
	public String useChatbotCheckers(String input)
	{
		String output ="";
		if(simpleBot.spookyChecker(input))
		{
			output = "Happy Halloween bois";
		}
		return output;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
}
