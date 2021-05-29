public class Armstrong
{
public static void main(String args[])
{
int num=182;
int o , t, h;
int sum=0;
o=num%10;
t=((num/10)%10);
h=num/100;
sum=((o*o*o)+(t*t*t)+(h*h*h));
System.out.println("Number= "+sum);
if(num==sum)
{
System.out.println("This is an Armstrong number.");
}
else
{
System.out.println("This is not an Armstrong number.");	
}
}
}
