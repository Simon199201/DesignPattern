package com.simon.impl;

import com.simon.base.Command;

public class FallCommand extends Command {
    private TetrisMachine tetrisMachine;

    public FallCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        this.tetrisMachine.fallToBottom();
        
    }
}
