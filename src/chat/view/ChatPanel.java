package chat.view;

import chat.controller.chatbotController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import chat.controller.chatbotController;


public class ChatPanel extends JPanel
{
	private chatbotController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton resetButton;
	
	public ChatPanel(chatbotController appController)
	{
		super();
		
		this.appController = appController;
		appLayout = new SpringLayout();
		
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		resetButton = new JButton("Reset");
		
		chatArea = new JTextArea("", 20, 50);
		chatPane = new JScrollPane();
		chatField = new JTextField("Talk to the bot here", 50);
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(new Color(28, 255, 77));
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(resetButton);
		this.add(chatField);
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 92, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 92, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 92, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 92, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, 109, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, 109, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, 109, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 109, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 38, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 38, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 38, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 38, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 30, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
		
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//do something here
			}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//do something here
			}
		});
		
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//do something here
			}
		});
		
		resetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//do something here
			}
		});
	}
	
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
}
