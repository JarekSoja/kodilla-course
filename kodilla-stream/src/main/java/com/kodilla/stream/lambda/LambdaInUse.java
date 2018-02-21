package com.kodilla.stream.lambda;

public class LambdaInUse {

    public void isTrueExecute(int a, int b, LambdaTraining lambdaTraining){
        boolean result = lambdaTraining.isTrue(a,b);
        System.out.println(result);
    }

    public void canIUseTwo(double a, double b, YetAnotherLambda yetAnotherLambda){
        double result = yetAnotherLambda.justMath(a,b);
        System.out.println(result);
    }

}
