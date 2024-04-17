import java.util.*;
public class TreeFactory{


    private static  HashMap<String, TreeType> mp = new HashMap<>();
    public static TreeType getType(String name, String color, String texture)
    {
        String key = name+color+texture;
        TreeType type = mp.get(key);
        
        if(type==null)
        {  type = new TreeType(name, color, texture);
            mp.put(key,type);
            
        }
        return type;        //this will act as type;
    }

}
