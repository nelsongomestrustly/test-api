package cucumber.api.tests.common.functionalinterfaces;

@FunctionalInterface
public interface TriConsumer<A, B, C> {

    void accept(A firstArgument, B secondtArgument, C thirdArgument);

}
