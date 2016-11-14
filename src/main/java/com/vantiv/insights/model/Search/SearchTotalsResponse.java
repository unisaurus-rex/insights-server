package com.vantiv.insights.model.Search;

/**
 * SearchTotalResponse
 * <p>
 * Is a SearchResult with totals of all data points
 * - volume
 * - spend
 * - interchange
 * - surcharge
 *
 * @see com.vantiv.insights.model.Search.SearchResult
 */
public class SearchTotalsResponse {

    /**
     * groupBy
     * </p>
     * These fields are used in the query to limit the columns returned for results
     */
    private GroupBy[] groupBy;
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    private SearchResultTotals[] searchResults;
    /**
     * totalSearchResults
     * </p>
     * The total number of results returned on this search
     */
    private Integer totalSearchResults;
    /**
     * limit
     * </p>
     * The number of results returned on the specific request which is a subset of the total
     * number of results returned on this search. If the
     * offset = 0, and limit is 10, then the 0-9th results are returned.
     * Should come in request URL parameter 'limit'.
     */
    private Integer limit;
    /**
     * offset
     * </p>
     * The initial index of the 'limit' results returned on this specific request. If the
     * offset = 0, and limit is 10, then the 0-9th results are returned.
     * Should come in request URL parameter 'offset'.
     */
    private Integer offset;
    /**
     * startDate
     * </p>
     * The initial date to begin pulling search results, is inclusive
     */
    private String startDate;
    /**
     * endDate
     * </p>
     * The final date to begin pulling search results, is inclusive
     */
    private String endDate;
    /**
     * timeframe
     * </p>
     * The timeframe that search results are grouped by, ie. year, month, week, day, hour, quarter
     */
    private String timeframe;

    /**
     * SearchTotalsResponse
     * </p>
     * Used to create a SearchTotalsResponse Object with zero search results
     */
    public SearchTotalsResponse() {
        this.groupBy = new GroupBy[0];
        this.searchResults = new SearchResultTotals[0];
        this.totalSearchResults = 0;
        this.limit = null;
        this.offset = null;
        this.startDate = null;
        this.endDate = null;
    }

    /**
     * getGroupBy
     * </p>
     * Returns the contents of the group by field
     *
     * @return groupBy
     */
    public GroupBy[] getGroupBy() {
        return groupBy;
    }

    /**
     * setGroupBy
     * </p>
     * Populates the group by field, with the contents of the passed in Array
     *
     * @param groupBy - Array of fields to be used to narrow search scope
     */
    public void setGroupBy(GroupBy[] groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResultTotals[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResultTotals
     *
     * @param searchResults - results of a search on data points volume, spend, interchange, surcharge
     */
    public void setSearchResults(SearchResultTotals[] searchResults) {
        this.searchResults = searchResults;
    }

    /**
     * getTotalSearchResults
     * </p>
     * Returns the total number of results for the search request provided. This number
     * may be equal to or greater than limit, which is the actual number of results return in the response
     * to the client
     *
     * @return totalSearchResults
     */
    public Integer getTotalSearchResults() {
        return totalSearchResults;
    }

    /**
     * setTotalSearchResults
     * </p>
     * Sets the total number of results for the search request provided
     *
     * @param totalSearchResults - is the number of results for the search request provided. This number
     *                           may be equal to or greater than limit, which is the actual number of results return in the response
     *                           to the client
     */
    public void setTotalSearchResults(Integer totalSearchResults) {
        this.totalSearchResults = totalSearchResults;
    }

    /**
     * getLimit
     * </p>
     * Limit is the number of results returned in the response to the client may be equal or
     * less than the totalSearchResults
     *
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * setLimit
     * </p>
     * Sets the number of results returned in the response to the client may be equal or
     * less than the totalSearchResults.
     *
     * @param limit - the number of results returned to the client
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * getOffset
     * </p>
     * Returns the offset index from which our 'limit' results were pulled, an offset of
     * 0 means to pull from the first result
     *
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * setOffset
     * </p>
     * Sets the offset index from which our 'limit' results were pulled, an offset of
     * 0 means to pull from the first result
     *
     * @param offset - initial index to pull results from
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * getStartDate
     * </p>
     * Returns the start date as a DateTime object
     *
     * @return startDate - initial date, inclusive, to begin search for results
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * setStartDate
     * </p>
     * Set the start date to begin search for results
     *
     * @param startDate - initial date, inclusive, to begin search for results
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * getEndDate
     * </p>
     * Returns the end date to end search for results
     *
     * @return endDate - final date, inclusive, to end search for results
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * setEndDate
     * </p>
     * Set the end date to end the search for results
     *
     * @param endDate - final date, inclusive, to end the search for results
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * getTimeframe
     * </p>
     * Get the timeframe of the search results
     *
     * @return timeframe - the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     */
    public String getTimeframe() {
        return timeframe;
    }

    /**
     * setTimeframe
     * </p>
     * Set the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     * TODO - Consider an enumeration if not the removal of this field altogether
     *
     * @param timeframe - the range of time that the results are group by, ie. year, month, week, day, hour, quarter
     */
    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }
}
