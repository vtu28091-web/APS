class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int leftCount = i;
            int rightCount = n - i - 1;

            int leftContribution = nums[i] * leftCount - leftSum;

            int rightSum = totalSum - leftSum - nums[i];
            int rightContribution = rightSum - nums[i] * rightCount;

            result[i] = leftContribution + rightContribution;

            leftSum += nums[i];
        }

        return result;
    }
}