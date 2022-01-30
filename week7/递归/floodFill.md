# 颜色填充（DFS深度优先搜索)
## 1.判断上下左右所需的数据
分开表示为int recx[]={-1,0,1,0};int recy[]={0,1,0,-1};
## 2.设定一个二维数组
判断该点是否已经遍历过，大小设定为[image.length][image[0].length]，这是一个类型为boolean的数组，然后递归调用dfs
## 3.dfs(int[][] image, int sr, int sc, int newColor,int initid)，
输入图像，初始点，新颜色，初始点初值。先给初始点初值处的check赋值true，再令该点颜色为新颜色，接下来遍历上下左右的位置。
if（sr+recx[i]>=0&&sr+recx[i]<image.length&&sc+recy[i]>=0&&sc+recy[i]<image[0].length）
然后再加个判定，只有当此时，即image[sr+recx[i]][sc+recy[i]]为初始值，该点在检查数组中显示为false才可以递归调用dfs来赋值
