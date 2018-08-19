class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(String s:words){
            if(map.get(s)==null){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        PriorityQueue<Map.Entry<String,Integer>> maxHeap = new PriorityQueue<>(k, (a,b) -> 
            a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue()); 
        // if same frequency, then sort alphabetical .  
        
        for (Map.Entry<String,Integer> entry : map.entrySet() ) maxHeap.add(entry);
        while (res.size() < k) res.add(maxHeap.poll().getKey());  //add top k
        return res;
        
    }
}