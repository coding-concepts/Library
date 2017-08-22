/*
 * @(#)FilmStorage.java 1.0 Aug 21, 2017
 */
package com.lib.storage;

import com.lib.domain.DVD;
import com.lib.domain.Film;
import com.lib.domain.Loan;
import com.lib.domain.Member;
import com.lib.transformer.FilmTransformer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * <code>FilmStorage</code> class is  storage for film
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

public class FileStorage {

    private static final String FILM_FILE  = "Film.txt";
    private static final String DVD_FILE    = "Dvd.txt";
    private static final String LOAN_FILE   = "Loan.txt";
    private static final String MEMBER_FILE = "Member.txt";

    FilmTransformer ft  = new FilmTransformer();

    private String getFileName(Object obj) {
        String dir = System.getProperty("java.io.tmpdir");
        dir = dir + File.separator;
        if (obj instanceof Film) {
           return (dir + FILM_FILE);
        } else if (obj instanceof DVD) {
            return (dir + DVD_FILE);
        } else if (obj instanceof Loan) {
            return (dir + LOAN_FILE);
        } else if (obj instanceof Member) {
            return (dir + MEMBER_FILE);
        } else {
            throw new RuntimeException("We can't store the class : "+obj.getClass().getName());
        }
    }

    private String getFileStorageString(Object obj) {
        if (obj instanceof Film) {
            return saveFilmString((Film)obj);
        } else if (obj instanceof DVD) {
            return "NOT YET";
        } else if (obj instanceof Loan) {
            return "NOT YET";
        } else if (obj instanceof Member) {
            return "NOT YET";
        } else {
            throw new RuntimeException("We can't store the class : "+obj.getClass().getName());
        }
    }


    String saveFilmString(Film film){

        StringBuffer sb = new StringBuffer();

        String fileName = System.getProperty("java.io.tmpdir")+ File.separator + FILM_FILE;
        BufferedReader br = null;
        String sCurrentLine = null;
        try
        {
            br = new BufferedReader(
                    new FileReader(fileName));

            boolean found = false;

            while ((sCurrentLine = br.readLine()) != null)
            {
                Film f = ft.toEntity(sCurrentLine);

                if (f != null) {
                    if (!f.getTitle().equalsIgnoreCase(film.getTitle())){
                        sb.append(sCurrentLine);
                        sb.append("\n");
                    } else {
                        found = true;
                        f.setNoOfAvailableCopies(film.getNoOfAvailableCopies());
                        sb.append(ft.toFileFormat(f));
                        sb.append("\n");
                    }
                }
            }
            if (!found){
                sb.append(ft.toFileFormat(film));
                sb.append("\n");
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                    br.close();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    /**
     * This stores objects.
     * @param obj
     */
    public void storeObject(Object obj){

        PrintWriter out = null;
        BufferedWriter bufWriter;
        String fileName = getFileName(obj);

        try{
            bufWriter =
                    Files.newBufferedWriter(
                            Paths.get(fileName),
                            Charset.forName("UTF8"),
                            StandardOpenOption.WRITE,
                            StandardOpenOption.CREATE);
            out = new PrintWriter(bufWriter, true);
        }catch(IOException e){
            //Oh, no! Failed to create PrintWriter
            throw new RuntimeException("Could not create to file....."+fileName);
        }

        //After successful creation of PrintWriter
        //create or update

        out.println(getFileStorageString(obj));



        //After done writing, remember to close!
        out.close();
    }


    public List<Film> getAllFilms() {

        List<Film> returnValue = new ArrayList();



        String fileName = System.getProperty("java.io.tmpdir")+ File.separator + FILM_FILE;
        BufferedReader br = null;
        String sCurrentLine = null;
        try
        {
            br = new BufferedReader(
                    new FileReader(fileName));
            while ((sCurrentLine = br.readLine()) != null)
            {
                Film f  = ft.toEntity(sCurrentLine);
                returnValue.add(f);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                    br.close();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        return returnValue;
    }


}



