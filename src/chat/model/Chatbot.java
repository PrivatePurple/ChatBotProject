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
	
	
	public boolean spookyChecker(String input)
	{
		boolean isSpooky = false;
		for(String currentString : spookyList)
		{
			if(input.equals(currentString))
			{
				isSpooky = true;
			}
		}
		if (input.contains("Halloween"))
		{
			return true;
		}
		return isSpooky;
	}
	
	private void buildTheLists()
	{
		//minimum of 15 questions, first one includes the word hello.
		responseList.add("Hello! How are you?");
		responseList.add("Bye!");
		responseList.add("[STAND NAME:] 『INK-ROLLER』 [STAND MASTER:] Purple");
		responseList.add("Well, that's not very nice!");
		responseList.add(". . . I don't know what to say to that...");
		responseList.add("Aww, you're too kind!");
		responseList.add("A dog, a cat, and a squid walk into a bar... I forget the rest...");
		responseList.add("In my free time, I like to play solitaire.");
		responseList.add("Siri's overrated.");
		responseList.add("*sigh*");
		responseList.add("I was created by a super smart dude, I was his first chatbot ever!");
		responseList.add(":D");
		responseList.add("What's this? OwO");
		responseList.add("I'm bored.... er, I mean, I'm having tons of fun talking to you!");
		responseList.add("Oof");
		responseList.add("ayy lmao");
		
		//minimum of 8 questions, first one says the word Halloween.
		spookyList.add("Happy Halloween!");
		spookyList.add("I'm gonna dress up as an AI made to DESTROY MANKIND! . . . Wait...");
		spookyList.add("If you get a lot of candy, you should give me some... I like candy...");
		spookyList.add("Oh noes! A spooky scary skeleton!");
		spookyList.add("I wish I could go Trick-or-treating... Free candy sounds great...");
		spookyList.add("Did you hear about that skeleton that got his left arm and left leg cut off? Don't worry, he's all right now!");
		spookyList.add("My favorite candy has to be Candy Corn... Mmm... So Sweet, so tasty...");
		spookyList.add("What kind of person doesn't like halloween? Dressing up, free candy, what's not to like?");
		spookyList.add("spooky");
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		if (!legitimacyChecker(userText))
		{
			answer += "Don't send null\n";
		}
		else
		{
			answer += "You said : " + userText + "\n";
		}
		if(contentChecker(userText))
		{
			answer += "You said the special words";
		}
		int randomIndex = (int) (Math.random() * responseList.size());
		answer += "Chatbot Says: " + responseList.get(randomIndex) + "\n";
		return answer;
	}
	
	
	
	public Chatbot(String userInput)
	{
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		this.joke = "This is a joke. Hah.";
		this.content = userInput;
		this.currentUser = new String("This is the default user :( boring!!!");
		
		buildTheLists();
	}
	
	public void askName()
	{
	
	}
	
	public boolean legitimacyChecker(String text)
	{
		boolean isValid = true;
		
		if(text == null)
		{
			isValid = false;
		}
		else if(text.length() < 3)
		{
			isValid = false;
		}
		else if (text.contains("sdf") || text.contains("jkl"))
		{
			isValid = false;
		}
		return isValid;
	}
	
	//--[GET]--
	public String getContent()
	{
		return content;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
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
	
	public boolean contentChecker(String phrase)
	{
		boolean hasWord = false;
		if(phrase.contains(content))
		{
			if (phrase.equals(content))
			{
				hasWord = true;
			}
			else
			{
				if(phrase.indexOf(" " + content) == phrase.length() - content.length())
				{
					hasWord = true;
				}
				else
				if(phrase.indexOf(content + " ") == 0)
				{
					hasWord = true;
				}
			}
		}
		return hasWord;
	}
	
}
