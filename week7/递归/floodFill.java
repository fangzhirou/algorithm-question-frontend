class Solution {
   int recx[]={-1,0,1,0};//判断上下左右所需的数据
    int recy[]={0,1,0,-1};
    boolean check[][];//用来判断是否渲染过
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int initid=image[sr][sc];//取得初值
        check=new boolean[image.length][image[0].length];
    	dfs(image,sr,sc,newColor,initid);
    	return image;
    }
    
    private void dfs(int[][] image, int sr, int sc, int newColor,int initid) {
        check[sr][sc]=true;
        image[sr][sc]=newColor;
        for(int i=0;i<=3;i++)
        	if(sr+recx[i]>=0&&sr+recx[i]<image.length&&sc+recy[i]>=0&&sc+recy[i]<image[0].length) {//判断上下左右是否能渲染
        		if(image[sr+recx[i]][sc+recy[i]]==initid&&check[sr+recx[i]][sc+recy[i]]==false)//只有在数组范围内，并且没被渲染过才能渲染
        			dfs(image,sr+recx[i],sc+recy[i],newColor,initid);
        		}
        		 
    }

}
