package com.bupt.poirot.pattern.iteratorPattern;

import java.util.LinkedList;

/**
 * Created by hui.chen on 11/25/16.
 */
public class Science implements ISubject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }

    //Containing the ScienceIterator
    public class ScienceIterator implements IIterator {
        private LinkedList<String> subjects;
        private int position;

        public ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects.get(position++);
        }

        @Override
        public Boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String currentItem() {
            return subjects.get(position);
        }
    }
}
