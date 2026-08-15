import java.util.Scanner;
class Assignment_Q1 {
    public static String process(String input) {
        String str = input.trim();
        if (str.isEmpty())
            return "EMPTY_STRING";
        if (str.equalsIgnoreCase("admin"))
            return "RESERVED_WORD";
        str = str.replace("_", " ");
        String lower = str.toLowerCase();
        if (lower.startsWith("temp") && lower.endsWith("user"))
            str = str.concat("_FLAGGED");
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(process(input));
        sc.close();
    }
}