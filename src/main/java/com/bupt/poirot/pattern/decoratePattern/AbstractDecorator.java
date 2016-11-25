package com.bupt.poirot.pattern.decoratePattern;

/**
 * Created by hui.chen on 11/25/16.
 */
abstract class AbstractDecorator extends Component {
    protected Component com;

    public void SetTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}
