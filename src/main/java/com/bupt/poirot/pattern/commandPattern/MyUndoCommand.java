package com.bupt.poirot.pattern.commandPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
class MyUndoCommand implements ICommand {
    private Receiver receiver;

    MyUndoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void doWork() {
        //Call undo in receiver
        receiver.performUndo();
    }
}