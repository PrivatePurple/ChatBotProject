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
		this.appPanel = appPanel;
		setupFrame();
	}
	
		private void setupFrame()
		{
			this.setContentPane(appPanel);
			this.setSize(800, 800);
			this.setTitle("My first GUI");
			this.setResizable(true);
			this.setVisible(true);
	}
	
}
