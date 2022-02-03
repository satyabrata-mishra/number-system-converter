package numberconverter;

public class Decimal_To_Octal
{
	public static void octal(String str)
	{
		if(Double.parseDouble(str)==0)
		{
			System.out.println(0);
			System.exit(0);
		}
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			int ipart=Integer.parseInt(str.substring(0,index));
			double dpart=Double.parseDouble("0."+str.substring(index+1));
			String s="";
			while(ipart!=0)
			{
				int temp=ipart%8;
				s=s+temp;
				ipart=ipart/8;
			}
			StringBuilder res1=new StringBuilder(s);
			res1=res1.reverse();
			String res2="";
			int count=0;
			while(true)
			{
				if(dpart==0 || count==10)
					break;
				dpart=dpart*8;
				res2=res2+(int)dpart;
				dpart=dpart-(int)dpart;
				count++;
			}
			System.out.println("Octal Equivalent Of The Decimal Number is "+Integer.parseInt(res1.toString())+"."+res2);
		}
		else
		{
			int num=Integer.parseInt(str);
			if(num==0)
			{
				System.out.println(0);
				System.exit(0);
			}
			String s="";
			while(num!=0)
			{
				int temp=num%8;
				s=s+temp;
				num=num/8;
			}
			StringBuilder res=new StringBuilder(s);
			res=res.reverse();
			System.out.println("Octal Equivalent Of The Decimal Number is "+Integer.parseInt(res.toString()));
		}
	}
	public static void main(String[] args)
	{
//	Enter a decimal number
		octal("345");
		octal("1.14");
	}

}
