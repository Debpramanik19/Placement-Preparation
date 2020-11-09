package strings;
import java.util.*;
import java.util.HashSet;
public class LongestSub
{
	static String Longest(String str)
	{
		HashSet<Character> set = new HashSet<>();
		String LongestTillnow = "";
		String LongestOverall = "";
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(set.contains(c))
			{
				LongestTillnow="";
				set.clear();
			}
			set.add(c);
			LongestTillnow += c;
			if(LongestTillnow.length()>LongestOverall.length())
			{
				LongestOverall=LongestTillnow;
			}
		}
		return LongestOverall;
	}
	public static void main(String args[])
	{
		String str="dvdf";
		System.out.println("The longest substring is: "+ Longest(str));
	}
}					
