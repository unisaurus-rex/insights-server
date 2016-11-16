package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResultSurchargeTotal
 * </p>
 * Is a search result containing the common SearchResult fields and
 * the data points
 * - surcharge
 *
 * @see SearchResult
 */
public class SearchResultSurchargeTotal extends SearchResult {
    /**
     * surcharge
     * </p>
     * Total surcharge for given search result
     */
    @NotNull
    private Double surcharge;


    /**
     * SearchResultSurchargeTotal
     * </p>
     * Sets all SearchResultSurchargeTotal fields (including super class SearchResult fields) to null
     */
    public SearchResultSurchargeTotal() {
        super();
        this.surcharge = null;
    }
}
