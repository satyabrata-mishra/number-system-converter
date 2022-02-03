package numberconverter;

public class Octal_To_Hexadecimal
{
	public static void hexa(String s)
	{
		Octal_To_Binary obj1=new Octal_To_Binary();
		String str=obj1.binary(s);
		Binary_To_Hexadecimal obj2=new Binary_To_Hexadecimal();
		str=obj2.hexa(str);
		System.out.println("Hexadecimal Equivalent Of The Octal Number is "+str);
	}
	public static void main(String[] args) 
	{
		hexa("71.45");
	}

}
