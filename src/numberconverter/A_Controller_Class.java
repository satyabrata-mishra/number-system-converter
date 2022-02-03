package numberconverter;
import java.util.Scanner;
public class A_Controller_Class
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Enter a binary number");
		System.out.println("2.Enter a octal number");
		System.out.println("3.Enter a decimal number");
		System.out.println("4.Enter a hexadecimal number");
		System.out.println("5.Exit");
		while(true)
		{
			System.out.print("Enter Your Choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.print("Enter a binary number: ");
					String str=sc.next();
					Binary_To_Octal obj1=new Binary_To_Octal();
					System.out.println("Octal Equivalent Of The Binary Number is "+obj1.octal(str));
					Binary_To_Decimal obj2=new Binary_To_Decimal();
					obj2.decimal(str);
					Binary_To_Hexadecimal obj3=new Binary_To_Hexadecimal();
					System.out.println("Hexadecimal Equivalent Of The Binary Number is "+obj3.hexa(str));
					break;
			case 2: System.out.print("Enter a octal number: ");
					String str2=sc.next();
					Octal_To_Binary obj4=new Octal_To_Binary();
					System.out.println("Binary Equivalent Of The Octal Number is "+obj4.binary(str2));
					Octal_To_Decimal obj5=new Octal_To_Decimal();
					obj5.decimal(str2);
					Octal_To_Hexadecimal obj6=new Octal_To_Hexadecimal();
					obj6.hexa(str2);
					break;
			case 3: System.out.print("Enter a decimal number: ");
					String str3=sc.next();
					Decimal_To_Binary obj7=new Decimal_To_Binary();
					obj7.binary(str3);
					Decimal_To_Octal obj8=new Decimal_To_Octal();
					obj8.octal(str3);
					Decimal_To_Hexadecimal obj9=new Decimal_To_Hexadecimal();
					obj9.hexa(str3);
					break;
			case 4: System.out.print("Enter a hexadecimal number: ");
					String str4=sc.next();
					Hexadecimal_To_Binary obj10=new Hexadecimal_To_Binary();
					System.out.println("Binary Equivalent Of The Hexadecimal Number Is "+obj10.binary(str4));
					Hexadecimal_To_Octal obj11=new Hexadecimal_To_Octal();
					obj11.octal(str4);
					Hexadecimal_To_Decimal obj12=new Hexadecimal_To_Decimal();
					obj12.decimal(str4);
					break;
			case 5: System.out.println("PROGRAM TERMINATED SUCCESSFULLY!");
					System.exit(0);break;
			default:System.out.println("Enter a valid input!");
			}
		}
	}

}