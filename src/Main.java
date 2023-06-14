import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();

        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;

        int[] temp = tt.shuffle(nums, n);
        for (int val : temp) System.out.print(val + " "); // 1 4 2 3 3 2 4 1
    }
}