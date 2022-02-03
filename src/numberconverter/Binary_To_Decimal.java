package numberconverter;

public class Binary_To_Decimal
{
	public static void decimal(String str)
	{
		if(str.contains("."))
		{
			int i=str.indexOf('.');
			int num=Integer.parseInt(str.substring(0,i));
			String dpart=str.substring(i+1);
			int result1=0;
			int temp1=0;
			while(num!=0)
			{
				int x=num%10;
				result1=result1+((int)Math.pow(2, temp1)*x);
				temp1++;
				num=num/10;
			}
			double result2=0;
			int temp2=-1;
			for (int j=0;j<dpart.length();j++,--temp2)
			{
				int x=Character.getNumericValue(dpart.charAt(j));
				result2=result2+(Math.pow(2, temp2)*x);
			}
			System.out.println("Decimal Equivalent Of The Binary Number is "+result1+result2);
		}
		else
		{
			int result=0;
			int num=Integer.parseInt(str);
			int temp=0;
			while(num!=0)
			{
				int x=num%10;
				result=result+((int)Math.pow(2, temp)*x);
				temp++;
				num=num/10;
			}
			System.out.println("Decimal Equivalent Of The Binary Number is "+result);
		}
	}
	public static void main(String[] args)
	{
//		Enter a binary nummber
		decimal("110111011");
		decimal("1111.101");
	}

}
