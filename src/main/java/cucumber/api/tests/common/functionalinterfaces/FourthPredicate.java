package cucumber.api.tests.common.functionalinterfaces;

@FunctionalInterface
public interface FourthPredicate<A, B, C, D> {

    boolean test(A firstArgument, B secondtArgument, C thirdArgument, D fourthArgument);

}
