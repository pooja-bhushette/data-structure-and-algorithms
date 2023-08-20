package arrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        System.out.println("Product of array except self = " + Arrays.toString(productExceptSelf.productOfArray(nums)));
    }

    private int[] productOfArray(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        int productOfAllBeforeCurrent = 1;
        int productOfAllAfterCurrent = 1;
        for (int i = 0; i < n; i++) {
            res[i] = productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *= nums[i];
        }
        for (int i = n-1; i >= 0; i--) {
            res[i] *= productOfAllAfterCurrent;
            productOfAllAfterCurrent *= nums[i];
        }
        return res;
    }
}
