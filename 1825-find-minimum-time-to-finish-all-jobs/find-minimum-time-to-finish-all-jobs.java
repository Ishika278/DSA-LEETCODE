class Solution {
    int ans = Integer.MAX_VALUE;

    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        reverse(jobs);

        int[] workers = new int[k];
        backtrack(jobs, 0, workers);

        return ans;
    }

    private void backtrack(int[] jobs, int idx, int[] workers) {
        if (idx == jobs.length) {
            int max = 0;
            for (int w : workers)
                max = Math.max(max, w);

            ans = Math.min(ans, max);
            return;
        }

        for (int i = 0; i < workers.length; i++) {

            
            if (workers[i] + jobs[idx] >= ans)
                continue;

            workers[i] += jobs[idx];

            backtrack(jobs, idx + 1, workers);

            workers[i] -= jobs[idx];

            
            if (workers[i] == 0)
                break;
        }
    }

    private void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}