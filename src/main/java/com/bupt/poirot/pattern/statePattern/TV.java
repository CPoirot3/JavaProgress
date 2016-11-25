package com.bupt.poirot.pattern.statePattern;

/**
 * Created by hui.chen on 11/25/16.
 */

class TV {
    private RemoteControl state;

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public TV(RemoteControl state) {
        this.state=state;
    }
    public void pressButton() {
        state.pressSwitch(this);
    }
}
