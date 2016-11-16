package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResultVolumeTotal
 * </p>
 * Is a search result containing the common SearchResult fields and
 * the data points
 * - volume
 *
 * @see com.vantiv.insights.model.Search.SearchResult
 */
public class SearchResultVolumeTotal extends SearchResult {
    /**
     * volume
     * </p>
     * Total volume for given search result
     */
    @NotNull
    private Double volume;


    /**
     * SearchResultVolumeTotal
     * </p>
     * Sets all SearchResultVolumeTotal fields (including super class SearchResult fields) to null
     */
    public SearchResultVolumeTotal() {
        super();
        this.volume = null;
    }
}
