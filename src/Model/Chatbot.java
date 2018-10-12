package Model;
import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> responseList = new ArrayList<String>();
	private ArrayList<String> spookyList = new ArrayList<String>();
	private String content = "";
	private String currentUser = "";
	private String joke = "";
	
	public Chatbot()
	{
		responseList = new ArrayList<String>();
		
	}
	
	public Chatbot(String userInput)
	{
		
	}
	
	public String askName()
	{
	
		return null;
	}
	
	//--[GET]--
	public String getContent()
	{
		return content;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public String getjoke()
	{
		return joke;
	}
	
	//--[SET]--
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
	
}
