package numberconverter;
public class Octal_To_Decimal
{
	public static void decimal(String str)
	{
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			int ipart=Integer.parseInt(str.substring(0,index));
			String dpart=str.substring(index+1);
			int x=0;
			int res1=0;
			while (ipart!=0)
			{
				int temp=ipart%10;
				res1=res1+((int)Math.pow(8, x)*temp);
				x++;
				ipart=ipart/10;
			}
			x=-1;
			double res2=0;
			for(int i=0;i<dpart.length();i++,--x)
			{
				double temp=Double.parseDouble(Character.toString(dpart.charAt(i)));
				res2=res2+(Math.pow(8, x)*temp);
			}
			System.out.println("Decimal Equivalent Of The Octal Number is "+res1+res2);
		}
		else
		{
			int num=Integer.parseInt(str);
			int x=0;
			int count=0;
			while(num!=0)
			{
				int temp=num%10;
				count =count+((int)Math.pow(8, x)*temp);
				num=num/10;
				x++;
			}
			System.out.println("Decimal Equivalent Of The Octal Number is "+count);
		}
	}
	public static void main(String[] args)
	{
		decimal("456");
		decimal("67.53");
	}

}
