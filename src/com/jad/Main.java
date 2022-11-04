package com.jad;

import com.jad.controller.Controller;
import com.jad.model.Model;
import com.jad.view.View;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller = new Controller(new Model(), new View());
        controller.start();
    }
}
