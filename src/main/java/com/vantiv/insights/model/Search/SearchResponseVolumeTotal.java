package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 *
 */
public class SearchResponseVolumeTotal extends SearchResponse {

    /**
     * searchResults
     * </p>
     * Is the array of the search results from the query for the requested fields and constraints
     */
    @NotNull
    private SearchResultVolumeTotal[] searchResults;

    public SearchResponseVolumeTotal() {
        super();
        this.searchResults = new SearchResultVolumeTotal[0];
    }

    /**
     * getSearchResults
     * </p>
     * Returns the array of search results
     *
     * @return searchResults - contents are the result of search request search parameters
     */
    public SearchResultVolumeTotal[] getSearchResults() {
        return searchResults;
    }

    /**
     * setSearchResults
     * </p>
     * Sets the search results with the given array of SearchResultVolumeTotal
     *
     * @param searchResults - results of a search on data points volume
     */
    public void setSearchResults(SearchResultVolumeTotal[] searchResults) {
        this.searchResults = searchResults;
    }
}
