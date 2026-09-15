import java.util.*;

class Solution {

    static int longestPalindrome(String s) {
        int max = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int l = i, r = i;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                max = Math.max(max, r - l + 1);
                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                max = Math.max(max, r - l + 1);
                l--;
                r++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < n; i++) {

            // Create rotation
            String rotated = s.substring(i) + s.substring(0, i);

            System.out.println(longestPalindrome(rotated));
        }
    }
}
