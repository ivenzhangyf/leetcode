class Solution {
    public int[] colPos;
    public int[] rowFlag;
    public int[] upDiagFlag;
    public int[] downDiagFlag;
    
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        colPos=new int[n];
        rowFlag=new int[n];
        upDiagFlag=new int[2*n-1];
        downDiagFlag=new int[2*n-1];
        for(int i =0;i<n;i++)rowFlag[i] = 1;
        for(int i =0;i<2*n-1;i++){
            upDiagFlag[i] = 1;
            downDiagFlag[i]=1;
        }
        return Try(0,n,res,colPos,rowFlag,upDiagFlag,downDiagFlag);
       
    }
    public List<List<String>> Try(int i,int n,List<List<String>> res,int[] colPos,int[] rowFlag,int[] upDiagFlag,int[] downDiagFlag){
        int j;
        char in;
        
        for(j=0;j<n;j++){
            if(rowFlag[j]==1&&upDiagFlag[i+j]==1&&downDiagFlag[i-j+n-1]==1){
                colPos[i]=j;
                rowFlag[j]=0;
                upDiagFlag[i+j]=0;
                downDiagFlag[i-j+n-1]=0;
                if(i<n-1)Try(i+1,n,res,colPos,rowFlag,upDiagFlag,downDiagFlag);
                else{
                    res.add(convert(n,colPos));
                    
                }
                rowFlag[j]=upDiagFlag[i+j]=downDiagFlag[i-j+n-1]=1;
            }
            
        }
        return res;
    }
    public List<String> convert(int n,int[] colPos){
        char[][] table = new char[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==colPos[i])
                    table[i][j]='Q';
                else
                    table[i][j]='.';
            }
        }
        List<String> ret = new ArrayList<>(table.length);
        for (int i = 0; i < table.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < table[0].length; j++) {
                sb.append(table[i][j]);
            }
            ret.add(sb.toString());
        }
        return ret;
    }
}