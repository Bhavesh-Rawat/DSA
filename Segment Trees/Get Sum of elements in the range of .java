class NumArray
{
    public:
    int n;
    vector<int> segmentTree;
    NumArray(vector<int> &nums)
    {

        n = nums.size();
        segmentTree.resize(4*n, 0);

        buildSegTree(0, n - 1, 0, nums);
    }

    void buildSegTree(int start, int end, int currIdx, vector<int> &arr)
    {

        if (start > end)
            return;

        if (start == end)
        {
            segmentTree[currIdx] = arr[start];
            return;
        }

        int mid = start + ((end - start) / 2);

        buildSegTree(start, mid, currIdx *2 + 1, arr);
        buildSegTree(mid + 1, end, currIdx *2 + 2, arr);

        segmentTree[currIdx] = segmentTree[currIdx *2 + 1] + segmentTree[currIdx *2 + 2];
        return;
    }

    void updateHelper(int start, int end, int currIdx, int &index, int &val)
    {

        if (start > end)
            return;

        if (start == end)
        {
            if (start == index)
                segmentTree[currIdx] = val;

            return;
        }

        int mid = start + ((end - start) / 2);

        if (index <= mid)
            updateHelper(start, mid, currIdx *2 + 1, index, val);

        else
            updateHelper(mid + 1, end, currIdx *2 + 2, index, val);

        segmentTree[currIdx] = segmentTree[currIdx *2 + 1] + segmentTree[currIdx *2 + 2];
        return;
    }

    int getSum(int start, int end, int currIdx, int left, int right)
    {

        if (start > end or start > right or end < left)
            return 0;

        if (start >= left and end <= right)
            return segmentTree[currIdx];

        int mid = start + ((end - start) / 2);

        return getSum(start, mid, currIdx *2 + 1, left, right) +
            getSum(mid + 1, end, currIdx *2 + 2, left, right);
    }

    void update(int index, int val)
    {
        updateHelper(0, n - 1, 0, index, val);
        return ;
    }

    int sumRange(int left, int right)
    {
        //return 0;
       return getSum(0, n - 1, 0, left, right); 
    }
};

/**
 *Your NumArray object will be instantiated and called as such:
 *NumArray* obj = new NumArray(nums);
 *obj->update(index,val);
 *int param_2 = obj->sumRange(left,right);
 */