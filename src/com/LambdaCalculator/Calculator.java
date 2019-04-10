package com.LambdaCalculator;

import java.io.IOException;

@FunctionalInterface
public interface Calculator {

    public void calculate() throws IOException; //unimplemented method on functional interface
}
