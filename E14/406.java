class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0]==b[0]?a[1]-b[1]:b[0]-a[0];
            }
        });
        List<int[]> res = new LinkedList<>();
        for(int[] c:people){
            res.add(c[1],c);
        }
        return res.toArray(new int[people.length][]);
    }
}