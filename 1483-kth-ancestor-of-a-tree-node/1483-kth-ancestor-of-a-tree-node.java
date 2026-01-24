class TreeAncestor {
    int maxLog;
    int[][] up ;
    public TreeAncestor(int n, int[] parent) {
        maxLog = (int)(Math.log(n)/Math.log(2))+1;
        up = new int[n][maxLog];
        for(int i = 0; i < n; i++){
            up[i][0] = parent[i];
        }
        for(int j = 1; j < maxLog ; j++){
            for(int i = 0; i < n; i++){
                int node = up[i][j-1];
                if(node == -1){
                    up[i][j] = -1;
                }else{
                    up[i][j] = up[node][j-1];
                }
            }
        }
    }
    
    public int getKthAncestor(int node, int k) {
        for(int  i = 0; i < maxLog; i++){
            if((k & (1 << i)) != 0){
                node = up[node][i];
            }
            if(node == -1) return -1;
        }
        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */