import java.util.*;

public class Sum_3II {
	public static int threeSumClosest(int[] nums, int target) {
		 // Sort the array
		 Arrays.sort(nums);

		 int closestSum = nums[0] + nums[1] + nums[2];  // Initialize with the first three numbers
 
		 for (int i = 0; i < nums.length - 2; i++) {
			 int left = i + 1;
			 int right = nums.length - 1;
 
			 while (left < right) {
				 int sum = nums[i] + nums[left] + nums[right];
 
				 // If the exact target sum is found, return it immediately
				 if (sum == target) {
					 return sum;
				 }
 
				 // Update closestSum if this sum is closer to the target
				 if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
					 closestSum = sum;
				 }
 
				 // Adjust the pointers based on the comparison with the target
				 if (sum < target) {
					 left++;  // Move the left pointer to increase the sum
				 } else {
					 right--;  // Move the right pointer to decrease the sum
				 }
			 }
		 }
 
		 return closestSum;
	}

	public static void main(String[] args) {
		int arr[] = { -909, -77, 561, 446, 697, -501, -187, -675, -847, -109, 435, 311, -945, -901, 402, -348, 145,
				-809, -806, -770, 316, 51, 157, -512, 748, -382, -650, -556, 903, 595, -119, 581, -68, 336, -246, 189,
				-705, -709, -768, -836, -615, 348, -487, 94, -358, -961, 601, -74, 715, 947, -289, 544, -678, -917, 128,
				-764, -680, 757, 390, -651, -647, 97, -819, 239, -827, -853, 558, 67, -83, 541, -637, 300, -525, -745,
				-97, -562, 638, -725, 565, -367, -10, 902, -266, -41, -500, -941, 285, 57, 700, 755, 515, 604, 111,
				-988, 100, 994, 997, -388, -195, 942, 194, 70, -609, -247, -449, -876, 264, -665, -239, 688, 998, 879,
				801, 576, 630, 802, 434, 618, -654, 120, 522, -273, -64, -312, -679, 108, -920, 294, 542, -758, 162,
				-490, 414, -918, -207, -748, 814, -598, 370, 825, 587, -338, -574, 633, -267, 725, 991, -628, 782, 422,
				-979, -363, 666, 914, -939, -614, 398, 246, -508, -80, 741, 719, 833, 430, -474, -794, -116, -626, 10,
				-270, -30, -359, 385, 76, -642, -632, 965, 539, 222, 717, 45, 232, 55, -378, -701, 648, 147, -519, 312,
				-533, -43, -32, -557, -962, 328, 559, 283, 310, -978, -731, 363, 458, -488, 439, 167, -233, 828, -908,
				-582, -400, 494, -773, -278, 662, -141, 250, -75, -360, 776, -70, 735, -148, -616, 247, 479, -96, -17,
				984, 911, 235, -305, 432, -111, -543, -171, -21, -180, 742, -428, -896, 824, -635, -597, -335, -404,
				117, 176, 791, -204, 173, 778, 590, -383, -992, 663, -539, 457, -110, 611, -114, 477, 690, 582, -136,
				607, -612, 413, 211, 428, 260, -282, -168, -441, 554, 865, -516, 675, -19, 960, -870, -890, -682, 562,
				276, -124, 628, 894, 323, -681, -215, 672, 371, 12, -795, 670, -884, 509, 273, -14, 131, 259, -977, 357,
				392, -766, -430, 652, 849, 139, -243, 453, 0, 637, -63, 22, -759, -930, 626, -607, -741, -142, 124,
				-332, -747, -392, 583, 622, -951, -324, -210, -137, -414, -133, 181, 933, -518, -461, -27, 115, 956,
				-572, -362, -366, -816, 172, -427, -702, -767, -683, -283, -406, 841, 275, -703, 834, -625, -639, -353,
				831, 59, -687, -494, -188, -943, -724, -560, -160, 302, 358, 308, -958, 501, 768, -842, -732, -482,
				-968, -509, -477, -866, -746, 754, -303, 603, 507, -568, 535, -104, 634, 817, 5, 954, 835, 655, -98,
				317, 948, -622, -478, -73, 466, 571, 523, 537, 681, -285, 970, 579, 765, -785, 350, 229, 606, -821,
				-339, -420, 963, 403, 976, -310, 166, 251, 152, 764, -996, -341, -649, 726, -985, -835, -696, -330,
				-145, -852, 929, 749, 838, 574, 650, 270, -377, -660, 187, 121, 326, -925, 524, -157, -369, 878, -181,
				685, -386, -498, -106, -904, -235, -860, 588, 496, -563, 146, 104, 981, 927, -492, -989, -384, -818,
				-123, 256, 331, -640, -5, 901, -881, 868, -244, 585, 14, -762, 188, 440, 797, 940, -425, 489, 443, -129,
				-24, -737, 683, 340, 621, 511, 709, -645, -824, 126, -291 };
		System.out.println(threeSumClosest(arr, -8996));// -2977
	}
}