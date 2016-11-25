package com.bupt.poirot.pattern.abstractFactoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
//Comedy Movie Factory
class ComedyMovieFactory implements IMovieFactory {
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}