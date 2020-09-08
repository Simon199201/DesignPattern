package com.simon.impl;

import com.simon.base.ArithmeticExpression;

public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression num1, ArithmeticExpression num2) {
        super(num1, num2);
    }

    @Override
    public int interpret() {
        return this.num1.interpret() + this.num2.interpret();
    }
}
