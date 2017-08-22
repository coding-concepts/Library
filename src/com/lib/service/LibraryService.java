/*
 * @(#)LibraryService.java 1.0 Aug 21, 2017
 */
package com.lib.service;

import com.lib.domain.DVD;
import com.lib.domain.Film;
import com.lib.domain.Member;

/**
 * <code>LibraryService</code> class is  Service Methods for Library
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
public interface LibraryService {

    /**
     * Loans a DVD given a DVD and member
     * @param member member loaning the DVD
     * @param dvd the DVD being loaned
     */
    void loanDvd(Member member, DVD dvd);

    /**
     * Returns a DVD
     * @param dvd DVD
     */
    void returnDvd(DVD dvd);

    /**
     * Adds a member
     * @param member member
     */
    void addMember(Member member);

    /**
     * Adds a Film
     * @param f film
     * @return Film
     */
    Film addFilm(Film f);

    /**
     * Adds a DVD
     * @param dvd DVD
     * @return DVD
     */
    DVD addDvd(DVD dvd);



}



