package com.simon.impl;

import com.simon.base.Command;

public class TransformCommand extends Command {
    private TetrisMachine tetrisMachine;

    public TransformCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        this.tetrisMachine.transform();
    }
}
