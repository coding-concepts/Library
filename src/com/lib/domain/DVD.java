/*
 * @(#)DVD.java 1.0 Aug 07, 2017
 */
package com.lib.domain;

/**
 * This is a class that represents a DVD
 */
public class DVD  implements Entity{

    private Film film;

    private String id;

    /**
     * In order to create a DVD, you need to provide the id.
     * @param id id of the DVD.
     */
    public DVD(String id, Film f){
        this.id = id;
        this.film = f;
    }

    /**
     * Gets Id.
     * @return id of the DVD
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the Id.
     * @param id id if the DVD.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the Film
     * @return film.
     */
    public Film getFilm() {
        return film;
    }

    /**
     * sets the Film.
     * @param film film
     */
    public void setFilm(Film film) {
        this.film = film;
    }

    /**
     * ToString for better printing.
     * @return String of the class.
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DVD{");
        sb.append("film=").append(film);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

}



