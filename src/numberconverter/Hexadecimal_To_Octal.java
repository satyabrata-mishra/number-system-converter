package numberconverter;

public class Hexadecimal_To_Octal
{
	public static void octal(String s)
	{
		Hexadecimal_To_Binary obj1=new Hexadecimal_To_Binary();
		String str=obj1.binary(s);
		Binary_To_Octal obj2=new Binary_To_Octal();
		str=obj2.octal(str);
		System.out.println("Octal Equivalent Of The Hexadecimal Number is "+str);
	}
	public static void main(String[] args)
	{
		octal("45");
	}

}
