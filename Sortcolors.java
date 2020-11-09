class Sortcolors
{
    public int Sort(int [] nums)
    {
        int low=0,mid=0,temp;
        int high = nums.length-1;
        while(mid <=high)
        {
            switch(nums[mid])
            {
                case 0:
                    temp = nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    high--;
                    break;
            }
        }
        
    }
    public static void main(String[] args)
    {
        Sortcolors repeat = new Sortcolors();
        int[] arr = {0,0,2,1,0,2,1,1,2,0,0,2,1};
        System.out.println(repeat.Sort(arr));
        
    }
}


