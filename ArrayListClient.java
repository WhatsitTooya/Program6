import java.util.ArrayList; // comment out to test your generic class

public class ArrayListClient {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String(”first”));
        list.add(new String(”second”));
        System.out.println(list.size());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.remove(0);
        System.out.println(list.size());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.clear();
        list.isEmpty();
        System.out.println(list.size());
    }
}