class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) 
    {
        vector<int> ret;
        unordered_map<string, int> hash1;   //hash1存放words中的字符串和其个数
        for(auto s : words) ++hash1[s];

        int n = words.size(), len = words[0].size(); //n是words中字符串的个数，len是字符串的长度
        for(int i = 0; i < len; i++)
        {
            unordered_map<string, int> hash2;   //hash2存放窗口中的字符串和其个数
            for(int left = i, right = i, count = 0; right + len <= s.size();right += len)
            {
                string in = s.substr(right,len);
                hash2[in]++;    //进窗口
                if(hash1.count(in) && hash2[in] <= hash1[in] ) ++count;    
                //出窗口
                if(right - left + 1 > len*n)
                {
                    string out = s.substr(left,len);
                    if(hash1.count(out) && hash2[out] <= hash1[out])    --count;
                    hash2[out]--;
                    left += len;
                }
                if(count == n) ret.push_back(left);
            }
        }
        return ret;

    }
};