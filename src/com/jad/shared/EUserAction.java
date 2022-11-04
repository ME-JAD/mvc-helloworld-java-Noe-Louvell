package com.jad.shared;

public enum EUserAction {
    Exit("UA_Exit"),
    Noop("UA_Noop"),
    France("France"),
    Angleterre("Angleterre"),
    Japon("Japon");
    private final String property;

    EUserAction(String property){
        this.property = property;
    }

    public static EUserAction getByValue(String value){
        for(EUserAction a : values()){
            if( a.property.equals(value)){
                return a;
            }
        }
        return EUserAction.Noop;
    }
}



