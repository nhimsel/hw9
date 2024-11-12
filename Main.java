public class Main 
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        
        System.out.println(f1+"\n"+f2);

        Fraction ans1 = f1.add(f2);
        Fraction ans2 = f2.add(f1);

        System.out.println(ans1+"\n"+ans2);

        ans1.reduce();
        ans2.reduce();

        System.out.println(ans1+"\n"+ans2);
    }
}
