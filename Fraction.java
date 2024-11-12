public class Fraction 
{
    private int num;
    private int denom;

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int getNum()
    {
        return this.num;
    }
    
    public int getDenom()
    {
        return this.denom;
    }
    
    public Fraction add(Fraction f)
    {
        Fraction ans = new Fraction(this.num*f.denom+f.num*this.denom, this.denom*f.denom);
        return ans;
    }

    public void reduce()
    {
        int gcd = GCD(this.num, this.denom);
        this.num/=gcd; this.denom/=gcd;
    }
    
    private static int GCD(int a, int b)
    {
        if (a==0) return b;
        else if (b==0) return a;
        else return GCD(b,a%b);
    }
    
    @Override
    public String toString()
    {
        return this.num + "/" + this.denom;
    }
}
