import java.util.*;

public class Itinerary_From_Tickets {

    public static String startOfJourney(HashMap<String,String> map){
        HashMap<String,String> map2 = new HashMap<>();

        for(String key :map.keySet()){
      map2.put(map.get(key),key);
        }
        for(String key :map.keySet()){
            if(!map2.containsKey(key) ){
              return key;
            }
        }
        return null;

    }
    public  static void main(String args[]){

        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bangluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
     String start = startOfJourney(map);
     System.out.print(start+"");
       for(String key: map.keySet()){
           
            System.out.print(" -> "+map.get(start));
            start=map.get(start);
       }
       System.out.println();

    }
}
