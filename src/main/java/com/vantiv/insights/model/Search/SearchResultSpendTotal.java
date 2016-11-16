package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResultSpendTotal
 * </p>
 * Is a search result containing the common SearchResult fields and
 * the data points
 * - volume
 *
 * @see SearchResult
 */
public class SearchResultSpendTotal extends SearchResult {
    /**
     * spend
     * </p>
     * Total volume for given search result
     */
    @NotNull
    private Double spend;


    /**
     * SearchResultSpendTotal
     * </p>
     * Sets all SearchResultSpendTotal fields (including super class SearchResult fields) to null
     */
    public SearchResultSpendTotal() {
        super();
        this.spend = null;
    }
}
