package day12.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {

    boolean test(T t);

}
