public class ArrayConstructionProblem {

    public int f_val_AfterOper(String[] op) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (op[i].equals("++X") || op[i].equals("X++"))
                x++;
            else
                x--;
        }

        return x;
    }

    public int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            ans[i] = arr[arr[i]];

        return ans;
    }

    public int[] getConcat(int[] num) {
        int[] ans = new int[num.length * 2];
        for (int i = 0; i < num.length; i++) {
            ans[i] = nums[i];
            ans[i + num.length] = num[i];
        }
        return ans;
    }

  public int[] runSum(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
        arr[i] += temp;
        temp = arr[i];
    }

    return arr;
}
