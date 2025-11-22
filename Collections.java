import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
public class Collections{
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a.add(23);
        a.add(34);
        
        System.out.println(a.get(0));
        System.out.println(a);

        Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop()); // B

HashSet<String> hs = new HashSet<>();
hs.add("Java");
hs.add("Python");
hs.add("Java"); // duplicate ignored
System.out.println(hs); // [Java, Python]

TreeSet<Integer> ts = new TreeSet<>();
ts.add(50);
ts.add(10);
ts.add(30);
System.out.println(ts); // [10, 30, 50]

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
pq.add(20);
System.out.println(pq.poll()); // 10 (smallest)
System.out.println(pq);




    }
}