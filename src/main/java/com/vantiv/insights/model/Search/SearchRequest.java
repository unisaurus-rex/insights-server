package com.vantiv.insights.model.Search;

import org.joda.time.DateTime;

/**
 * Created by U999716 on 11/7/2016.
 */
public class SearchRequest {
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
