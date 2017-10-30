/*
 * @(#)Film.java 1.0 Aug 07, 2017
 */
package com.lib.domain;

/**
 * <code>Film</code> class is
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    8/7/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since Aug 07, 2017
 */
public class Film implements Entity{
    private String id;
    private String title;
    private int noOfAvailableCopies;

    /**
     * Creates a class.
     * @param t title
     * @param c no of copies
     */
    public Film(String t, int c){
        this.title = t;
        this.noOfAvailableCopies = c;
    }
    public Film(String id, String t, int c){
        this.title = t;
        this.id = id;
        this.noOfAvailableCopies = c;
    }

    /**
     * Gets id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets Id.
     * @param id id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets noOfAvailableCopies
     * @return noOfAvailableCopies
     */
    public int getNoOfAvailableCopies() {
        return noOfAvailableCopies;
    }

    /**
     * Sets noOfAvailableCopies
     * @param noOfAvailableCopies noOfAvailableCopies
     */
    public void setNoOfAvailableCopies(int noOfAvailableCopies) {
        this.noOfAvailableCopies = noOfAvailableCopies;
    }

    /**
     * Gets title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * @param title tile.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * String representation of the class.
     * @return String
     */
    @Override public String toString() {
        final StringBuffer sb = new StringBuffer("Film{");
        sb.append("id='").append(id).append('\'');
        sb.append(", noOfAvailableCopies=").append(noOfAvailableCopies);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}



