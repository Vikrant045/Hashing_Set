import java.util.*;
public class Types_Sets{
    public  static void main(String args[]){

        HashSet<Integer> hset = new HashSet<>();   //SET 1
        hset.add(5);
        hset.add(6);
        hset.add(9);
            hset.add(1);

           /*  Iterator itr = hset.iterator();   // BY USING ITERATOR
            while(itr.hasNext()){
System.out.println(itr.next());
            }

            for(Integer i : hset){    // FOR EACH LOOP
                System.out.println(i);
            }*/

            System.out.println(hset);
            LinkedHashSet <Integer>lhs = new LinkedHashSet<>(); // SET 2
            lhs.add(5);
            lhs.add(6);
            lhs.add(9);
            lhs.add(1);
            System.out.println(lhs);
            
TreeSet<Integer> ts = new TreeSet<>();
             ts.add(5);
             ts.add(6);
             ts.add(9);
             ts.add(1);
             System.out.println(ts);


    }
}