package chat.view;

import javax.swing.*;
import chat.controller.chatbotController;

public class ChatFrame extends JFrame
{
	private chatbotController appController;
	private ChatPanel appPanel;
	
	public ChatFrame(chatbotController appController)
{
		super();
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		setupFrame();
	}
	
		private void setupFrame()
		{
			this.setContentPane(appPanel);
			this.setSize(800, 600);
			this.setTitle("The best goshdarn chatbot you've ever seen!");
			this.setResizable(false);
			this.setVisible(true);
	}
	
}
