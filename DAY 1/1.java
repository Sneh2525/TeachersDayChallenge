class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {12, 345, 2, 6, 7896};
        System.out.println("Input: {12, 345, 2, 6, 7896}");
        System.out.println("Output: " + sol.findNumbers(nums1));

        System.out.println("--------------------");

        int[] nums2 = {555, 901, 482, 1771};
        System.out.println("Input: {555, 901, 482, 1771}");
        System.out.println("Output: " + sol.findNumbers(nums2));
    }
}