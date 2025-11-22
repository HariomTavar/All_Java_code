import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Iterators{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");

Iterator<String> it = list.iterator();
while(it.hasNext()) {
    System.out.println(it.next());
    it.remove();
}

    }
}
