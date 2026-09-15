import java.util.*;

class Solution {

    public static int marsExploration(String s) {
        String sos = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(marsExploration(s));
    }
}
