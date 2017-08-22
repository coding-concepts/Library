/*
 * @(#)FilmRepository.java 1.0 Aug 21, 2017
 */
package com.lib.storage.repository;

import com.lib.domain.Film;

import java.util.List;

/**
 * <code>FilmRepository</code> class is  Repository For Film
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    8/21/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since Aug 21, 2017
 */
public interface FilmRepository {

    /**
     * Saves a film in to out storage.
     * @param film the film onject
     * @return Film object.
     */
    Film save(Film film);

    /**
     * Given an id, this can give a Film objct
     * @param id id
     * @return Film
     */
    Film getById(String id);

    /**
     * Given an title, this can give a Film objct
     * @param title title
     * @return Film
     */
    Film getByTitle(String title);


    /**
     * Lists all films
     * @return List of Films
     */
    List<Film> getAllFilms();
}



