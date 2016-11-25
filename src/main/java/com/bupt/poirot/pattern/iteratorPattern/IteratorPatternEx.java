package com.bupt.poirot.pattern.iteratorPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class IteratorPatternEx {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubject sc_subject = new Science();
        ISubject ar_subjects = new Arts();
        IIterator Sc_iterator = sc_subject.createIterator();
        IIterator Ar_iterator = ar_subjects.createIterator();
        System.out.println("\nScience subjects :");
        print(Sc_iterator);
        System.out.println("\nArts subjects :");
        print(Ar_iterator);
    }

    public static void print(IIterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
