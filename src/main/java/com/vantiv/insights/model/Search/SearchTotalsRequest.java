package com.vantiv.insights.model.Search;

import org.joda.time.DateTime;

/**
 *
 */
public class SearchTotalsRequest {
    private String[] groupBy;
    private DateRange dateRange;
    private String timerange;

    /**
     * Internal classes
     */
    private class DateRange {
        DateTime startDate;
        DateTime endDate;
    }
}
