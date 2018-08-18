class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orig = image[sr][sc];
        if(orig == newColor)return image;
        dfs(image,sr,sc,newColor,orig);
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int newColor,int orig){
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=orig)
            return;
        image[sr][sc]=newColor;
        dfs(image,sr+1,sc,newColor,orig);
        dfs(image,sr-1,sc,newColor,orig);
        dfs(image,sr,sc+1,newColor,orig);
        dfs(image,sr,sc-1,newColor,orig);
    }
}