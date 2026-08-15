import java.util.Arrays;

public class Assignment_Q4 {

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static boolean isAnagram(String str1, String str2) {
        String c1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String c2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (c1.length() != c2.length()) return false;

        char[] arr1 = c1.toCharArray();
        char[] arr2 = c2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = " A man a plan a canal Panama ";
        String str2 = "listen";
        String str3 = "silent";

        boolean palindromeRes = isPalindrome(str1);
        boolean anagramRes = isAnagram(str2, str3);

        String cleanedStr1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        boolean isAlphanumeric = cleanedStr1.matches("^[a-zA-Z0-9]+$");

        boolean containsPlan = str1.toLowerCase().contains("plan");

        String s1 = new String("Java");
        String s2 = s1.intern();
        String s3 = "Java";
        boolean hashCodesEqual = (s2.hashCode() == s3.hashCode()) && (s2 == s3);

        String line1 = String.format("Palindrome Check : \"%s\" -> %b", str1.trim(), palindromeRes);
        String line2 = String.format("Anagram Check    : \"%s\" & \"%s\" -> %b", str2, str3, anagramRes);
        String line3 = String.format("Alphanumeric Check: \"%s\" -> %b", cleanedStr1, isAlphanumeric);
        String line4 = String.format("Contains 'plan'  : %b", containsPlan);
        String line5 = String.format("HashCodes equal for interned strings : %b", hashCodesEqual);
        String line6 = String.format("Formatted Report : [ Palindrome : %b | Anagram : %b ]", palindromeRes, anagramRes);

        String fullReport = String.join("\n", line1, line2, line3, line4, line5, line6);
        System.out.println(fullReport);
    }
}