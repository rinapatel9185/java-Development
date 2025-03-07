package Practice_09;

import java.util.HashSet;
import java.util.Set;

public class set_example{

    public static void main(String[] args) {
        
        
        Set<String> data = new HashSet<>();

       
        data.add("Samosa");
        data.add("kachori");
        data.add("Samosa");
        data.add("Samosa");
        data.add("pav bhaji");
        data.add("pav bhaji");

        
        System.out.println(data);


        
        data.remove("Samosa");
        System.out.println(data);

        
        System.out.println(data.contains("Samosa"));

       
        System.out.println(data.size());

        
        data.clear();
        System.out.println(data);

        
        System.out.println(data.isEmpty());

        
        data.add("Samosa");
        data.add("kachori");
        data.add("Samosa");
        data.add("Samosa");
        data.add("pav bhaji");
        data.add("pav bhaji");

        
        System.out.println(data);

    }
    
}
