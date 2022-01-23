# 排序数组查找数字I（二分查找，哈希表）
## 1.哈希表
HashMap<Integer,Integer> map=new HashMap<>()
以n遍历数组的数，当n==target时，给哈希表的真值加1.
加入时使用put(map.put(n,map.getOrDefault(n,0)+1);
最后返回对应数字的真值map.getOrDefault(target,0);
## 2.二分查找
设定左边界，右边界，得出中点（向下取整），由于排好序了，所以比较中点和target，确定在哪个区间范围，反复求中点。分别找到左边界和右边界，得到target的数量是
rightt-left-1
