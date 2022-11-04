package com.jad.shared;

public interface IView {
    void setModel(final IModel model);
    void setActionPerformer(final IActionPerformer actionPerformer);
    void displayMessage();
    void displayStartScreen();
    EUserAction  ask();
}
