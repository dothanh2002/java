import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Luan");
        names.add("Linh");
        names.add("Lan");
        names.add(0, "HIHI");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name : names
        ) {
            System.out.println(name);
        }

        //xoá
        names.clear();


        HashMap<String, String> profiles = new HashMap<>();
        profiles.put("Luan", "Quang Ninh");
        profiles.put("Nam", "Hà Nội");
        //iterating over keys only
        for (String key : profiles.keySet()) {
            System.out.println(profiles.get(key));
        }

        //iterating over values only
        for (String value : profiles.values()) {
            System.out.println(value);
        }

        //iterating over key-value pairs
        for (HashMap.Entry<String, String> entry : profiles.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //using iterator
        Iterator<String> iterator = profiles.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " : " + profiles.get(key));
        }


    }
}
