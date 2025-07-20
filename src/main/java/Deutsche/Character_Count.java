package Deutsche;

import java.util.ArrayList;

public class Character_Count {
    public static void main(String[] args) {
        String input = "programming";
        input = input.toLowerCase(); // optional for case-insensitive

        ArrayList<Character> arr = new ArrayList<>();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (!arr.contains(currentChar)) {
                int count = 1;

                // Count occurrences of currentChar
                for (int j = i + 1; j < input.length(); j++) {

                    if (input.charAt(j) == currentChar) {
                        count++;
                    }
                }

                // Print and mark as visited
                System.out.println(currentChar + " → " + count);
                arr.add(currentChar);
            }
        }
    }
}
