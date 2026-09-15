import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']--;

            if (i >= p.length()) {
                count[s.charAt(i - p.length()) - 'a']++;
            }

            if (i >= p.length() - 1 && allZero(count)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }

    public boolean allZero(int[] count) {
        for (int x : count) {
            if (x != 0)
                return false;
        }
        return true;
    }
}
