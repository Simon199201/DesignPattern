package com.simon;

import com.simon.base.ArithmeticExpression;
import com.simon.impl.AdditionExpression;
import com.simon.impl.NumExpression;

import java.util.Stack;

public class Calculator {
    private Stack<ArithmeticExpression> stack = new Stack<>();

    public Calculator(String expression) {
        String regex = " ";
        String[] split = expression.split(regex);
        for (int i = 0; i < split.length; i++) {
            switch (split[i]) {
                case "+":
                    ArithmeticExpression num1 = stack.pop();
                    AdditionExpression additionExpression = new AdditionExpression(num1, new NumExpression(Integer.valueOf(split[++i])));
                    stack.push(additionExpression);
                    break;
                default:
                    stack.push(new NumExpression(Integer.valueOf(split[i])));
                    break;
            }
        }
    }
    public int calculator(){
        return stack.pop().interpret();
    }
}
