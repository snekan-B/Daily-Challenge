class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        perm(arr, nums, list);
        return list;
    }

    public void perm(List<Integer> arr, int nums[], List<List<Integer>> list) {
        if (nums.length == arr.size()) {
            list.add(new ArrayList<>(arr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i]) == true)
                continue;

            arr.add(nums[i]);
            perm(arr, nums, list);
            arr.remove(arr.size() - 1);
        }
    }
}