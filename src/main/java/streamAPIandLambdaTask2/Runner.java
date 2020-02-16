package streamAPIandLambdaTask2;



public class Runner {
    public static void main(String[] args) {
        TreeFunction treeFunctionAdder = (x,y,z) -> x+y+z;
        TreeFunction treeFunctionMultiplier = (x,y,z) -> x*y*z;

        // client code for usage of this two lambdas;
        // 1. Calculate middle arithmetic's number of three numbers
        System.out.println((treeFunctionAdder.calculator(2,3,4))/3);
        // 2. Calculate middle geometrical's number of three numbers
        System.out.println((treeFunctionMultiplier.calculator(2,3,4))/3);

    }
}
