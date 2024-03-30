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
