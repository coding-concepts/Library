/*
 * @(#)LibraryServiceImpl.java 1.0 Aug 21, 2017
 */
package com.lib.service.impl;

import com.lib.domain.DVD;
import com.lib.domain.Film;
import com.lib.domain.Member;
import com.lib.service.LibraryService;

/**
 * <code>LibraryServiceImpl</code> class is  Implementation file for LibraryService.
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
public class LibraryServiceImpl implements LibraryService {

    /**
     * Loans a DVD given a DVD and member
     *
     * @param member member loaning the DVD
     * @param dvd    the DVD being loaned
     */
    @Override public void loanDvd(Member member, DVD dvd) {

    }

    /**
     * Returns a DVD
     *
     * @param dvd DVD
     */
    @Override public void returnDvd(DVD dvd) {

    }

    /**
     * Adds a member
     *
     * @param member member
     */
    @Override public void addMember(Member member) {

    }

    /**
     * Adds a Film
     *
     * @param f film
     * @return Film
     */
    @Override public Film addFilm(Film f) {
        return null;
    }

    /**
     * Adds a DVD
     *
     * @param dvd DVD
     * @return DVD
     */
    @Override public DVD addDvd(DVD dvd) {
        return null;
    }
}



