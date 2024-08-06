class Solution {
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Sort jobs based on profit in descending order
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        
        int maxDeadline = 0;
        for (Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        
        boolean[] slots = new boolean[maxDeadline + 1];
        int jobsDone = 0, profit = 0;
        
        for (Job job : arr) {
            for (int i = job.deadline; i > 0; i--) {
                if (!slots[i]) {
                    slots[i] = true;
                    jobsDone++;
                    profit += job.profit;
                    break;
                }
            }
        }
        
        return new int[]{jobsDone, profit};
    }
}