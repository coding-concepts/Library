/*
 * @(#)FilmTransformer.java 1.0 Aug 21, 2017
 */
package com.lib.transformer;

import com.lib.domain.Entity;
import com.lib.domain.Film;

import static com.lib.transformer.Utilitiies.STORAGE_DELIMITER;

/**
 * <code>FilmTransformer</code> class is  Transformer for Film
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
public class FilmTransformer implements EntityTransformer {

    /**
     * This method makes a entity to formatted string
     * @param e film
     * @return String
     */
    public String toFileFormat(Entity e){
        Film film = (Film)e;
        if (film.getId() == null){
            film.setId(Utilitiies.getId());
        }
        StringBuffer sb = new StringBuffer()
                .append(film.getId())
                .append(STORAGE_DELIMITER)
                .append(film.getTitle())
                .append(STORAGE_DELIMITER)
                .append(film.getNoOfAvailableCopies());

        return sb.toString();
    }

    /**
     * This method converts from a String to Film Object
     * @param s formatted String
     * @return Film
     */
    public Film toEntity(String s) {
        if (s == null || s.trim().equals("")){
            return null;
        }

        String[] strings  = s.split("\\"+STORAGE_DELIMITER);

        if (strings == null || strings.length != 3){
            throw new RuntimeException("Can't convert to Film");
        }

        Film f = new Film(strings[1], Integer.parseInt(strings[2]));
        f.setId(strings[0]);

        return f;

    }

}



