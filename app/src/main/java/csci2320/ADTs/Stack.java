package csci2320.ADTs;

public interface Stack <E> {
    void push(E elem);
    E pop();
    E peek();
    boolean isEmpty();
}
