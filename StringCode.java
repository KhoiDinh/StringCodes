package CS151.HW1;
public class StringCode//help from http://stackoverflow.com/questions/35248632/string-blowup-java and help from cs tutor
{
	
	/**
	 * Returns a version of the original string as follows: each digit 0-9 that appears in the original string 
	 * is replaced by that many occurrences of the character to the right of the digit. So the string "a3tx2z" 
	 * yields "attttxzzz", and "12x" yields "2xxx". A digit not followed by a character (i.e. at the end of the string)
	 * is replaced by nothing.
	 * @param str the string that contains numbers that should be replaced with letters
	 * @return a new string that has been blown up
	 */
	public static String blowup(String str)
	{
		if(str.length()>0)
		{
			String result = "";
			
			for(int i = 0; i < str.length(); i++)
			{
				char chosen = str.charAt(i);

				if (Character.isDigit(chosen))
				{
					if(i==str.length()-1)
					{
						result = result+ str.charAt(str.length()-1);
						return result; 
					}
					else if(i<str.length()-1)
					{

						for (int j = 0; j < (Integer.parseInt(Character.toString(chosen))); j++) 
						{
							result =result+ str.charAt(i+1);
						}
					}
				}
				else
				{
					result =result + chosen;
				}

			}
			return result;
		}
		else
		{
			return "";
		}

	}
	/**
	 * Given a string, returns the length of the largest run in the string. 
	 * A "run" is a series of zero or more adjacent characters that are the same.
	 *  So the max run of "xxyyyz" is 3, and the max run of "xyz" is 1.
	 * @param str the string used to find the longest run
	 * @return the value in integer form for the longest value
	 */
	public static int maxRun(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		else if(str.length()==1)
		{
			return 1;
		}
		else
		{
			String[]temp = str.split("");


			int max = 0;
			int current = 0;
			char previous=str.charAt(0); 
			for (int i=0; i<str.length(); i++) 
			{
				if ( str.charAt(i)== previous) 
				{
					current++;
					if (current > max) 
					{  
						max = current;
					}
				} 
				else 
				{
					current = 1; 
				}
				previous = str.charAt(i); 
			}
			return max;
		}
	}
}
