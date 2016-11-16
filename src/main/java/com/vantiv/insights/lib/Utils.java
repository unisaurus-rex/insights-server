package com.vantiv.insights.lib;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Utilities Library
 * </p>
 * Common functions that may be used across the project
 */
public class Utils {

    /**
     * inputStreamToString
     * </p>
     * Converts an InputStream to a String
     *
     * @param is InputStream
     * @return String representation for the passed InputStream
     * @throws IOException
     */
    public static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder builder = new StringBuilder();
        Reader reader = new BufferedReader(new InputStreamReader(is, Charset.forName(StandardCharsets.UTF_8.name())));

        int i = 0;
        while ((i = reader.read()) != -1) {
            builder.append((char) i);
        }

        System.out.println(builder.toString());
        return builder.toString();
    }

    /**
     * monthToQuarter
     * @param month - month of the year where first month has a 1 index
     * @return quarter the quarter for the corresponding passed month
     */
    public static Integer monthToQuarter(Integer month) {
        return (month - 1) / 3 + 1;
    }
}
