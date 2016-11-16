package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResultInterchangeTotal
 * </p>
 * Is a search result containing the common SearchResult fields and
 * the data points
 * - interchange
 *
 * @see SearchResult
 */
public class SearchResultInterchangeTotal extends SearchResult {
    /**
     * interchange
     * </p>
     * Total interchange for given search result
     */
    @NotNull
    private Double interchange;


    /**
     * SearchResultInterchangeTotal
     * </p>
     * Sets all SearchResultInterchangeTotal fields (including super class SearchResult fields) to null
     */
    public SearchResultInterchangeTotal() {
        super();
        this.interchange = null;
    }
}
