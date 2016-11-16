package com.vantiv.insights.model.Search;

import javax.validation.constraints.NotNull;

/**
 * SearchResultTotals
 * </p>
 * Is a search result containing the common SearchResult fields and
 * the data points
 * - volume
 * - spend
 * - interchange
 * - surcharge
 *
 * @see com.vantiv.insights.model.Search.SearchResult
 */
public class SearchResultTotals extends SearchResult {
    // these fields will come from db, api, or some other such place

    /**
     * volume
     * </p>
     * Total volume for given search result
     */
    @NotNull
    private Double volume;
    /**
     * spend
     * </p>
     * Total spend (amount spent) for given search result
     */
    @NotNull
    private Double spend;
    /**
     * surcharge
     * </p>
     * Total surcharge for given search result
     */
    @NotNull
    private Double surcharge;
    /**
     * interchange
     * </p>
     * Total interchange for a given search result
     */
    @NotNull
    private Double interchange;

    /**
     * SearchResultTotals
     * </p>
     * Sets all SearchResultTotals fields (including super class SearchResult fields) to null
     */
    public SearchResultTotals() {
        super();
        this.interchange = null;
        this.spend = null;
        this.surcharge = null;
        this.volume = null;
    }

    /**
     * getVolume
     * </p>
     * Returns the volume for the current search result
     *
     * @return volume
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * setVolume
     * </p>
     * Set the volume for the current search result
     *
     * @param volume volume for the current result
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    /**
     * getSpend
     * </p>
     * Return the spend for the current search result
     *
     * @return spend
     */
    public Double getSpend() {
        return spend;
    }

    /**
     * setSpend
     * </p>
     * Set the spend for the current result
     *
     * @param spend spend for the current result
     */
    public void setSpend(Double spend) {
        this.spend = spend;
    }

    /**
     * getSurcharge
     * </p>
     * Returns the surcharge for the current result
     *
     * @return surcharge
     */
    public Double getSurcharge() {
        return surcharge;
    }

    /**
     * setSurcharge
     * </p>
     * Sets the surcharge for the current result
     *
     * @param surcharge surcharge for the current result
     */
    public void setSurcharge(Double surcharge) {
        this.surcharge = surcharge;
    }

    /**
     * getInterchange
     * </p>
     * Returns the interchange for the current result
     *
     * @return interchange
     */
    public Double getInterchange() {
        return interchange;
    }

    /**
     * setInterchange
     * </p>
     * Set the interchange for the current result
     *
     * @param interchange interchange for the current result
     */
    public void setInterchange(Double interchange) {
        this.interchange = interchange;
    }

}
