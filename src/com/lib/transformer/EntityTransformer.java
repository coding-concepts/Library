/*
 * @(#)EntityTransformer.java 1.0 Aug 21, 2017
 */
package com.lib.transformer;

import com.lib.domain.Entity;

/**
 * <code>EntityTransformer</code> class is  interface for entities
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
public interface EntityTransformer {

    /**
     * COnverts an entity object to file format.
     * @param e entity
     * @return string
     */
    String toFileFormat(Entity e);

    /**
     * converts a String to Entity
     * @param s String
     * @return entity
     */
    Entity toEntity(String s);

}



