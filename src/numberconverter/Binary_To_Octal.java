package numberconverter;
public class Binary_To_Octal
{
	public static String val(String n)
	{
		String temp="";
		if(n.equalsIgnoreCase("000"))
			temp="0";
		else if(n.equalsIgnoreCase("001"))
			temp="1";
		else if(n.equalsIgnoreCase("010"))
			temp="2";
		else if(n.equalsIgnoreCase("011"))
			temp="3";
		else if(n.equalsIgnoreCase("100"))
			temp="4";
		else if(n.equalsIgnoreCase("101"))
			temp="5";
		else if(n.equalsIgnoreCase("110"))
			temp="6";
		else if(n.equalsIgnoreCase("111"))
			temp="7";
		return temp;
	}
	public static String octal(String str)
	{
		String finalanswer="";
		str=str.trim();
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			String ipart=str.substring(0,index);
			String dpart=str.substring(index+1);
			if(ipart.length()%3!=0)
			{
				for (int i=0;i<ipart.length()%3;i++)
					ipart="0"+ipart;
			}
			String result1="";
			for (int i=0;i<=ipart.length()-3;i+=3)
			{
				String temp=ipart.substring(i, i+3);
				result1=result1+val(temp);
			}
			if(dpart.length()%3!=0)
			{
				for (int i=0;i<dpart.length()%3;i++)
					dpart=dpart+"0";
			}
			String result2="";
			for (int i=0;i<=dpart.length()-3;i+=3)
			{
				String temp=dpart.substring(i, i+3);
				result2=result2+val(temp);
			}
			finalanswer=(result1+"."+result2);
		}
		else
		{
			if(str.length()%3!=0)
			{
				for (int i=0;i<str.length()%3;i++)
					str="0"+str;
			}
			String result="";
			for (int i=0;i<=str.length()-3;i+=3)
			{
				String temp=str.substring(i, i+3);
				result=result+val(temp);
			}
			finalanswer=(result);
		}
		return finalanswer;
	}
	public static void main(String[] args)
	{
//		Enter a binary number
		System.out.println(octal("0110011.1011"));
		System.out.println(octal("1010111100"));
	}

}