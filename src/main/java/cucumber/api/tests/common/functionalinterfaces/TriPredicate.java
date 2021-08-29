package cucumber.api.tests.common.functionalinterfaces;

@FunctionalInterface
public interface TriPredicate<A, B, C> {

    boolean test(A firstArgument, B secondtArgument, C thirdArgument);

}
