package Week3.day1;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        String companyName = "google";

        // Create a Set to store unique characters
        Set<Character> uniqueChars = new LinkedHashSet<>();

        // Iterate through each character in the companyName string
        for (int i = 0; i < companyName.length(); i++) {
            char ch = companyName.charAt(i);
            // Add each character into the Set
            uniqueChars.add(ch);
        }

        // Print the unique characters from the string
        System.out.println("Unique characters in the string: " + uniqueChars);
    }
}