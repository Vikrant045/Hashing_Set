import java.util.*;

public class Union_and_InterSection_of2Arrays {
    public  static void main(String args[]){
        int a1[] ={7,3,9};
        int a2 []={6,3,9,2,9,4};
    HashSet<Integer> set = new HashSet<>();   

    // Union
for(int i=0;i<a1.length;i++){
    set.add(a1[i]);
}
for(int i=0;i<a2.length;i++){
    set.add(a2[i]);
}
System.out.println("Union = "+set.size());

// Intersection
int count =0;
set.clear();
for(int i=0;i<a2.length;i++){
    set.add(a2[i]);
}
for(int i=0;i<a1.length;i++){
    if(set.contains(a1[i])){
        count++;
        set.remove(a1[i]);
    }
}
System.out.println("Intersection = "+count);


    }
}
