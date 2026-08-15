import java.util.Arrays;
import java.util.Scanner;
class Assignment_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String cleaned = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean palindrome = cleaned.equals(new StringBuilder(cleaned).reverse().toString());
        String a = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String b = str3.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        boolean anagram = Arrays.equals(x, y);
        boolean valid = cleaned.matches("[a-zA-Z0-9]+");
        boolean contains = str1.toLowerCase().contains("plan");
        String report = String.join(" | ",
                String.format("Palindrome: %b", palindrome),
                String.format("Anagram: %b", anagram));
        String interned1 = str2.intern();
        String interned2 = new String(str2).intern();
        boolean hashEqual = interned1.hashCode() == interned2.hashCode();
        System.out.println("Palindrome Check: \"" + str1 + "\" -> " + palindrome);
        System.out.println("Anagram Check: \"" + str2 + "\" & \"" + str3 + "\" -> " + anagram);
        System.out.println("Formatted Report: [" + report + "]");
        System.out.println("Alphanumeric Validation: " + valid);
        System.out.println("Contains 'plan': " + contains);
        System.out.println("HashCodes equal for interned strings: " + hashEqual);
        sc.close();
    }
}