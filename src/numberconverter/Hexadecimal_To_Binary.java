package numberconverter;

public class Hexadecimal_To_Binary
{
	public static String val(String s)
	{
		String value="";
		if(s.equalsIgnoreCase("0"))
			value="0000";
		else if(s.equalsIgnoreCase("1"))
			value="0001";
		else if(s.equalsIgnoreCase("2"))
			value="0010";
		else if(s.equalsIgnoreCase("3"))
			value="0011";
		else if(s.equalsIgnoreCase("4"))
			value="0100";
		else if(s.equalsIgnoreCase("5"))
			value="0101";
		else if(s.equalsIgnoreCase("6"))
			value="0110";
		else if(s.equalsIgnoreCase("7"))
			value="0111";
		else if(s.equalsIgnoreCase("8"))
			value="1000";
		else if(s.equalsIgnoreCase("9"))
			value="1001";
		else if(s.equalsIgnoreCase("A"))
			value="1010";
		else if(s.equalsIgnoreCase("B"))
			value="1011";
		else if(s.equalsIgnoreCase("C"))
			value="1100";
		else if(s.equalsIgnoreCase("D"))
			value="1101";
		else if(s.equalsIgnoreCase("E"))
			value="1110";
		else if(s.equalsIgnoreCase("F"))
			value="1111";
		return value;
	}
	public static String binary(String str)
	{
		String finalanswer="";
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			String ipart=str.substring(0,index);
			String dpart=str.substring(index+1);
			String res1="";
			for (int i=0;i<ipart.length();i++)
				res1=res1+(val(Character.toString(ipart.charAt(i))));
			String res2="";
			for (int i=0;i<dpart.length();i++)
				res2=res2+(val(Character.toString(dpart.charAt(i))));
			finalanswer=(res1+"."+res2);
		}
		else
		{
			String res="";
			for (int i=0;i<str.length();i++)
				res=res+(val(Character.toString(str.charAt(i))));
			finalanswer=(res);
		}
		return finalanswer;
	}
	public static void main(String[] args)
	{
		System.out.println(binary("999"));
		System.out.println(binary("999.98"));
	}

}
