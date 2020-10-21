
public class Caesar {
	
	private String caesarCode(String input, char offset)
	{
		input = input.toUpperCase();
		
		String output = "";
		for (char c : input.toCharArray())
		{
			if (Character.isAlphabetic(c))
				output += (char) ((c - 'A' + offset - 'A') % 26 + 'A');
			else if (c == ' ')
				output += ' ';
		}
		return output;
	}

	private String caesarDecode(String input, char offset)
	{
		input = input.toUpperCase();
		
		String output = "";
		for (char c : input.toCharArray())
		{
			if (Character.isAlphabetic(c))
				output += (char) ((c-'A' - (offset-'A') + 26) % 26 +'A');
			else if (c == ' ')
				output += ' ';
		}
		return output;
	}
	
	String getCaesarCode(String input, char offset)
	{
		return caesarCode(input, offset);
	}
	
	String getCaesarDecode(String input, char offset)
	{
		return caesarDecode(input, offset);
	}
}