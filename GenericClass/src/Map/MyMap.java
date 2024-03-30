package Map;

import com.sun.jdi.Value;

import java.util.ArrayList;

public class MyMap <key, value>{
    public ArrayList<key> keys;
    public ArrayList<value> val;

    public MyMap(){
        keys = new ArrayList<>();
        val = new ArrayList<>();
    }

    public void put(key key, value values){
        if(keys.contains(key)){
            val.set(keys.indexOf(key)), values;
        } else{
            keys.add(key);
            val.add(values);
        }
    }

    public value get(key key){
        if(keys.contains(key)){
            return val.get(keys.indexOf(key));
        } else {
            return null;
        }
    }

    public value remove(key key){
        if(keys.contains(key)){
            value removed = val.get(keys.indexOf(key));
            val.remove(val.get(keys.indexOf(key)));
            keys.remove(key);
            return removed;
        } else{
            return null;
        }
    }

} //MyMap
