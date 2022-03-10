import java.util.*;

public class hashmap {

    // ques 1 hashmap sahil sheet
    public static HashMap countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int ele: arr) {
            if(!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }

        return map;
    }

    


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 1, 2, 7, 8};
        System.out.println(countElements(arr));
    }
}