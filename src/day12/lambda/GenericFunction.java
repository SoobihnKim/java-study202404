package day12.lambda;

@FunctionalInterface
public interface GenericFunction<X, Y> {

    // X를 주면 Y를 추출
    Y apply(X x);

}
