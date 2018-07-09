class Solution {
    
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                int[][] visited=new int[board.length][board[0].length];
                if(dfs(board,words,visited,i,j,0)) return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board,char[] words,int[][] visited,int x,int y,int index){
        
        if (x<0||y<0||x==board.length||y==board[0].length||visited[x][y]==1) return false;
        if (board[x][y]==words[index]&&index==words.length-1)return true;
        if (board[x][y]!=words[index])return false;
        visited[x][y]=1;
        if (dfs(board,words,visited,x,y+1,index+1)||dfs(board,words,visited,x,y-1,index+1)||dfs(board,words,visited,x+1,y,index+1)||dfs(board,words,visited,x-1,y,index+1)) 
            return true;
        visited[x][y]=0;
        return false;
    }
    
}