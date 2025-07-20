package Deutsche;

import java.util.ArrayList;

public class Unique_Character {
    public static void main(String[] args) {

//*************************************** one way ******************************************************************
//        String name = "sacchhinnn";
//        char[] c = name.toCharArray();
//
//        Set<Character> unique = new HashSet<>();
//
//        for(char d  : c){
//            unique.add(d);   //here we are adding one by one character to the Set but doesn't allow duplicate value
//        }
//        System.out.print(unique);

//****************************************** Another Way ***********************************************************

        String nm = "Maalkkheeeeede";
        String unique = "";
        char[] c = nm.toCharArray();

        ArrayList<String> a = new ArrayList();
       // a.add(String.valueOf(c[0]));

        int i,j,len=c.length-1;

        for(char d :c){
            if(!a.contains(String.valueOf(d))){
                a.add(String.valueOf(d));
            }
        }
        System.out.print(a);




    }
}
