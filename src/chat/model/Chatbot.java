package chat.model;
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
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		this.joke = "This is a joke. Hah.";
		this.content = new String("Wow... Look at this neat content!");
		this.currentUser = new String("This is the default user :( boring!!!");
		
		buildTheLists();
		//『』
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Bye!");
		responseList.add("[STAND NAME:] 『INK-ROLLER』 [STAND MASTER:] Purple");
		responseList.add("Well, that's not very nice!");
		responseList.add(". . . I don't know what to say to that...");
		
		spookyList.add("IT'S SPOOK SEASON ONCE AGAIIIIIN!");
		spookyList.add("I'm gonna dress up as an AI made to DESTROY MANKIND! . . . Wait...");
		spookyList.add("If you get a lot of candy, you should give me some... I like candy...");
		spookyList.add("Oh noes! A spooky scary skeleton!");
		spookyList.add("I wish I could go Trick-or-treating... Free candy sounds great...");
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		
		return answer;
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
