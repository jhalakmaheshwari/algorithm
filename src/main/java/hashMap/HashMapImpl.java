package hashMap;
import ArrayList.DyanamicArray;
import java.util.HashMap;

/**
 * Created by Jhalak on 5/26/2017.
 */
public class HashMapImpl {
    DyanamicArray da=new DyanamicArray();
//    DyanamicArray ds=new DyanamicArray();

    public HashMapImpl(){}

    public void put(String key, String value){
        int hash=Math.abs(key.hashCode() % da.getCapacity());
        NodeHm entry=new NodeHm(key,value);
        if(da.get(hash)==null){
            da.add(entry);
        }
        else{

        }



    }

}
