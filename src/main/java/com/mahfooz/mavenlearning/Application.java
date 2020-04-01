package com.mahfooz.mavenlearning;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application
{
	public Application()
	{
		System.out.println("Inside Application");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWord("I have four words");
		System.out.println(count);
	}
	
	public void greet()
	{
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		for(String greeting:greetings)
		{
			System.out.println(greeting);
		}
	}
	
	public int countWord(String words)
	{
		String[] separateWords=StringUtils.split(words,' ');
		return (separateWords==null)?0:separateWords.length;
	}
}