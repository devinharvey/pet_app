
import javax.swing.*;
public class Capitalizer
{
	public static void main(String[]args)
	{
		String stringIn=JOptionPane.showInputDialog(null,"Enter a String");
		int stringLength=stringIn.length();
		int charPosition=0;
		char aChar;
		while(charPosition<stringLength)
		{	
			aChar = Character.toUpperCase(stringIn.charAt(charPosition));
			if(charPosition==0)
			{
				stringIn=aChar + stringIn.substring(1,stringLength);
			}
			if(charPosition>0 && charPosition<stringLength-1)
			{
				stringIn=stringIn.substring(0,charPosition)+
					aChar+ stringIn.substring(charPosition+1,stringLength);
			}
			if(charPosition==stringLength-1)
			{
				stringIn=stringIn.substring(0,stringLength-1)+aChar;
			}
			charPosition=++charPosition;
		}
		System.out.println(stringIn);
		System.out.println("stringLength is "+ stringLength + " and charPosition is "+charPosition);
	}	
}

/*
import javax.swing.*;
public class Capitalizer
{
	public static void main(String[]args)
	{
		String stringIn;
		int stringLength;
		int charPosition;
		char aChar;
		do
		{
			stringIn=JOptionPane.showInputDialog(null,"Enter a String");
			stringLength=stringIn.length();
			charPosition=0;
			while(charPosition<stringLength)
				{	
					aChar = Character.toUpperCase(stringIn.charAt(charPosition));
					if(charPosition==0)
					{
						stringIn=aChar + stringIn.substring(1,stringLength);
					}
					if(charPosition>0 && charPosition<stringLength-1)
					{
						stringIn=stringIn.substring(0,charPosition)+
							aChar+ stringIn.substring(charPosition+1,stringLength);
					}
					if(charPosition==stringLength-1)
					{
						stringIn=stringIn.substring(0,stringLength-1)+aChar;
					}
					charPosition=++charPosition;	
				}	
		
				System.out.println(stringIn);
				System.out.println("stringLength is "+ stringLength + " and charPosition is "+charPosition);
		}	
		while(stringIn!="0");
	}
}
*/
/*
import javax.swing.*;
public class Capitalizer
{
	public static void main(String[]args)
	{
		String stringIn=JOptionPane.showInputDialog(null,"Enter a String");
		String capitalString="";
		char aChar;
	
	
		for(int charPosition=0;charPosition<stringIn.length();++charPosition)
		{
			aChar=Character.toUpperCase(stringIn.charAt(charPosition));
			capitalString=capitalString+aChar;
		}
		System.out.println(capitalString);
	}	
}
*/
/*
import javax.swing.*;
public class Capitalizer
{
	public static void main(String[]args)
	{
		String stringIn="";
		String capitalString;
		String loopExit="NO";
		char aChar;
	do
	{
		stringIn=JOptionPane.showInputDialog(null,"Enter a String");
		capitalString="";	
	
		for(int charPosition=0;charPosition<stringIn.length();++charPosition)
		{
			aChar=Character.toUpperCase(stringIn.charAt(charPosition));
			capitalString=capitalString+aChar;
		}
		System.out.println(capitalString);
	}
	while(!(stringIn.equals(loopExit)));	
	}	
}
*/


























