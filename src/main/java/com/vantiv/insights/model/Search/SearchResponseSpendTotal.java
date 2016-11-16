package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 *
 */
public class SearchResponseSpendTotal extends SearchResponse {
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResponseSpendTotal[] searchResults;

    public SearchResponseSpendTotal() {
        super();
        this.searchResults = new SearchResponseSpendTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResponseSpendTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResponseSpendTotal
     *
     * @param searchResults - results of a search on data points spend
     */
    public void setSearchResults(SearchResponseSpendTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
