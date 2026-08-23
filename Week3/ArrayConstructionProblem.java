public class ArrayConstructionProblem {

    public int f_val_AfterOper(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++"))
                x++;
            else
                x--;
        }

        return x;
    }

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            ans[i] = nums[nums[i]];

        return ans;
    }

    public int[] getConcat(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
    }

    public int[] runSum(int[] nums) {
        int[] ans = new int[nums.length];

        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++)
            ans[i] = ans[i - 1] + nums[i];

        return ans;
    }
}
