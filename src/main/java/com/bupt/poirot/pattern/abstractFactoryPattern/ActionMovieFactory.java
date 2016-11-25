package com.bupt.poirot.pattern.abstractFactoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

//Action Movie Factory
class ActionMovieFactory implements IMovieFactory {
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodActionMovie();
    }


    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}