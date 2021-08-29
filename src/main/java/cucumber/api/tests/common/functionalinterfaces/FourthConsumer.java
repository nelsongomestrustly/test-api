package cucumber.api.tests.common.functionalinterfaces;

@FunctionalInterface
public interface FourthConsumer<A, B, C, D> {

    void accept(A firstArgument, B secondArgument, C thirdArgument, D fourthdArgument);

}
