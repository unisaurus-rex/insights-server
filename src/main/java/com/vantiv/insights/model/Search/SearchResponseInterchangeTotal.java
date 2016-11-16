package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 *
 */
public class SearchResponseInterchangeTotal extends SearchResponse {
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResponseInterchangeTotal[] searchResults;

    public SearchResponseInterchangeTotal() {
        super();
        this.searchResults = new SearchResponseInterchangeTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResponseInterchangeTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResponseInterchangeTotal
     *
     * @param searchResults - results of a search on data points interchange
     */
    public void setSearchResults(SearchResponseInterchangeTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
