package chat.view;

import chat.controller.chatbotController;
import javax.swing.*;


public class ChatPanel extends JPanel
{
	private chatbotController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		chatButton = new JButton("BUTTON!");
		chatArea = new JTextArea();
		chatPane = new JScrollPane();

	}
	
}
