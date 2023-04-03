import java.util.*;

public class CountDistinct_Elements {

    public static int count(int arr[]){
        HashSet<Integer> set = new HashSet<>();   //SET 1
     for(int i=0;i<arr.length;i++){
    set.add(arr[i]);
       }
   return set.size();
    }
    public  static void main(String args[]){
        int arr[]={4,3,2,5,6,7,3,4,2,1};

        System.out.println(count(arr));
    }
}
