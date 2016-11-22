package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResponseSurchargeTotal
 * <p>
 * Is a SearchResult with totals of all data points
 * - surcharge
 *
 * @see com.vantiv.insights.model.Search.SearchResult
 */
public class SearchResponseSurchargeTotal extends SearchResponse<SearchResultSurchargeTotal> {
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResultSurchargeTotal[] searchResults;

    public SearchResponseSurchargeTotal() {
        super();
        this.searchResults = new SearchResultSurchargeTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResultSurchargeTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResponseSurchargeTotal
     *
     * @param searchResults - results of a search on data points surcharge
     */
    public void setSearchResults(SearchResultSurchargeTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
