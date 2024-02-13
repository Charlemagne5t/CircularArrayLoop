import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = {2, -1, 1, 2, 2};
        boolean expected = true;
        boolean actual = new Solution().circularArrayLoop(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        int[] nums = {-1, -2, -3, -4, -5, 6};
        boolean expected = false;
        boolean actual = new Solution().circularArrayLoop(nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int[] nums = {1, -1, 5, 1, 4};
        boolean expected = true;
        boolean actual = new Solution().circularArrayLoop(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4() {
        int[] nums = {-2, 1, -1, -2, -2};
        boolean expected = false;
        boolean actual = new Solution().circularArrayLoop(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5() {
        int[] nums = {-2, -3, -9};
        boolean expected = false;
        boolean actual = new Solution().circularArrayLoop(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void moveTest1() {
        int[] nums = {-1,-2,-3,-4,-5,6};
        int expected = 5;
        int actual = new Solution().move(nums, 0);

        Assert.assertEquals(expected, actual);
    }
}
