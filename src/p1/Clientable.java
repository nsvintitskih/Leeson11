package p1;

public interface Clientable<T> {
    T getId();
    String getName();
    void setName(String name);
}
