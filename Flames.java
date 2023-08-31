import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Flames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name1 = sc.nextLine().toLowerCase();

        System.out.println("Enter your Crush name : ");
        String name2 = sc.nextLine().toLowerCase();

        // Input validation
        if (name1.isEmpty() || name2.isEmpty()) {
            System.out.println("Please enter valid names.");
            return;
        }

        Set<Character> commonChars = new HashSet<>();
        for (char c : name1.toCharArray()) {
            if (name2.indexOf(c) >= 0) {
                commonChars.add(c);
            }
        }

        int commonCount = commonChars.size() * 2;
        int totalChars = name1.length() + name2.length();

        int remainingChars = totalChars - commonCount;

        String flames = "FLAMES";
        int resultIndex = (remainingChars - 1) % flames.length();
        char resultChar = flames.charAt(resultIndex);

        String resultText;
        switch (resultChar) {
            case 'F':
                resultText = "Friends";
                break;
            case 'L':
                resultText = "Lover";
                break;
            case 'A':
                resultText = "Affection";
                break;
            case 'M':
                resultText = "Marriage";
                break;
            case 'E':
                resultText = "Enemy";
                break;
            case 'S':
                resultText = "Siblings";
                break;
            default:
                resultText = "Undefined";
                break;
        }

        System.out.println("Flames Result: " + resultText);
    }
}
