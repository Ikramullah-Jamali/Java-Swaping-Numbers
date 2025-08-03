

class SwapingWithoutUsingThirdVariable
{
 
   public static void main (String [] args)
  
    {

        int a=10,b=20;
        System.out.println("Before Swaping:"+"\na = 10 , b = 20 ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swaping: ");
        System.out.print("a = "+a);
        System.out.print(" , b = "+b);
     }
 }
        