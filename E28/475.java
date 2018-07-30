class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0;
        int j = 0;
        int res = 0;
        while(i<houses.length){
            while(j<heaters.length-1&&Math.abs(houses[i]-heaters[j+1])<=Math.abs(houses[i]-heaters[j])){
                j++;
            }
            res = Math.max(res,Math.abs(houses[i]-heaters[j]));
            i++;
        }
        return res;
    }
}