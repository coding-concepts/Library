/*
 * @(#)Utilitiies.java 1.0 Aug 21, 2017
 */
package com.lib.transformer;

import java.util.UUID;

/**
 * <code>Utilitiies</code> class is  Utility Class
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
public class Utilitiies {

    public static final String STORAGE_DELIMITER = "|";


    public static final String getId() {
        UUID uuid = UUID.randomUUID();
       return uuid.toString();
    }
}



