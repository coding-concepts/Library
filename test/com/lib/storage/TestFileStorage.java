/*
 * @(#)TestFileStorage.java 1.0 Aug 21, 2017
 */
package com.lib.storage;

import com.lib.domain.Film;
import org.junit.Test;

import java.util.List;

/**
 * <code>TestFileStorage</code> class is
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
public class TestFileStorage {

    @Test
    public void testFilmStorage() {
        FileStorage fs = new FileStorage();
        Film film = new Film("Harry Potter - Part 2", 100);
        fs.storeObject(film);

        List<Film> all = fs.getAllFilms();

        for (Film f : all){
            System.out.println(f);
        }
    }
}



