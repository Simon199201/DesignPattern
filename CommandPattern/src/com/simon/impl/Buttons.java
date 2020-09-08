package com.simon.impl;

import com.simon.base.Command;

/**
 * 请求者角色
 */
public class Buttons {
    private Command leftCommand;
    private Command rightCommand;
    private Command fallToBottomCommand;
    private Command transformCommand;

    public void setLeftCommand(Command leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(Command rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallToBottomCommand(Command fallToBottomCommand) {
        this.fallToBottomCommand = fallToBottomCommand;
    }

    public void setTransformCommand(Command transformCommand) {
        this.transformCommand = transformCommand;
    }

    public void toLeft() {
        this.leftCommand.execute();
    }

    public void toRight() {
        this.rightCommand.execute();
    }

    public void toFall() {
        this.fallToBottomCommand.execute();
    }

    public void toTransform() {
        this.transformCommand.execute();
    }


}
