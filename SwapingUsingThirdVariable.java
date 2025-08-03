
class SwapingUsingThirdVariable
{
     
    public static void main (String [] args)
    {
          
        int a=10,b=20;
        System.out.println("Before Swaping:"+"\na = 10 , b = 20 ");
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("After Swaping: ");
        System.out.print("a = "+a);
        System.out.print(" , b = "+b);
    }
}