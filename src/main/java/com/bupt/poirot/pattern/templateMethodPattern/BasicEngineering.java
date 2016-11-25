package com.bupt.poirot.pattern.templateMethodPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public abstract class BasicEngineering {
    // Papers() in the template method

    public void papers() {
        // Common Papers:
        math();
        softSkills();
        specialPaper();
    }

    public void math() {
        System.out.println("Mathematics");
    }

    private void softSkills() {
        System.out.println("SoftSkills");
    }

    public abstract void specialPaper();
}
