package com.vantiv.insights.lib;

import com.vantiv.insights.model.Search.SearchRequest;
import com.vantiv.insights.model.Search.SearchResultTotals;
import com.vantiv.insights.model.Search.SearchTotalsResponse;

/**
 * Library of helper functions for the search operation
 */
public class Search {
    /**
     * getTotalsSummary
     * </p>
     * Assigns search results and other search totals response body values
     * @param searchRequest - the parsed incoming search request content
     * @return searchTotalsResponse
     */
    public static SearchTotalsResponse getTotalsSummary (SearchRequest searchRequest) {


        // keep response fields consistent with request fields of the same
        SearchTotalsResponse searchTotalsResponse = new SearchTotalsResponse();
        searchTotalsResponse.setGroupBy(searchRequest.getGroupBy());
        searchTotalsResponse.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchTotalsResponse.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchTotalsResponse.setTimeframe(searchRequest.getTimeframe());
        searchTotalsResponse.setLimit(searchRequest.getLimit());
        searchTotalsResponse.setOffset(searchRequest.getOffset());

        //TODO get searchResults needs to call to db to get search results
        //BSDAO bsdao;  //get from Spring Context ??//
        SearchResultTotals[] searchResults;

        return searchTotalsResponse;
    }
}
