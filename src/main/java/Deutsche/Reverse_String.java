package Deutsche;

public class Reverse_String {
    public static void main(String[] args)
    {
        String name = "ab45ts";

        char[] c = name.toCharArray();

        int i=0, j=c.length-1;

        while(i<j)
        {
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;

            i++;
            j--;
        }

        System.out.println(c);
    }
}
