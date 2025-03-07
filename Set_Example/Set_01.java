
import java.util.HashSet;
import java.util.Set;

public class Set_01 {

    public static void main(String[] args) {
        
        // create a set 
        Set<String> data = new HashSet<>();

        // add elements to the set
        data.add("Samosa");
        data.add("kachori");
        data.add("Samosa");
        data.add("Samosa");
        data.add("pav bhaji");
        data.add("pav bhaji");

        // print the set
        System.out.println(data);


        // remove an element
        data.remove("Samosa");
        System.out.println(data);

        // check if an element is present
        System.out.println(data.contains("Samosa"));

        // size of the set
        System.out.println(data.size());

        // clear the set
        data.clear();
        System.out.println(data);

        // check if the set is empty
        System.out.println(data.isEmpty());

        // add elements to the set
        data.add("Samosa");
        data.add("kachori");
        data.add("Samosa");
        data.add("Samosa");
        data.add("pav bhaji");
        data.add("pav bhaji");

        // print the set
        System.out.println(data);

    }
    
}