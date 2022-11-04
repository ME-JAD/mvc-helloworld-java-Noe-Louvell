package com.jad.controller;

import com.jad.shared.EUserAction;
import com.jad.shared.IActionPerformer;
import com.jad.shared.IModel;
import com.jad.shared.IView;

public class Controller implements IActionPerformer {
    private final IModel model;
    private final IView view;

    public Controller(final IModel model, IView view) {
        this.model = model;
        this.view = view;
        this.view.setModel(this.model);
        this.view.setActionPerformer(this);
    }


    public void start() {
        this.view.displayStartScreen();
        do {
            this.view.displayMessage();
        } while (this.view.ask() != EUserAction.Exit);
    }
}
