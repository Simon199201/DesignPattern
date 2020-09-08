package com.simon.impl;

import com.simon.base.Command;

public class LeftCommand extends Command {
    private TetrisMachine tetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        this.tetrisMachine.toLeft();

    }
}
