// Find k most frequent element in array..
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b)-map.get(a);
            }
        });
        for(int i:map.keySet()){
            q.add(i);
        }
        for(int j=0;j<k;j++){
            ans[j]= q.remove();
        }
        return ans;
    }
}