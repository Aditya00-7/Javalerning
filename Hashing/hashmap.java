package Hashing;
import javax.print.DocFlavor;
import java.util.*;
public class hashmap {
    public static void main(String args[]){
       //country(key), population (value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertaion
        map.put("India",120);
        map.put("usa",30);
        map.put("china",150);
        System.out.println(map);

        map.put("china",180);
        System.out.println(map);

        //search
        if(map.containsKey("china")){
            System.out.println("Key is present in the map");
        }else {
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("china"));// key exists
        System.out.println(map.get("Indonesia"));

      /*  int arr[]={12,15,18};
        for(int i =0;i<3;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();*/
        for (Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> Keys =map.keySet();
        for (String key :Keys){
            System.out.println(key +" " +map.get(key));
        }

        //remove
        map.remove("china");
        System.out.println(map);
    }
}
