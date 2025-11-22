class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class Genrics {
    public static void main(String[] args) {

        Box<Integer> b = new Box<>();
        b.set(34);
        System.out.println(b.get());

        Box<String> b1 = new Box<>();
        b1.set("shree");
        System.out.println(b1.get());   // <-- Correct
    }
}
