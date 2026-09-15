import java.util.*;

class Solution {
    public ArrayList<Integer> search(String text, String pattern) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                ans.add(i);
            }
        }

        return ans;
    }
}
