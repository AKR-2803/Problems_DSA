class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, (a, b) -> a.deadline - b.deadline);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            if(arr[i].deadline==pq.size() && pq.peek()<arr[i].profit){
                pq.poll();
                pq.add(arr[i].profit);
            }else if(arr[i].deadline>pq.size()){
                pq.add(arr[i].profit);
            }
        }
        int ans=0;
        int m=pq.size();
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        return new int[]{m, ans};
    }
}