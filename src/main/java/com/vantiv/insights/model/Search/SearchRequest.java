package com.vantiv.insights.model.Search;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * SearchResult
 * </p>
 * All search requests will have this basic structure
 */
public final class SearchRequest {

    private ArrayList<groupByFields> groupBy;
    private DateTime startDate;
    private DateTime endDate;
    private String timerange;

    /**
     * SearchRequest
     * </p>
     * Generic search request.
     * - groupBy - fields to narrow search scope
     * - dateRange - a date range to search within for results
     * - dateRange.startDate - the initial date, inclusive, to begin search for results
     * - dateRange.endDate - the final date, includive, to end the search for results
     * - timerange - TODO this may be an unnecessary field that should be removed.
     */
    public SearchRequest() {
        this.groupBy = null;
        this.startDate = null;
        this.endDate = null;
        this.timerange = null;
    }

    /**
     * getGroupBy
     * </p>
     * Returns the contents of the group by field
     *
     * @return ArrayList<groupByFields>
     */
    public ArrayList<groupByFields> getGroupBy() {
        return groupBy;
    }

    /**
     * setGroupBy
     * </p>
     * Populates the group by field, with the contents of the passed in ArrayList, with no dulicates
     *
     * @param groupBy - ArrayList of fields to be used to narrow search scope
     */
    public void setGroupBy(ArrayList<groupByFields> groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * getStartDate
     * </p>
     * Returns the start date as a DateTime object
     *
     * @return startDate - initial date, inclusive, to begin search for results
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * setStartDate
     * </p>
     * Set the start date to begin search for results
     *
     * @param startDate - initial date, inclusive, to begin search for results
     */
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * getEndDate
     * </p>
     * Returns the end date to end search for results
     *
     * @return endDate - final date, inclusive, to end search for results
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * setEndDate
     * </p>
     * Set the end date to end the search for results
     *
     * @param endDate - final date, inclusive, to end the search for results
     */
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    /**
     * getTimerange
     * </p>
     * Get the timerange of the search results
     *
     * @return timerange - the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     */
    public String getTimerange() {
        return timerange;
    }

    /**
     * setTimerange
     * </p>
     * Set the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     * TODO - Consider an enumeration if not the removal of this field altogether
     *
     * @param timerange - the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     */
    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    /**
     * groupByFields
     * </p>
     * Used to limit possibilities for group by field input
     */
    private enum groupByFields {
        year,
        month,
        week,
        day,
        hour,
        quarter,
        card,
        cardGroup,
        merchant,
        merchantGroup
    }
}
