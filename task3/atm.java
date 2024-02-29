import java.util.*;
class bankaccount
{
public double balance=0;

public double getBalance()
{
return balance;
}
public void deposit(double amount)
{
if(amount>0)
{
balance=balance+amount;
System.out.println("your amount is deposited..");
}
else
{
System.out.println("invalid amount");
}
}
public void withdrawal(double amount)
{
if(amount>0 &&  amount <= balance)
{
balance=balance-amount;
System.out.println("withdrawal successfully");
}
else
{
System.out.println("invalid withdrawal");
}
}
}
class atm extends bankaccount
{
public static void main(String [] args)
{
bankaccount m=new bankaccount();
Scanner in=new Scanner(System.in);
while(true)
{
System.out.println("ATM Menu:");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
System.out.println("enter your option");
int option=in.nextInt();
switch(option)
{
case 1:
System.out.println("enter the amount to deposit");
double depositamount=in.nextDouble();
m.deposit( depositamount);
System.out.println("your amount has been deposited");
break;
case 2:
System.out.println("enter the amount for withdrawal");
double withdrawalamount=in.nextDouble();
m.withdrawal(withdrawalamount);
System.out.println("withdrawal succesfully");
break;
case 3:
double net=m.getBalance();
System.out.println("your balance:"+net);
break;
case 4:
System.out.println("thank you");
System.exit(0);
break;
}
}
}
}


   


