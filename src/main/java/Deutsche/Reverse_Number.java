package Deutsche;

public class Reverse_Number {
    public static void main(String[] args) {


        int num=12345;

        int rem, rev=0;

        while(num>0)
        {
            rem=num%10;
            rev = rem+rev*10;
            num=num/10;
        }
        System.out.println(rev);

    }
}
