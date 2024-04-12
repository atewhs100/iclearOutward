package com.test.interview;


//9. How do you remove leading and trailing spaces from a string in Java?
public class RemoveSpaces {

	public static void main(String[] args) {
		/*The String class contains two methods to remove leading and trailing whitespaces: trim() and strip(). The strip() method was added to the String class in Java 11. The strip() method uses the Character.isWhitespace() method to check if the character is a whitespace. This method uses Unicode code points, while the trim() method identifies any character with a codepoint value less than or equal to U+0020 as a whitespace character.

		The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard. The following example code shows how to use the strip() method to remove whitespaces:
*/
		String s = "      abc  def\t";
				
		s = s.trim();
				
		System.out.println(s);
	//	Because String is immutable, you have to assign the strip() output to the string.

	}

}
