import java.util.Scanner;
public class P1
{
    public static void main(String[] args) 
    {
       
int x=Integer.parseInt(args[0]);
       
        if(x > 0)
        {
            System.out.println(" Positive");
        }
        else if(x < 0)
        {
            System.out.println(" Negative");
        }
        else
        {
            System.out.println("zero ");
        }
    }
}