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
public class SearchResponseTotals extends SearchResponse {

    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    private SearchResultTotals[] searchResults;

    /**
     * SearchResponseTotals
     * </p>
     * Used to create a SearchResponseTotals Object with zero search results
     */
    public SearchResponseTotals() {
        super();
        this.searchResults = new SearchResultTotals[0];
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

}
