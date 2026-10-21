class Solution {
    public int findCircleNum(int[][] isConnected) {
        return provinces(isConnected);
    }
    int provinces(int[][] g) {
        int n=g.length;
        int ans = 0;
        boolean[] v= new boolean[n];
        for(int i=0;i<n;i++) {
            if(!v[i]) {
                dfs(g,v,i);
                ans++;
            }
        }
        return ans;
    }
    void dfs(int[][] g,boolean[] v,int i) {
        v[i]=true;
        for(int j = 0; j<g.length;j++) {
            if(g[i][j]==1 && !v[j]) {
                dfs(g,v,j);
            }
        }
    }
}