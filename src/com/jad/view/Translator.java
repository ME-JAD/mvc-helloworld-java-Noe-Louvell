package com.jad.view;

import com.jad.shared.EUserAction;
import com.jad.shared.IModel;

abstract class Translator {
    public static EUserAction ConvertStringToUserAction(String string, IModel model) {
        if(string.equals(model.getExitString())){
            return EUserAction.Exit;
        } else {
            return EUserAction.Noop;
        }
    }
}
