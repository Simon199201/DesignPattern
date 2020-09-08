package com.simon.impl;

import com.simon.base.ArithmeticExpression;

public abstract class OperatorExpression extends ArithmeticExpression {
    protected ArithmeticExpression num1;
    protected ArithmeticExpression num2;

    public OperatorExpression(ArithmeticExpression num1,ArithmeticExpression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}
