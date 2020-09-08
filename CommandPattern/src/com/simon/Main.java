package com.simon;

import com.simon.base.Command;
import com.simon.impl.*;

/**
 * 客户端角色
 */
public class Main {
    public static void main(String[] args) {
        //俄罗斯方块游戏 接收者角色
        TetrisMachine tetrisMachine = new TetrisMachine();


        //构造命令角色
        Command leftCommand = new LeftCommand(tetrisMachine);
        Command rightCommand = new RightCommand(tetrisMachine);
        Command fallCommand = new FallCommand(tetrisMachine);
        Command transformCommand = new TransformCommand(tetrisMachine);

        //构造请求者角色
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallToBottomCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        //构造客户端并执行
        buttons.toLeft();
        buttons.toRight();
        buttons.toTransform();
        buttons.toFall();

    }
}
