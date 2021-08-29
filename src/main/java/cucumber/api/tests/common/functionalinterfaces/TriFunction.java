package cucumber.api.tests.common.functionalinterfaces;

@FunctionalInterface
public interface TriFunction<A, B, C, D> {

    D apply(A firstArgument, B secondtArgument, C thirdArgument);

}
