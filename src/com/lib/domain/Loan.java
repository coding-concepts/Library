/*
 * @(#)Loan.java 1.0 Aug 07, 2017
 */
package com.lib.domain;

import java.util.Date;


public class Loan implements Entity {

    private Date borrowedDate;

    private Date actualReturnedDate;

    private Date expectedReturnedDate;

    private DVD dvd;

    private Member member;

    /**
     * gets actualReturnedDate
     * @return actualReturnedDate
     */
    public Date getActualReturnedDate() {
        return actualReturnedDate;
    }

    /**
     * Sets actualReturnedDate
     * @param actualReturnedDate actualReturnedDate
     */
    public void setActualReturnedDate(Date actualReturnedDate) {
        this.actualReturnedDate = actualReturnedDate;
    }

    /**
     * Gets borrowedDate
     * @return borrowedDate
     */
    public Date getBorrowedDate() {
        return borrowedDate;
    }

    /**
     * Sets borrowedDate
     * @param borrowedDate borrowedDate
     */
    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    /**
     * Gets dvd
     * @return dvd
     */
    public DVD getDvd() {
        return dvd;
    }

    /**
     * Sets dvd
     * @param dvd dvd
     */
    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    /**
     * Gets expectedReturnedDate/
     * @return expectedReturnedDate
     */
    public Date getExpectedReturnedDate() {
        return expectedReturnedDate;
    }

    /**
     * Sets expectedReturnedDate
     * @param expectedReturnedDate expectedReturnedDate
     */
    public void setExpectedReturnedDate(Date expectedReturnedDate) {
        this.expectedReturnedDate = expectedReturnedDate;
    }

    /**
     * gets member
     * @return member
     */
    public Member getMember() {
        return member;
    }

    /**
     * sets member
     * @param member member
     */
    public void setMember(Member member) {
        this.member = member;
    }
}



