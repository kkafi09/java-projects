import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 9;
        System.out.println(Arrays.toString(twoSumAl(arr, target)));
    }

    public static int[] twoSumAl(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{complement, arr[i]};
            }
            map.put(arr[i],i);
        }
        throw new IllegalArgumentException("error tolol");
    }

    
}
