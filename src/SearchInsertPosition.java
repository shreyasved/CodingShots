public class SearchInsertPosition {

    public int getPosition(int[] nums, int target){
        int l = 0, r = nums.length - 1, m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
        if (nums[m] > target)
            return m;
        else
            return m + 1;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(sip.getPosition(nums,target));
    }

}
