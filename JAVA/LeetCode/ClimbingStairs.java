package LeetCode;

import java.util.*;

public class ClimbingStairs {
    static HashMap<Integer, Integer> fofx = new HashMap<>();

    public int climbStairs(int n) {
        // f(n) = f(n-1) + f(n-2)
        return fof(n);
    }

    public static int fof(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int n1 = n - 1;
            int n2 = n - 2;
            int ans1 = 0;
            int ans2 = 0;
            if (fofx.containsKey(n1)) {
                ans1 += fofx.get(n1);
            } else {
                ans1 = fof(n1);
                fofx.put(n1, ans1);
            }
            if (fofx.containsKey(n2)) {
                ans2 += fofx.get(n2);
            } else {
                ans2 = fof(n2);
                fofx.put(n2, ans2);
            }
            return ans1 + ans2;
        }
    }
}
