package nine;
//Generičkim tip
//1. klase: Box<T>
//2. interfejs: Testable<E>
public interface Testable<E> {
    boolean test(E element);
}
