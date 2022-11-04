package com.jad.view;

import com.jad.shared.EUserAction;
import com.jad.shared.IActionPerformer;
import com.jad.shared.IModel;
import com.jad.shared.IView;

import java.util.Scanner;

public class View implements IView {
    private IModel model;
    private IActionPerformer actionPerformer;


    public IModel getModel() {
        return model;
    }

    public void setModel(final  IModel model){
        this.model=model;
    }

    public IActionPerformer getActionPerformer() {
        return actionPerformer;
    }

    public void setActionPerformer(IActionPerformer actionPerformer) {
        this.actionPerformer = actionPerformer;
    }

    public void displayMessage() {
        this.displayTitle();
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.model.getHWEnumByCountry(scanner.next()));
        System.out.println("*  *  *  *");
    }
    public void displayStartScreen() {
        System.out.println("Bvn sur le hw du paf");
    }
    public void displayTitle(){
        String title = this.model.getTitle();
        System.out.println("*".repeat(title.length() + 4));
        System.out.println("* "+title+ " *");
        System.out.println("*".repeat(title.length() + 4));
    }

    public EUserAction ask() {
        Scanner scanner = new Scanner(System.in);
        return Translator.ConvertStringToUserAction(scanner.next(), model);
    }


}
