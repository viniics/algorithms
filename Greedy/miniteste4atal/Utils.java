package Greedy.miniteste4atal;

public class Utils {
    public boolean contains(int[] nums, int i) {
        for (int j : nums) {
            if (j == i) {
                return true;
            }
        }
        return false;
    }
}
