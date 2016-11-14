package com.vantiv.insights.lib;

import com.vantiv.insights.model.Search.SearchRequest;
import com.vantiv.insights.model.Search.SearchResponseTotals;
import com.vantiv.insights.model.Search.SearchResultTotals;

/**
 * Library of helper functions for the search operation
 */
public class Search {
    /**
     * getTotalsSummary
     * </p>
     * Assigns search results and other search totals response body values
     * @param searchRequest - the parsed incoming search request content
     * @return searchResponseTotals
     */
    public static SearchResponseTotals getTotalsSummary (SearchRequest searchRequest) {


        // keep response fields consistent with request fields of the same
        SearchResponseTotals searchResponseTotals = new SearchResponseTotals();
        searchResponseTotals.setGroupBy(searchRequest.getGroupBy());
        searchResponseTotals.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchResponseTotals.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchResponseTotals.setTimeframe(searchRequest.getTimeframe());
        searchResponseTotals.setLimit(searchRequest.getLimit());
        searchResponseTotals.setOffset(searchRequest.getOffset());

        //TODO get searchResults needs to call to db to get search results
        //BSDAO bsdao;  //get from Spring Context ??//
        SearchResultTotals[] searchResults;

        return searchResponseTotals;
    }
}
