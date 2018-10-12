package Controller;
import Model.Chatbot;
import javax.swing.JOptionPane;

public class chatbotController
{
	public chatbotController()
	{
	
	}
	
	private Chatbot simplebot;
	{
		simplebot = new Chatbot();
	}
	
	public void start()
	{
		String userInput= "";
		while(!userInput.equalsIgnoreCase("no u"))
		{
			userInput = JOptionPane.showInputDialog(null, "oof owch owie my bones");
		}
	}

	public String interactWithChatbot(String userInput)
	{
		return null;
	}
	
}
