import java.util.ArrayList;
import java.util.List;

public class Sum_4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> innerlist = new ArrayList<>();
        boolean status = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;

                for (int k = 0; k < nums.length; k++) {
                    if (i == k || j == k)
                        continue;

                    for (int l = 0; l < nums.length; l++) {
                        if (i == l || j == l || k == l)
                            continue;

                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {

                            if (status == false) {
                                innerlist.add(nums[i]);
                                innerlist.add(nums[j]);
                                innerlist.add(nums[k]);
                                innerlist.add(nums[l]);
                                ans.add(new ArrayList<>(innerlist));
                                innerlist.clear();
                                status = true;
                                if (i != nums.length - 1)
                                    i++;
                                if (j != nums.length - 1)
                                    j++;
                                if (k != nums.length - 1)
                                    k++;
                                if (l != nums.length - 1)
                                    l++;
                            }

                            for (int m = 0; m < (ans.size()); m++) {
                                System.out.println(ans.get(m));
                                List<Integer> temp = new ArrayList<Integer>(new ArrayList<>(ans.get(m)));
                                // System.out.println(m+" "+n);
                                if (temp.contains(i))
                                    temp.remove((temp.indexOf(i)));
                                if (temp.contains(j))
                                    temp.remove((temp.indexOf(j)));
                                if (temp.contains(k))
                                    temp.remove((temp.indexOf(k)));
                                if (temp.contains(l))
                                    temp.remove((temp.indexOf(l)));

                                if (temp.size() == 0) {
                                    innerlist.add(nums[i]);
                                    innerlist.add(nums[j]);
                                    innerlist.add(nums[k]);
                                    innerlist.add(nums[l]);
                                    ans.add(new ArrayList<>(innerlist));
                                    innerlist.clear();

                                    if (i != nums.length - 1)
                                        i++;
                                    if (j != nums.length - 1)
                                        j++;
                                    if (k != nums.length - 1)
                                        k++;
                                    if (l != nums.length - 1)
                                        l++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        System.out.println(fourSum(nums, 0));
    }
}
