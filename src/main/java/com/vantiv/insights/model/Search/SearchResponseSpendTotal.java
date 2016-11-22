package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResponseSpendTotal
 * <p>
 * Is a SearchResult with totals of all data points
 * - spend
 *
 * @see com.vantiv.insights.model.Search.SearchResult
 */
public class SearchResponseSpendTotal extends SearchResponse<SearchResultSpendTotal> {
    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResultSpendTotal[] searchResults;

    public SearchResponseSpendTotal() {
        super();
        this.searchResults = new SearchResultSpendTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResultSpendTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResponseSpendTotal
     *
     * @param searchResults - results of a search on data points spend
     */
    public void setSearchResults(SearchResultSpendTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
