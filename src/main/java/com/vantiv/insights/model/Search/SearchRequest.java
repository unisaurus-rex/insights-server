package com.vantiv.insights.model.Search;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * SearchResult
 * </p>
 * All search requests will have this basic structure
 */
public final class SearchRequest {
    /**
     * groupBy
     * </p>
     * Columns/specific resources to search on
     */
    @NotNull
    private Set<GroupBy> groupBy;
    /**
     * startDate
     * </p>
     * Initial date of date range to search for results in, is inclusive
     */
    @NotNull
    @DateTimeFormat
    private DateTime startDate;
    /**
     * endDate
     * </p>
     * Final date of date range to search for results in, is inclusive
     */
    @NotNull
    @DateTimeFormat
    private DateTime endDate;
    /**
     * timeframe
     * </p>
     * Timeframe that search results are grouped by ie. year, month, week, day, hour, quarter
     */
//    @Pattern (regexp = "^[0-9]$") // just playing with @Pattern annotation
    private String timeframe;
    /**
     * limit
     * </p>
     * Maximum count/number of results to be returned. Is ignored in the message body, expected on the URL query string
     */
    @JsonIgnore
    private Integer limit;
    /**
     * offset
     * </p>
     * Index of first result returned. Is ignored in the message body, expected on the URL query string
     */
    @JsonIgnore
    private Integer offset;

    /**
     * SearchRequest
     * </p>
     * Generic search request.
     * groupBy fields to narrow search scope
     * dateRange a date range to search within for results
     * dateRange.startDate the initial date, inclusive, to begin search for results
     * dateRange.endDate the final date, includive, to end the search for results
     * timeframe TODO this may be an unnecessary field that should be removed.
     */
    public SearchRequest() {
        this.groupBy = null;
        this.startDate = null;
        this.endDate = null;
        this.timeframe = null;
    }

    /**
     * SearchRequest
     * </p>
     * Generic search request.
     * groupBy fields to narrow search scope
     * dateRange a date range to search within for results
     * dateRange.startDate the initial date, inclusive, to begin search for results
     * dateRange.endDate the final date, includive, to end the search for results
     * timeframe TODO this may be an unnecessary field that should be removed.
     */
    public SearchRequest(GroupBy[] groupBy, String startDate, String endDate, String timeframe) {
        this.groupBy = new HashSet<>(Arrays.asList(groupBy));
        this.startDate = new DateTime(startDate, DateTimeZone.UTC);
        this.endDate = new DateTime(endDate, DateTimeZone.UTC);
        this.timeframe = timeframe;
    }


    /**************************************/
    /**Testing Grounds**/
    /**************************************/

    /**
     * getGroupBy
     * </p>
     * Returns the contents of the group by field
     *
     * @return groupBy
     */
    public GroupBy[] getGroupBy() {
        if (groupBy == null) {
            return new GroupBy[0];
        }
        return groupBy.toArray(new GroupBy[groupBy.size()]);
    }

    /**
     * setGroupBy
     * </p>
     * Populates the group by field, with the contents of the passed in Array
     *
     * @param groupBy Array of fields to be used to narrow search scope
     */
    public void setGroupBy(GroupBy[] groupBy) {
        this.groupBy = new HashSet<>(Arrays.asList(groupBy));
    }

    /**
     * getStartDate
     * </p>
     * Returns the start date as a DateTime object
     *
     * @return startDate initial date, inclusive, to begin search for results
     */
    public DateTime getStartDate() {
        return startDate;
    }

    /**
     * setStartDate
     * </p>
     * Set the start date to begin search for results
     *
     * @param startDate initial date, inclusive, to begin search for results
     */
    public void setStartDate(String startDate) {
        this.startDate = new DateTime(startDate, DateTimeZone.UTC);
    }

    /**
     * getEndDate
     * </p>
     * Returns the end date to end search for results
     *
     * @return endDate final date, inclusive, to end search for results
     */
    public DateTime getEndDate() {
        return endDate;
    }

    /**
     * setEndDate
     * </p>
     * Set the end date to end the search for results
     *
     * @param endDate final date, inclusive, to end the search for results
     */
    public void setEndDate(String endDate) {
        this.endDate = new DateTime(endDate, DateTimeZone.UTC);
    }

    /**
     * getTimeframe
     * </p>
     * Get the timeframe of the search results
     *
     * @return timeframe the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     */
    public String getTimeframe() {
        return timeframe;
    }

    /**
     * setTimeframe
     * </p>
     * Set the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     * TODO Consider an enumeration if not the removal of this field altogether
     *
     * @param timeframe the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     */
    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    /**
     * getLimit
     * </p>
     * Returns the limit (count of search results) returned on this specific request, may be
     * equal to or lesser than the total number of search results for requested query
     *
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * setLimit
     * </p>
     * Sets the maximum number of results to be returned on this specific request
     *
     * @param limit the maximum count(total) results to return to the client
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * getOffset
     * </p>
     * Returns the index of the first search result returned
     *
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * setOffset
     * </p>
     * Sets the index of the first search result returned to the client
     *
     * @param offset the index of the first search result
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
