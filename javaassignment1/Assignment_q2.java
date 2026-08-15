import java.util.Scanner;
class Assignment_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int count = words.length;
        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String lastWord = sentence.substring(sentence.lastIndexOf(" ") + 1);
        int firstIndex = sentence.indexOf('J');
        int lastIndex = sentence.lastIndexOf('J');
        int comparison = firstWord.compareTo(lastWord);
        char[] chars = sentence.toCharArray();
        int ascii = chars[0];
        System.out.println("Word Count: " + count);
        System.out.println("First Word: " + firstWord);
        System.out.println("Last Word: " + lastWord);
        System.out.println("First 'J' index: " + firstIndex);
        System.out.println("Last 'J' index: " + lastIndex);
        System.out.println("Comparison (first vs last word): " + comparison);
        System.out.println("First character ASCII value: " + ascii);
        sc.close();
    }
}