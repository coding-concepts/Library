/*
 * @(#)FilmRepositoryImpl.java 1.0 Aug 21, 2017
 */
package com.lib.storage.repository.impl;

import com.lib.domain.Film;
import com.lib.storage.FileStorage;
import com.lib.storage.repository.FilmRepository;
import com.lib.transformer.Utilitiies;

import java.util.List;

/**
 * <code>FilmRepositoryImpl</code> class is  Implementation for FilmRepository
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
public class FilmRepositoryImpl implements FilmRepository {

    FileStorage fileStorage = new FileStorage();

    @Override
    public Film save(Film film) {
        //check if the title is unique. if not then we can think that the save is done
        //and respond with the same one. although we would want to reset the number of available copies.
        Film existing = getByTitle(film.getTitle());

        if (existing != null) {
            film.setId(existing.getId());
        }
        if (film.getId() == null){
            film.setId(Utilitiies.getId());
        }

        //lets save it.
        fileStorage.storeObject(film);

        return film;
    }

    @Override
    public Film getById(String id) {
        for (Film  f : getAllFilms()){
            if (f.getId().equalsIgnoreCase(id)){
                return f;
            }
        }
        return null;
    }

    @Override
    public Film getByTitle(String title) {
       for (Film  f : getAllFilms()){
           if (f.getTitle().equalsIgnoreCase(title)){
               return f;
           }
       }
        return null;
    }

    @Override
    public List<Film> getAllFilms() {
        return fileStorage.getAllFilms();
    }
}



