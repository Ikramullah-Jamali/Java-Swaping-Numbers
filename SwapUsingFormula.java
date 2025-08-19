public class  SwapUsingFormula
{
    static void SwapByMathFormula()
    {
        int a=100,b=200;
        System.out.println("The value a= "+a+" and b= "+b);
        a=(a+b)-(b=a);
        System.out.println(" .... After Swapping ....");
        System.out.println("The value a= "+a+" and b= "+b);

    }
    public static void main(String [] args)
    {
        SwapByMathFormula();
    }
}
