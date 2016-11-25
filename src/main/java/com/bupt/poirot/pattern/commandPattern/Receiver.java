package com.bupt.poirot.pattern.commandPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Receiver {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }
    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}
