import java.util.Scanner;
class gradecalculator
{
public static void main(String [] args)
{
int n;
double total=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the number of subject");
n=in.nextInt();
double mark;
for(int i=1;i<=n;i++)
{
System.out.println("enter the mark of subject "+i);
mark=in.nextDouble();
total=total+mark;
}
double avermark=total/n;
System.out.println("the average percentage  is :"+avermark);
char grade=calgarde(avermark);
System.out.println("the grade of the student "+grade);
}
public static char calgarde(double avermark)
{
if(avermark>=90)
{
return 'A';
}
else if(avermark>=80)
{
return 'B';
}
else if(avermark>=70)
{
return 'C';
}
else if(avermark>=60)
{
return 'D';
}
else 
{
return 'F';
}
}
}





