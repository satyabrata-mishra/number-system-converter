package numberconverter;

public class Decimal_To_Hexadecimal
{
	public static void hexa(String str)
	{
		if(str.contains("."))
		{
			int index=str.indexOf(".");
			int ipart=Integer.parseInt(str.substring(0,index));
			double dpart=Double.parseDouble("0."+str.substring(index+1));
			String s="";
			while(ipart!=0)
			{
				int temp=ipart%16;
				if(temp==10)
					s=s+"A";
				else if(temp==11)
					s=s+"B";
				else if(temp==12)
					s=s+"C";
				else if(temp==13)
					s=s+"D";
				else if(temp==14)
					s=s+"E";
				else if(temp==15)
					s=s+"F";
				else		
					s=s+temp;
				ipart=ipart/16;
			}
			StringBuilder res1=new StringBuilder(s);
			res1=res1.reverse();
			String res2="";
			int count=0;
			while(true)
			{
				if(dpart==0 || count==20)
					break;
				dpart=dpart*16;
				if((int)dpart==10)
					res2=res2+"A";
				else if((int)dpart==11)
					res2=res2+"B";
				else if((int)dpart==12)
					res2=res2+"C";
				else if((int)dpart==13)
					res2=res2+"D";
				else if((int)dpart==14)
					res2=res2+"E";
				else if((int)dpart==15)
					res2=res2+"F";
				else		
					res2=res2+(int)dpart;
				dpart=dpart-(int)dpart;
				count++;
			}
			System.out.println("Hexadecimal Equivalent Of The Decimal Number is "+res1+"."+res2);
		}
		else
		{
			int num=Integer.parseInt(str);
			String s="";
			while(num!=0)
			{
				int temp=num%16;
				if(temp==10)
					s=s+"A";
				else if(temp==11)
					s=s+"B";
				else if(temp==12)
					s=s+"C";
				else if(temp==13)
					s=s+"D";
				else if(temp==14)
					s=s+"E";
				else if(temp==15)
					s=s+"F";
				else		
					s=s+temp;
				num=num/16;
			}
			StringBuilder res=new StringBuilder(s);
			res=res.reverse();
			System.out.println("Hexadecimal Equivalent Of The Decimal Number is "+res);
		}
	}
	public static void main(String[] args)
	{
		hexa("1000");
		hexa("0.06640625");
	}
}
