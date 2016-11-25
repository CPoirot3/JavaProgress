package com.bupt.poirot.pattern.commandPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class Invoke {
    ICommand cmd;

    public void ExecuteCommand(ICommand cmd) {
        this.cmd = cmd;
        cmd.doWork();
    }
}
