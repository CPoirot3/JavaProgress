package com.bupt.poirot.pattern.commandPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class MyRedoCommand implements ICommand {
    private Receiver receiver;

    MyRedoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void doWork() {
        //Call redo in receiver
        receiver.performRedo();
    }
}
