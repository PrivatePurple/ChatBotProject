package chat.controller;
import javax.swing.JOptionPane;

import chat.model.Chatbot;

public class chatbotController
{
	public chatbotController()
	{
		
	}
	
	private Chatbot simpleBot;
	{
		simpleBot = new Chatbot();
	}
	
	
	public void start()
	{
		String userInput= "";
		while(!userInput.equalsIgnoreCase("no u"))
		{
			userInput = JOptionPane.showInputDialog(null, "oof owch owie my bones");
			
			if (userInput.equalsIgnoreCase("PR1V4T3LY_PURPL3"))
			{
				JOptionPane.showMessageDialog(null, "[ACCESS GRANTED]");
			}
			
			while (!userInput.equalsIgnoreCase("quit"))
			{
				userInput = interactWithChatbot(userInput);
			}
		}
	}
	

	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, text);
		
		output = simpleBot.processText(userResponse);
		
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
	
	
}
