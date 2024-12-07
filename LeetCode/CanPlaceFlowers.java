package LeetCode;

public class CanPlaceFlowers {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;

		for (int i = 0; (i < len && n > 0); i++) {
			if (flowerbed[i] == 1) {
				i++;
				continue;
			} else if (i == len - 1 || flowerbed[i + 1] == 0) {
				flowerbed[i] = 1;
				i++;
				n--;
			} else {
				i += 2;
			}
		}

		return n == 0;
	}

	// else if (i == 0) {
	// if (len == 1) {
	// flowerbed[i] = 1;
	// i++;
	// n--;
	// } else if (flowerbed[i + 1] == 0) {
	// flowerbed[i] = 1;
	// i++;
	// n--;
	// } else {
	// i += 2;
	// }
	// } else if (i == len - 1) {
	// if (flowerbed[i - 1] == 0) {
	// flowerbed[i] = 1;
	// i++;
	// n--;
	// }
	// } else {
	// if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
	// flowerbed[i] = 1;
	// i++;
	// n--;
	// }
	// }
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 0, 1 };
		System.out.println(canPlaceFlowers(nums, 1));
	}
}
