package numberconverter;

public class Hexadecimal_To_Decimal
{
	public static void decimal(String str)
	{
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			String ipart=str.substring(0,index);
			String dpart=str.substring(index+1);
			int res1=0;
			int x=0;
			for (int i=ipart.length()-1;i>=0;i--,x++)
			{
				if(ipart.charAt(i)=='a'|| ipart.charAt(i)=='A')
					res1=res1+((int)Math.pow(16, x)*10);
				else if(ipart.charAt(i)=='b'|| ipart.charAt(i)=='B')
					res1=res1+((int)Math.pow(16, x)*11);
				else if(ipart.charAt(i)=='c'|| ipart.charAt(i)=='C')
					res1=res1+((int)Math.pow(16, x)*12);
				else if(ipart.charAt(i)=='d'|| ipart.charAt(i)=='D')
					res1=res1+((int)Math.pow(16, x)*13);
				else if(ipart.charAt(i)=='e'|| ipart.charAt(i)=='E')
					res1=res1+((int)Math.pow(16, x)*14);
				else if(ipart.charAt(i)=='F'|| ipart.charAt(i)=='f')
					res1=res1+((int)Math.pow(16, x)*15);
				else
					res1=res1+((int)Math.pow(16,x)*Integer.parseInt(Character.toString(ipart.charAt(i))));
			}
			x=-1;
			double res2=0;
			for (int i=0;i<dpart.length();i++,x--)
			{
				if(dpart.charAt(i)=='a'|| dpart.charAt(i)=='A')
					res2=res2+(Math.pow(16, x)*10);
				else if(dpart.charAt(i)=='b'|| dpart.charAt(i)=='B')
					res2=res2+(Math.pow(16, x)*11);
				else if(dpart.charAt(i)=='c'|| dpart.charAt(i)=='C')
					res2=res2+(Math.pow(16, x)*12);
				else if(dpart.charAt(i)=='d'|| dpart.charAt(i)=='D')
					res2=res2+(Math.pow(16, x)*13);
				else if(dpart.charAt(i)=='e'|| dpart.charAt(i)=='E')
					res2=res2+(Math.pow(16, x)*14);
				else if(dpart.charAt(i)=='F'|| dpart.charAt(i)=='f')
					res2=res2+(Math.pow(16, x)*15);
				else
					res2=res2+(Math.pow(16,x)*Integer.parseInt(Character.toString(dpart.charAt(i))));
			}
			System.out.println("Decimal Equivalent Of The Hexadecimal number is "+(res1+res2));
		}
		else
		{
			int count=0;
			int x=0;
			for (int i=str.length()-1;i>=0;i--,x++)
			{
				if(str.charAt(i)=='a'|| str.charAt(i)=='A')
					count=count+((int)Math.pow(16, x)*10);
				else if(str.charAt(i)=='b'|| str.charAt(i)=='B')
					count=count+((int)Math.pow(16, x)*11);
				else if(str.charAt(i)=='c'|| str.charAt(i)=='C')
					count=count+((int)Math.pow(16, x)*12);
				else if(str.charAt(i)=='d'|| str.charAt(i)=='D')
					count=count+((int)Math.pow(16, x)*13);
				else if(str.charAt(i)=='e'|| str.charAt(i)=='E')
					count=count+((int)Math.pow(16, x)*14);
				else if(str.charAt(i)=='F'|| str.charAt(i)=='f')
					count=count+((int)Math.pow(16, x)*15);
				else
					count=count+((int)Math.pow(16,x)*Integer.parseInt(Character.toString(str.charAt(i))));
			}
			System.out.println("Decimal Equivalent Of The Hexadecimal number is "+count);
		}
	}
	public static void main(String[] args)
	{
//	Enter a hexadecimal number	
		decimal("5c.dce");
		decimal("98.76");
	}

}
