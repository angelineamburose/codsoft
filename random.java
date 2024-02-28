import java.util.Random;
import java.util.Scanner;
class random
{
public static void main(String [] args)
{
int  ran,ans,i=1;
Scanner in=new Scanner(System.in);
System.out.println(" guess the number between 1 to 100:");
Random gus=new Random();
ran=gus.nextInt(100);
int fan=1;
System.out.println("you have 5 attempt to guess the number.");
System.out.println();
System.out.println("the total score is 100.For every attempt the score will reduce by 10");
System.out.println();
System.out.println("at end your score will be displayed");
System.out.println();
int score=100;
do
{
System.out.println("enter the guessing number");
ans=in.nextInt();
if(ans==ran)
{
fan=1;
System.out.println("well done! you guessed correctly");
}
else if(ans>ran)
{
System.out.println("its too high.Try again!");
score=score-10;
}
else if(ans<ran)
{
System.out.println("its too low.Try again!");
score=score-10;
}
i++;
}
while(i<=5&&( ans!=ran));
if(fan!=1)
{
System.out.println("BETTER LUCK NEXT TIME");
}
else
{
System.out.println("You've done it! ..");
}
System.out.println("your score is:"+score);
System.out.println("the random number is :"+ran);

}
}



