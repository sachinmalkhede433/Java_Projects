package Deutsche;

public class Uppercase_Lowercase {
    public static void main(String[] args) {

        String input = "saCHiN";
        String toggle="";

        for(int i=0; i<input.length(); i++){

            char ch = input.charAt(i);

            if(ch>='A' && ch<='Z'){
                toggle+= (char) (ch + 32);
            }else if(ch>='a' && ch<= 'z'){
                toggle+= (char)(ch-32);
            }else{
                toggle+=  ch;
            }
        }
System.out.println(input + " Converted into " + toggle);
    }

}

