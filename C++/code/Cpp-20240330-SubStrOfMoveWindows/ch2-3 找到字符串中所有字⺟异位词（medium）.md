# 找到字符串中所有字⺟异位词（medium）

**题目链接**：[438. 找到字符串中所有字母异位词 - 力扣（LeetCode）](https://leetcode.cn/problems/find-all-anagrams-in-a-string/)

**题目描述**：
>给定两个字符串 `s` 和 `p`，找到 `s` 中所有 `p` 的 **异位词** 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
## 解法一
判断两个字符串是否为“异位词”


📖**流程描述**：
- 定义
	- 返回值为一个数组，存放起始索引
	- 建立`hash1[26]`和`hash2[26]`分别存放p和窗口中的字符
	- 定义`right`和`left`指针来形成窗口，`count`来表示窗口和p中相同的字符
- 操作
	- 先将p中的字符放入`hash1`中
	- 滑动窗口
		- <mark style="background: #ADCCFFA6;">进窗口</mark> in
			- 如果该字符小于等于hash1中的数量，则count++;
		- <mark style="background: #ADCCFFA6;">出窗口</mark> out
			- hash2中该字符出窗口后小于等于hash1，则count--；
		- <mark style="background: #ADCCFFA6;">判断</mark>
			- 如果count等于字符串p的长度，则是异位词，将起始下标left放入ret中


⌨️**代码实现：**
```c++
class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> ret;    //异位词的起始索引数组
        int hash1[26]={0}; //hash1统计p中字符串，及有效字符
        int hash2[26]={0}; //hash2统计窗口中的字符个数
       
        for(auto e : p) ++hash1[e - 'a'];   
        
        for(int right = 0, left = 0, count = 0; right < s.size(); right++) //count是有效字符的个数
        {
            char in = s[right];
            //进窗口
            if(++hash2[in - 'a'] <= hash1[in - 'a']) ++count;
            if(right - left + 1 > p.size())
            {
                char out = s[left++];
                if(hash2[out - 'a']-- <= hash1[out - 'a']) --count;
            }
            if(count == p.size()) ret.push_back(left);
        }
        return ret;
    }
};
```