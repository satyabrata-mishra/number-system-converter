package numberconverter;

public class Octal_To_Binary
{
	public static String val(char n)
	{
		String str="";
		if (n=='0')
			str="000";
		else if(n=='1')
			str="001";
		else if(n=='2')
			str="010";
		else if(n=='3')
			str="011";
		else if(n=='4')
			str="100";
		else if(n=='5')
			str="101";
		else if(n=='6')
			str="110";
		else if(n=='7')
			str="111";
		return str;
	}
	public static String binary(String str)
	{
		String finalanswer="";
		if(str.contains(".")) 
		{
			int n=str.indexOf(".");
			String ipart=str.substring(0,n);
			String dpart=str.substring(n+1);
			String res1="";
			for (int i=0;i<ipart.length();i++)
				res1=res1+val(ipart.charAt(i));
			String res2="";
			for (int i=0;i<dpart.length();i++)
				res2=res2+val(dpart.charAt(i));
			finalanswer= (Integer.parseInt(res1)+"."+res2);
		}
		else
		{
			String res="";
			for (int i=0;i<str.length();i++)
			{
				res=res+val(str.charAt(i));
			}
			finalanswer=res;
		}
		return finalanswer;
	}
	public static void main(String[] args)
	{
//		Enter a Octal Number
		System.out.println(binary("173"));
		System.out.println(binary("173.172"));
	}

}
