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

    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
        }
        
        ans.add(map.size());
        
        int i = k;
        for(i = k; i < n; i++) {
            if(map.get(A[i - k]) > 1) {
                map.put(A[i - k], map.get(A[i - k]) - 1);
            } else if(map.get(A[i - k]) == 1) {
                map.remove(A[i - k]);
            } 
            
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
            }
            
            ans.add(map.size());
        }
        
        return ans;
    }

    //could use hashset instead of hashmap
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int ele: nums1) {
            if(!map.containsKey(ele)) {
                map.put(ele, false);
            }
        }
        
        for(int ele: nums2) {
            if(map.containsKey(ele)) {
                map.put(ele, true);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        //System.out.println(map.keySet());
        
        int k = 0;
        
        for(int ele: map.keySet()) {
            if(map.get(ele) == true)
                ans.add(ele);
        }
        
        int[] fAns = new int[ans.size()];
        
        for(int ele: ans) {
            fAns[k++] = ele;
        }
        
        return fAns;
        
    }

    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int ele: a) {
            hs.add(ele);
        }
        
        for(int ele: b) {
            hs.add(ele);
        }
        
        return hs.size();
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 1, 2, 7, 8};
        System.out.println(countElements(arr));
    }
}