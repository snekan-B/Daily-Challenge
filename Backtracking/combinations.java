class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int i = 0;
        int arr[] = new int[n];
        for (int j = 1; j <= n; j++) {
            arr[j - 1] = j;
        }
        List<Integer> a = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        comb(arr, i, k, a, ans);
        return ans;
    }

    public static void comb(int arr[], int ind, int k, List<Integer> a, List<List<Integer>> ans) {
        if (ind == arr.length) {
            if (a.size() == k)
                ans.add(new ArrayList<>(a));

            return;
        }

        a.add(arr[ind]);
        comb(arr, ind + 1, k, a, ans);
        a.remove(a.size() - 1);
        comb(arr, ind + 1, k, a, ans);
    }
}