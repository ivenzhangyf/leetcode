class Solution {
    public boolean isBipartite(int[][] graph) {
        //BFS
        //1 white
        //2 black
        int[] visited = new int[graph.length];
        for(int i = 0;i<graph.length;i++){
            if(graph[i].length!=0&&visited[i] == 0){
                visited[i] = 1;
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                while(!queue.isEmpty()){
                    int q = queue.poll();
                    for(int c:graph[q]){
                        if(visited[c]==0){
                            visited[c] = visited[q]==1?2:1;
                            queue.offer(c);
                        }else{
                            if(visited[c]==visited[q])
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}