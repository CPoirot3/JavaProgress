package com.bupt.poirot.pattern.abstractFactoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */

interface IMovieFactory {
    ITollywoodMovie getTollywoodMovie();
    IBollywoodMovie getBollywoodMovie();
}
