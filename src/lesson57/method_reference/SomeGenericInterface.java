package lesson57.method_reference;

@FunctionalInterface
public interface SomeGenericInterface<T> {

    boolean test(T n, T m);
}
