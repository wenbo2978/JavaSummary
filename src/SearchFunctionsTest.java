public class SearchFunctionsTest {


    public static int lowerBound(int[] nums, int target){
        int st = 0, ed = nums.length - 1;
        while(ed > st){
            int m = st + (ed - st) / 2;
            if(nums[m] >= target){
                ed = m;
            }else{
                st = m + 1;
            }
        }
        return ed;
    }

    public static int upperBound(int[] nums, int target){
        int st = 0, ed = nums.length - 1;
        while(ed > st){
            int m = st + (ed - st) / 2;
            if(nums[m] > target){
                ed = m;
            }else{
                st = m + 1;
            }
        }
        return ed;
    }

    public static void main(String[] args){
        int[] nums = new int[20];
        for(int i = 0; i < 20; i ++){
            nums[i] = i * 2 + 3;
        }
        for(int i = 0; i < 20; i ++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        int target = 31;
        System.out.println("target is " + target + ", lower_bound");
        int index = lowerBound(nums, target);
        System.out.println("index: " + index + ", value: " + nums[index]);
        System.out.println("upper_bound");
        int index2 = upperBound(nums, target);
        System.out.println("index: " + index2 + ", value: " + nums[index2]);
    }
}
