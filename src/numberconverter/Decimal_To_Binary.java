package numberconverter;
public class Decimal_To_Binary
{
	public static void binary(String str)
	{
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			int ipart=Integer.parseInt(str.substring(0,index));
			double dpart=Double.parseDouble("0."+str.substring(index+1));
			String s="";
			while(ipart>=1)
			{
				int temp=ipart%2;
				s=s+temp;
				ipart=ipart/2;
			}
			s=s+ipart;
			StringBuilder res1=new StringBuilder(s);
			res1=res1.reverse();
			String res2="";
			int count=0;
			while(true)
			{
				if(dpart==0 || count==20)
					break;
				dpart=dpart*2;
				res2=res2+(int)dpart;
				dpart=dpart-(int)dpart;
				count++;
			}
			System.out.println("Binary Equivalent Of The Decimal Number is "+Integer.parseInt(res1.toString())+"."+res2);
		}
		else
		{
			int num=Integer.parseInt(str);
			String s="";
			while(num>=1)
			{
				int temp=num%2;
				s=s+temp;
				num=num/2;
			}
			s=s+num;
			StringBuilder res=new StringBuilder(s);
			res=res.reverse();
			System.out.println("Binary Equivalent Of The Decimal Number is "+Integer.parseInt(res.toString()));
		}
	}
	public static void main(String[] args)
	{
//		Enter a Decimal Number
		binary("202");
		binary("10.6875");
	}

}
