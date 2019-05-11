package problem_solving.week6;

public class t_12 {
    public static void main(String[] args) {
        String s = "ABCDEDCBA";
        System.out.println(palindrome(s, 0));
    }

    private static boolean palindrome(String s, int i) {
        if ((s.length()-1-i) - i <= 1) {
            if (s.charAt(i) == s.charAt(s.length()-1-i))
                return true;
            else
                return false;
        }
        else if (s.charAt(i) == s.charAt(s.length() - 1 - i))
            return palindrome(s, i + 1);
        else
            return false;
    }
}
