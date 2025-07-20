package Deutsche;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {

        String name = "Saachiiiiinn";

        ArrayList<Character> arr = new ArrayList<>();

        int i, j, len = name.length();

        for (i = 0; i < len; i++) {

            char currentChar = name.charAt(i);

            if (!arr.contains(currentChar)) {
                int count = 1;

                for (j = i + 1; j < len; j++) {

                    if(name.charAt(j)==currentChar){
                        count++;
                    }
                }
                System.out.println(currentChar + " character count is -> "+ count);
                arr.add(currentChar);
            }

        }
    }
}