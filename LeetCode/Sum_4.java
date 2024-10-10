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
                            innerlist.add(nums[i]);
                            innerlist.add(nums[j]);
                            innerlist.add(nums[k]);
                            innerlist.add(nums[l]);
                            ans.add(new ArrayList<>(innerlist));
                            innerlist.clear();
                        }
                    }
                }
            }
        }

        for(int i=0; i<ans.size();i++){
            for(int j=i+1; j<ans.get(j).size();j++){
                List<Integer> temp = new ArrayList<>(ans.get(j));
                boolean status = true;

                if();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        System.out.println(fourSum(nums, 0));
    }
}
