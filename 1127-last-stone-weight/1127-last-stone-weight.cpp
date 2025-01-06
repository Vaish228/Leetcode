class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> q(stones.begin(),stones.end());
       
        while(q.size()>1)
        { 
        int a = q.top();
        q.pop();
        int b = q.top();
        q.pop();
        int c = a-b;
        // t-=c;
        // q.push(c);
        // ti=t;
        if(a!=b)
           q.push(c);
        }

       if(q.size()>0)
           return q.top();    
       else
           return 0;
    }
};