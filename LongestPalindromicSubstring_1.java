package Problems;

public class LongestPalindromicSubstring_1 {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     // Check for odd-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Check for even-length palindromes
            System.out.println(len1+" "+len2);
            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
              start = i - (maxLength - 1) / 2;
                System.out.println(start);
                end = i + maxLength / 2;
                System.out.println(end);
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "abcabad";
        String longestPalindrome = longestPalindrome(input);
        System.out.println("Longest palindromic substring: " + longestPalindrome);
    }
}