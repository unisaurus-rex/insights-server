package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 *
 */
public class SearchResponseSurchargeTotal extends SearchResponse {
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResponseSurchargeTotal[] searchResults;

    public SearchResponseSurchargeTotal() {
        super();
        this.searchResults = new SearchResponseSurchargeTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResponseSurchargeTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResponseSurchargeTotal
     *
     * @param searchResults - results of a search on data points surcharge
     */
    public void setSearchResults(SearchResponseSurchargeTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
