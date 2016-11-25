package com.bupt.poirot.pattern.abstractFactoryPattern;

/**
 * Created by hui.chen on 11/25/16.
 */
public class AbstractFactoryPatternEx {
    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.getTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();
        System.out.println("\nAction movies are:");
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());
        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.getTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();
        System.out.println("\nComedy movies are:");
        System.out.println(tComedy.movieName());
        System.out.println(bComedy.movieName());
    }
}
