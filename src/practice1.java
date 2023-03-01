import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class practice1 {

    public static void main(String[] args) {
        Map< String,String> contacts = new HashMap< String,String>();
        contacts.put("Ali","Durhan");
        contacts.put("Veli","Karaca");
        contacts.put("Semih","Sayginer");
        contacts.put("Halit","Karabiyik");
        contacts.put("Sami","Yavuz");
        ForEach: for (String each:contacts.values()) {
            System.out.println(each);
        }
        Iterator<Map.Entry< String, String>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry< String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue()); }
    }
}
