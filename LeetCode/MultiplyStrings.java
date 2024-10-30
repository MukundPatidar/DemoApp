package LeetCode;

import java.math.BigInteger;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        BigInteger nums1 = new BigInteger(num1);
        BigInteger nums2 = new BigInteger(num2);
        BigInteger nums3 = nums1.multiply(nums2);

        String ans = nums3.toString();
        return ans;
    }
}
