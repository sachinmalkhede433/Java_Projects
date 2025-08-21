package Practice;

public class Reverse_String_StringMethod {

    public static void main(String[] args) {

        String name = "SachiN";

        int i, j;
        String temp = "";

        for(j=name.length()-1; j>=0; j--)
        {
            temp += name.charAt(j);
        }
        System.out.println(temp);

    }
}
