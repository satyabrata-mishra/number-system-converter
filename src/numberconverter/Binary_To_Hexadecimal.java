package numberconverter;

public class Binary_To_Hexadecimal
{
	public static String val(String n)
	{
		String temp="";
		if(n.equalsIgnoreCase("0000"))
			temp="0";
		else if(n.equalsIgnoreCase("0001"))
			temp="1";
		else if(n.equalsIgnoreCase("0010"))
			temp="2";
		else if(n.equalsIgnoreCase("0011"))
			temp="3";
		else if(n.equalsIgnoreCase("0100"))
			temp="4";
		else if(n.equalsIgnoreCase("0101"))
			temp="5";
		else if(n.equalsIgnoreCase("0110"))
			temp="6";
		else if(n.equalsIgnoreCase("0111"))
			temp="7";
		else if(n.equalsIgnoreCase("1000"))
			temp="8";
		else if(n.equalsIgnoreCase("1001"))
			temp="9";
		else if(n.equalsIgnoreCase("1010"))
			temp="A";
		else if(n.equalsIgnoreCase("1011"))
			temp="B";
		else if(n.equalsIgnoreCase("1100"))
			temp="C";
		else if(n.equalsIgnoreCase("1101"))
			temp="D";
		else if(n.equalsIgnoreCase("1110"))
			temp="E";
		else if(n.equalsIgnoreCase("1111"))
			temp="F";
		return temp;
	}
	public static String hexa(String str)
	{
		str=str.trim();
		String finalanswer="";
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			String ipart=str.substring(0,index);
			String dpart=str.substring(index+1);
			if(ipart.length()%4!=0)
			{
				for (int i=0;i<ipart.length()%4;i++)
					ipart="0"+ipart;
			}
			String result1="";
			for (int i=0;i<=ipart.length()-4;i+=4)
			{
				String temp=ipart.substring(i, i+4);
				result1=result1+val(temp);
			}
			if(dpart.length()%4!=0)
			{
				for (int i=0;i<dpart.length()%4;i++)
					dpart=dpart+"0";
			}
			String result2="";
			for (int i=0;i<=dpart.length()-4;i+=4)
			{
				String temp=dpart.substring(i, i+4);
				result2=result2+val(temp);
			}
			finalanswer=(result1+"."+result2);
		}
		else
		{
			if(str.length()%4!=0)
			{
				for (int i=0;i<str.length()%4;i++)
					str="0"+str;
			}
			String result="";
			for (int i=0;i<=str.length()-4;i+=4)
			{
				String temp=str.substring(i, i+4);
				result=result+val(temp);
			}
			finalanswer=(result);
		}
		return finalanswer;
	}
	public static void main(String[] args)
	{
//		Enter a binary nummber
		System.out.println(hexa("001100101.110111"));
		System.out.println(hexa("1101010"));
	}

}
