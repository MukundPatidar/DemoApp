package LeetCode;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        // int nums[] ={3,2,3};

        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], (hm.get(nums[i]) + 1));
            } else {
                hm.put(nums[i], 1);
            }
        }
        int temp = 0;
        for (int i : hm.keySet()) {
            if(temp < hm.get(i)){
                ans = i;
                temp = hm.get(i);
            }
        }

        System.out.println(ans);
    }
}
