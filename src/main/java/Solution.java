import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean circularArrayLoop(int[] nums) {

        Set<Integer> self = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (move(nums, i) == i) {
                self.add(i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            boolean[] visited = new boolean[nums.length];
            if (hasCycle(nums, move(nums, i), self, visited, nums[i] > 0)) {
                return true;
            }
        }

        return false;
    }

    private boolean hasCycle(int[] nums, int i, Set<Integer> self, boolean[] visited, boolean sign) {
        if (self.contains(i) || nums[i] > 0 != sign) {
            return false;
        }
        if (visited[i]) {
            return true;
        }
        visited[i] = true;
        return hasCycle(nums, move(nums, i), self, visited, sign);
    }

    public int move(int[] nums, int i) {
        int index;
        if (nums[i] > 0) {
            index = (i + nums[i]) % nums.length;
        } else {
            index = (i + nums[i] % nums.length + nums.length) % nums.length;
        }
        return index;
    }

}
