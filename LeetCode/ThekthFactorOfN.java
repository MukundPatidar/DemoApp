package LeetCode;

public class ThekthFactorOfN {
	public static int kthFactor(int n, int k) {
        int ans = -1;
		int count = 1;

		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				if(count == k){
					return i;
				}
				count++;
			}
		}

		return ans;
    }
	public static void main(String[] args) {
		System.out.println(kthFactor(12, 3));//3
		System.out.println(kthFactor(7, 2));//7
		System.out.println(kthFactor(4, 4));//-1
	}
}