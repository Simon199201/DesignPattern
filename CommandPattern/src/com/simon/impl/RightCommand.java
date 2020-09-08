package com.simon.impl;

import com.simon.base.Command;

public class RightCommand extends Command {
    private TetrisMachine tetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        this.tetrisMachine.toRight();
        
    }
}
