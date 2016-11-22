package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResponseInterchangeTotal
 * <p>
 * Is a SearchResult with totals of all data points
 * - interchange
 *
 * @see com.vantiv.insights.model.Search.SearchResult
 */
public class SearchResponseInterchangeTotal extends SearchResponse<SearchResultInterchangeTotal> {
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResultInterchangeTotal[] searchResults;

    public SearchResponseInterchangeTotal() {
        super();
        this.searchResults = new SearchResultInterchangeTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResultInterchangeTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResponseInterchangeTotal
     *
     * @param searchResults - results of a search on data points interchange
     */
    public void setSearchResults(SearchResultInterchangeTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
