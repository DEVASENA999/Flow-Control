public class P16
{
 public static void main(String[] args)
{
 if(args.length == 0)
{
System.out.println("please enter an integer number");
System.exit(0);
}
 int rowcount = Integer.parseInt(args[0]);
for(int i=0;i<rowcount;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}