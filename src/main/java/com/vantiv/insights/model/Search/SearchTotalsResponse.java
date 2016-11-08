package com.vantiv.insights.model.Search;

/**
 *
 */
public class SearchTotalsResponse {

    private SearchTotalsResponseResult[] searchTotalsResponseResults;

    private Integer totalSearchResults;

    public SearchTotalsResponse(){
        final int dimension = 10;
        this.searchTotalsResponseResults = new SearchTotalsResponseResult[dimension];

        for (int i = 0; i < dimension; ++i) {
            this.searchTotalsResponseResults[i] = new SearchTotalsResponseResult();
        }

        this.totalSearchResults = this.searchTotalsResponseResults.length;
    }

    public SearchTotalsResponseResult[] getSearchTotalsResponseResults() {
        return searchTotalsResponseResults;
    }

    public void setSearchTotalsResponseResults(SearchTotalsResponseResult[] searchTotalsResponseResults) {
        this.searchTotalsResponseResults = searchTotalsResponseResults;
    }


    public Integer getTotalSearchResults() {
        return totalSearchResults;
    }

    public void setTotalSearchResults(Integer totalSearchResults) {
        this.totalSearchResults = totalSearchResults;
    }

    // will come from db, api, etc.
    private class SearchTotalsResponseResult {
        private Double volume;
        private Double spend;
        private Double surcharge;
        private Double interchange;

        public SearchTotalsResponseResult() {
            this.interchange = 0.0;
            this.spend = 0.0;
            this.surcharge = 0.0;
            this.volume = 0.0;
        }

        public Double getVolume() {
            return volume;
        }

        public void setVolume(Double volume) {
            this.volume = volume;
        }

        public Double getSpend() {
            return spend;
        }

        public void setSpend(Double spend) {
            this.spend = spend;
        }

        public Double getSurcharge() {
            return surcharge;
        }

        public void setSurcharge(Double surcharge) {
            this.surcharge = surcharge;
        }

        public Double getInterchange() {
            return interchange;
        }

        public void setInterchange(Double interchange) {
            this.interchange = interchange;
        }

    }
}
