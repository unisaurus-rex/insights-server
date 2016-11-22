package com.vantiv.insights.lib;

import com.vantiv.insights.model.Search.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.validation.BindingResult;

/**
 * Library of helper functions for the search operation
 */
public final class Search {

    /**
     * getTotals
     * </p>
     * Assigns search results and other search totals response body values
     *
     * @param searchRequest the parsed incoming search request content
     * @return searchResponse
     */
    public static SearchResponse getTotals(SearchRequest searchRequest) {
        // keep response fields consistent with request fields of the same
        SearchResponse searchResponse = new SearchResponseTotals();
        searchResponse.setGroupBy(searchRequest.getGroupBy());
        searchResponse.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchResponse.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchResponse.setTimeframe(searchRequest.getTimeframe());
        searchResponse.setLimit(searchRequest.getLimit());
        searchResponse.setOffset(searchRequest.getOffset());

        //TODO get searchResults needs to call to db to get search results
        //BSDAO bsdao;  //get from Spring Context ??//
        Integer dimension = 2;
        SearchResultTotals[] searchResults = new SearchResultTotals[0]; // empty array
        /**************   Hardcoded Search Results ***********************/
        SearchResultTotals searchResult1 = new SearchResultTotals();
        DateTime today1 = new DateTime(DateTimeZone.UTC);
        searchResult1.setInterchange(1.00);
        searchResult1.setSpend(20.00);
        searchResult1.setSurcharge(5.00);
        searchResult1.setVolume(10.00);
        searchResult1.setCard("Visa");
        searchResult1.setCardGroup("VisaGroup");
        searchResult1.setDate(today1.toLocalDate().toString());
        searchResult1.setDay(String.valueOf(today1.getDayOfWeek()));
        searchResult1.setHour(String.valueOf(today1.getHourOfDay()));
        searchResult1.setMerchant("Amerchant");
        searchResult1.setMerchantGroup("AMerchantGroup");
        searchResult1.setMonth(String.valueOf(today1.getMonthOfYear()));
        Integer quarter1 = Utils.monthToQuarter(today1.getMonthOfYear());
        searchResult1.setQuarter(quarter1.toString());
        searchResult1.setWeek(String.valueOf(today1.getWeekOfWeekyear()));
        searchResult1.setYear(String.valueOf(today1.getYear()));

        SearchResultTotals searchResult2 = new SearchResultTotals();
        DateTime today2 = new DateTime(DateTimeZone.UTC).plusMonths(3);
        searchResult2.setInterchange(90.00);
        searchResult2.setSpend(100.07);
        searchResult2.setSurcharge(578.01);
        searchResult2.setVolume(178.00);
        searchResult2.setCard("MasterCard");
        searchResult2.setCardGroup("MasterCardGroup");
        searchResult2.setDate(today2.toLocalDate().toString());
        searchResult2.setDay(String.valueOf(today2.getDayOfWeek()));
        searchResult2.setHour(String.valueOf(today2.getHourOfDay()));
        searchResult2.setMerchant("SomeMerchant");
        searchResult2.setMerchantGroup("SomeMerchantGroup");
        searchResult2.setMonth(String.valueOf(today2.getMonthOfYear()));
        Integer quarter2 = Utils.monthToQuarter(today2.getMonthOfYear());
        searchResult2.setQuarter(quarter2.toString());
        searchResult2.setWeek(String.valueOf(today2.getWeekOfWeekyear()));
        searchResult2.setYear(String.valueOf(today2.getYear()));

        searchResults = new SearchResultTotals[dimension];
        searchResults[0] = searchResult1;
        searchResults[1] = searchResult2;

        searchResponse.setTotalSearchResults(2);
        searchResponse.setLimit(2);   // shows all 2 / 2 results
        searchResponse.setOffset(0);  // offset = 0, so results 0 and 1 are are returned
        /********************* END **************************/

        //Set the searchResults content once marshalled how we want it
        searchResponse.setSearchResults(searchResults);
////////////////////////////////////////////////////////////////////////////////
// Reflection Play
// set only the groupBY fields passed in, others were note asked for
//        Class<?> c = searchResponse.getClass();
//        Method method = c.getMethod("getGroupBy");
//        GroupBy[] groupByFields = (GroupBy[]) method.invoke(searchResponse);
//        for(GroupBy groupByField: groupByFields) {
//            // TODO Use the similar to get correct setter method for given group by field
//            String methodName = "set" + (groupByField.toString().substring(0,1)).toUpperCase() + groupByField.toString().substring(1);
////            System.out.println((String) c.getMethod(methodName).invoke(searchResponse, "OYEAH!!!"));  // fields need to be set with appropriate data values
//        }
////////////////////////////////////////////////////////////////////////////////////
        return searchResponse;
    }

    /**
     * getVolumeTotal
     * </p>
     * Assigns search results and other search volume totals response body values
     *
     * @param searchRequest the parsed incoming search request content
     * @return searchResponse
     */
    public static SearchResponse getVolumeTotal(SearchRequest searchRequest){
        SearchResponse searchResponse = new SearchResponseVolumeTotal();

        searchResponse.setGroupBy(searchRequest.getGroupBy());
        searchResponse.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchResponse.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchResponse.setTimeframe(searchRequest.getTimeframe());
        searchResponse.setLimit(searchRequest.getLimit());
        searchResponse.setOffset(searchRequest.getOffset());

        // TODO DO STUFF

        return searchResponse;
    }

    /**
     * getSpendTotal
     * </p>
     * Assigns search results and other search spend totals response body values
     *
     * @param searchRequest the parsed incoming search request content
     * @return searchResponse
     */
    public static SearchResponse getSpendTotal(SearchRequest searchRequest){
        SearchResponse searchResponse = new SearchResponseSpendTotal();

        searchResponse.setGroupBy(searchRequest.getGroupBy());
        searchResponse.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchResponse.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchResponse.setTimeframe(searchRequest.getTimeframe());
        searchResponse.setLimit(searchRequest.getLimit());
        searchResponse.setOffset(searchRequest.getOffset());

        // TODO DO STUFF

        return searchResponse;
    }

    /**
     * getInterchangeTotal
     * </p>
     * Assigns search results and other search interchange totals response body values
     *
     * @param searchRequest the parsed incoming search request content
     * @return searchResponse
     */
    public static SearchResponse getInterchangeTotal(SearchRequest searchRequest){
        SearchResponse searchResponse = new SearchResponseInterchangeTotal();

        searchResponse.setGroupBy(searchRequest.getGroupBy());
        searchResponse.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchResponse.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchResponse.setTimeframe(searchRequest.getTimeframe());
        searchResponse.setLimit(searchRequest.getLimit());
        searchResponse.setOffset(searchRequest.getOffset());

        // TODO DO STUFF

        return searchResponse;
    }

    /**
     * getSurchargeTotal
     * </p>
     * Assigns search results and other search surcharge totals response body values
     *
     * @param searchRequest the parsed incoming search request content
     * @return searchResponse
     */
    public static SearchResponse getSurchargeTotal(SearchRequest searchRequest){
        SearchResponse searchResponse = new SearchResponseSurchargeTotal();

        searchResponse.setGroupBy(searchRequest.getGroupBy());
        searchResponse.setStartDate(searchRequest.getStartDate().toLocalDateTime().toString());
        searchResponse.setEndDate(searchRequest.getEndDate().toLocalDateTime().toString());
        searchResponse.setTimeframe(searchRequest.getTimeframe());
        searchResponse.setLimit(searchRequest.getLimit());
        searchResponse.setOffset(searchRequest.getOffset());

        // TODO DO STUFF

        return searchResponse;
    }

}
