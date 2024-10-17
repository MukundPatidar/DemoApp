package LeetCode;

public class Candy {
    public static int hcandy(int[] ratings) {
        int n = ratings.length;
        int ans = n;
        int left, rigth;
        int candy[] = new int[n];

        for (int i = 0; i < n; i++) {
            left = Math.max(0, i - 1);
            rigth = Math.min(n - 1, i + 1);

            if (ratings[left] < ratings[i]) {
                candy[i] = candy[left] + 1;
            }
            if (ratings[rigth] < ratings[i]) {
                if (candy[rigth] < candy[i])
                    continue;

                candy[i] = candy[rigth] + 1;

                if (ratings[left] > ratings[i] && candy[left] <= candy[i])
                    i = Math.max(0, i - 2);
            }
        }

        for (int i : candy) {
            ans += i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,1,4,3,3};
        System.out.println(hcandy(arr));
    }
}
