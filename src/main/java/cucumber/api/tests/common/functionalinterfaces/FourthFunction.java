package cucumber.api.tests.common.functionalinterfaces;

@FunctionalInterface
public interface FourthFunction<A, B, C, D, E> {

    E apply(A firstArgument, B secondtArgument, C thirdArgument, D fourthArgument);

}
